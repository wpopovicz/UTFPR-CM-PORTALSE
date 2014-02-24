/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.utfpr.controle;

import br.com.utfpr.beans.Administrador;
import br.com.utfpr.model.Dao;
import java.util.List;


/**
 *
 * @author Carlos
 */
public class ControleAdmin {
    private Administrador admin;
    private Dao<Administrador> dao;

       public ControleAdmin(){
        this.dao = new Dao(Administrador.class);
        this.admin = new Administrador();
    }
    
    public Administrador getAdmin() {
        return admin;
    }

    public void setCliente(Administrador admin) {
        this.admin = admin;
    }

    public Dao getAdminDao() {
        return dao;
    }

    public void setAdminDao(Dao dao) {
        this.dao = dao;
    }
    
    
    public Administrador buscarPorId(long id){
        return this.dao.buscaPorId(id);
    }
    
    
    public List listaTodos(){
        return this.dao.listaTodos();
    }  
    
    
    public void adiciona(Administrador admin){
        this.dao.adiciona(admin);
    }
    public void update(Administrador admin){
        this.dao.update(admin);
    }  
    
    public void remove(Administrador admin){
        this.dao.remove(admin);
    }    
     public void removePorId(long id){
        this.dao.removePorId(id);
    }    
}