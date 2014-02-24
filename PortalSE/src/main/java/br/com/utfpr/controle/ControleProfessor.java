/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.utfpr.controle;

import br.com.utfpr.beans.Pessoa;
import br.com.utfpr.model.Dao;
import java.util.List;


/**
 *
 * @author Ronaldo
 */
public class ControleProfessor {
    private Pessoa pessoa;
    private Dao<Pessoa> dao;

       public ControleProfessor(){
        this.dao = new Dao(Pessoa.class);
        this.pessoa = new Pessoa();
    }
    
    public Pessoa getCliente() {
        return pessoa;
    }

    public void setCliente(Pessoa cliente) {
        this.pessoa = cliente;
    }

    public Dao getClienteDao() {
        return dao;
    }

    public void setClienteDao(Dao dao) {
        this.dao = dao;
    }
    
    
    public Pessoa buscarPorId(long id){
        return this.dao.buscaPorId(id);
    }
    
    
    public List listaTodos(){
        return this.dao.listaTodos();
    }  
    
    
    public void adiciona(Pessoa pessoa){
        this.dao.adiciona(pessoa);
    }
    public void update(Pessoa pessoa){
        this.dao.update(pessoa);
    }  
    
    public void remove(Pessoa pessoa){
        this.dao.remove(pessoa);
    }    
     public void removePorId(long id){
        this.dao.removePorId(id);
    }    
}