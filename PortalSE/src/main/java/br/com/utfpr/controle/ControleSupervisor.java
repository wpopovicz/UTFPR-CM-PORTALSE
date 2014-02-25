/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.utfpr.controle;

import br.com.utfpr.beans.Supervisor;
import br.com.utfpr.model.Dao;
import java.util.List;


/**
 *
 * @author Carlos
 */
public class ControleSupervisor {
    private Supervisor supervisor;
    private Dao<Supervisor> dao;

       public ControleSupervisor(){
        this.dao = new Dao(Supervisor.class);
        this.supervisor = new Supervisor();
    }
    
    public Supervisor getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Supervisor supervisor) {
        this.supervisor = supervisor;
    }

    public Dao getSupervisorDao() {
        return dao;
    }

    public void setSupervisorDao(Dao dao) {
        this.dao = dao;
    }
    
    
    public Supervisor buscarPorId(long id){
        return this.dao.buscaPorId(id);
    }
    
    
    public List listaTodos(){
        return this.dao.listaTodos();
    }  
    
    
    public void adiciona(Supervisor supervisor){
        this.dao.adiciona(supervisor);
    }
    public void update(Supervisor supervisor){
        this.dao.update(supervisor);
    }  
    
    public void remove(Supervisor supervisor){
        this.dao.remove(supervisor);
    }    
     public void removePorId(long id){
        this.dao.removePorId(id);
    }    
}
