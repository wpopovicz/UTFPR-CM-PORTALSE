/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.utfpr.controle;

import br.com.utfpr.beans.Professor;
import br.com.utfpr.model.Dao;
import java.util.List;


/**
 *
 * @author Ronaldo
 */
public class ControleProfessor {
    private Professor pessoa;
    private Dao<Professor> dao;

       public ControleProfessor(){
        this.dao = new Dao(Professor.class);
        this.pessoa = new Professor();
    }
    
    public Professor getProfessor() {
        return pessoa;
    }

    public void setProfessor(Professor professor) {
        this.pessoa = professor;
    }

    public Dao getProfessorDao() {
        return dao;
    }

    public void setProfessorDao(Dao dao) {
        this.dao = dao;
    }
    
    
    public Professor buscarPorId(long id){
        return this.dao.buscaPorId(id);
    }
    
    
    public List listaTodos(){
        return this.dao.listaTodos();
    }  
    
    
    public void adiciona(Professor professor){
        this.dao.adiciona(professor);
    }
    public void update(Professor professor){
        this.dao.update(professor);
    }  
    
    public void remove(Professor professor){
        this.dao.remove(pessoa);
    }    
     public void removePorId(long id){
        this.dao.removePorId(id);
    }    
}