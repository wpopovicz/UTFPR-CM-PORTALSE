/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.utfpr.controle;

import br.com.utfpr.beans.Oficina;
import br.com.utfpr.model.Dao;
import java.util.List;


/**
 *
 * @author Carlos
 */
public class ControleOficina {
    private Oficina oficina;
    private Dao<Oficina> dao;

       public ControleOficina(){
        this.dao = new Dao(Oficina.class);
        this.oficina = new Oficina();
    }
    
    public Oficina getOficina() {
        return oficina;
    }

    public void setOficina(Oficina oficina) {
        this.oficina = oficina;
    }

    public Dao getOficinaDao() {
        return dao;
    }

    public void setOficinaDao(Dao dao) {
        this.dao = dao;
    }
    
    
    public Oficina buscarPorId(long id){
        return this.dao.buscaPorId(id);
    }
    
    
    public List listaTodos(){
        return this.dao.listaTodos();
    }  
    
    
    public void adiciona(Oficina oficina){
        this.dao.adiciona(oficina);
    }
    public void update(Oficina oficina){
        this.dao.update(oficina);
    }  
    
    public void remove(Oficina oficina){
        this.dao.remove(oficina);
    }    
     public void removePorId(long id){
        this.dao.removePorId(id);
    }    
}