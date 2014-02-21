/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.utfpr.controle;

import br.com.utfpr.beans.Oficina;
import br.com.utfpr.beans.Pessoa;
import br.com.utfpr.model.HibernateDao;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;


/**
 *
 * @author willian
 */
@WebServlet(name = "professorControlador", urlPatterns = {"/professorControlador"})
public class ProfessorControlador extends SuperControlador {
    private HibernateDao hibernatedao = new HibernateDao();
    private Pessoa pessoa;
    private Oficinas oficinas;
    @Override
    public String acaoPadrao(HttpServletRequest request) {
        List oficinas = null;
        try {
            oficinas = hibernatedao.list();       
        } catch (Exception ex) {
            Logger.getLogger(ProfessorControlador.class.getName()).log(Level.SEVERE, null, ex);
        }
        request.setAttribute("lista", oficinas);
        return "listarOficinas.jsp";
    }
    public String incluir(HttpServletRequest request) {
        request.setAttribute("lista", oficinas);
        Pessoa p = new Pessoa();
        JspRuntimeLibrary.introspect(p, request);
        //aqui preciso guarda a oficina que usuario escolheu em sua lista
        return "home.jsp";
    }

}