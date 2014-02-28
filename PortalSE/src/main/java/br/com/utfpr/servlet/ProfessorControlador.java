/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.utfpr.servlet;


import br.com.utfpr.controle.ControleProfessor;
import java.util.List;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;


/**
 *
 * @author rafael
 */

@WebServlet(name = "CidadeControlador", urlPatterns = {"/cadastros/cidade/controlador"})
public class ProfessorControlador extends SuperControlador{
    
    ControleProfessor cp = new ControleProfessor();

    @Override
    public String acaoPadrao(HttpServletRequest request) {
        List professores = cp.listaTodos();
        request.setAttribute("lista", professores);
        return "lista.jsp";
    }
    
    // executa quando a acao for incluir
    public String incluir(HttpServletRequest request) {
        // lista todos os estados para montar o select na tela de cadastro de cidades
        List professores = cp.listaTodos();
        // define o atributo no contexto para poder acessar na tela do formulário
        request.setAttribute("professores", professores);
        // informa para onde deve ser redirecionado após terminar a execuçãp
        return "form.jsp";
    }
    
    // Vai ser execeutado quando a acao for salvar
    public String salvar(HttpServletRequest request){
        cp.getProfessor().setNome(request.getParameter("nome"));
        cp.getProfessor().setCpf(request.getParameter("cpf"));
        cp.getProfessor().setEmail(request.getParameter("email"));
        cp.getProfessor().setSenha(request.getParameter("senha"));
        cp.adiciona(cp.getProfessor());
        return acaoPadrao(request);
    }
    
    // função para excluir uma cidade
    public String excluir(HttpServletRequest request) {
        // receber o id da url
        Long id = Long.parseLong(request.getParameter("id"));
        // chama o método excluir do bean
        //CadastrosBean.delete(Cidade.class, id);
        // chama o método acaoPadrao que vai montar uma lista de cidades
        // e redirecionar o usuário para o lista.jsp
        return acaoPadrao(request);
    }
    
    // método para a ação alterar (vinda da url)
    public String alterar(HttpServletRequest request){
        // recebe o id da url
        Long id = Long.parseLong(request.getParameter("id"));
        // buscar a cidade que tem este id
        
        // define a cidade no contexto para ser acessada no form
       
        // lista os estados para mostrar no select
       
        // grava os estados no contexto
       
        // informa para onde deve ir
        return "form.jsp";
    }
    
}
