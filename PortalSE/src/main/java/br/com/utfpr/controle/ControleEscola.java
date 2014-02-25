/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.utfpr.controle;

import br.com.utfpr.beans.Escola;
import br.com.utfpr.model.Dao;
import java.util.List;


/**
 *
 * @author Carlos
 */
public class ControleEscola {
    private Escola escola;
    private Dao<Escola> dao;

       public ControleEscola(){
        this.dao = new Dao(Escola.class);
        this.escola = new Escola();
    }
    
    public Escola getEscola() {
        return escola;
    }

    public void setEscola(Escola escola) {
        this.escola = escola;
    }

    public Dao getEscolaDao() {
        return dao;
    }

    public void setEscolaDao(Dao dao) {
        this.dao = dao;
    }
    
    
    public Escola buscarPorId(long id){
        return this.dao.buscaPorId(id);
    }
    
    
    public List listaTodos(){
        return this.dao.listaTodos();
    }      
    
    public void adiciona(Escola escola){
        this.dao.adiciona(escola);
    }
    public void update(Escola escola){
        this.dao.update(escola);
    }  
    
    public void remove(Escola escola){
        this.dao.remove(escola);
    }    
     public void removePorId(long id){
        this.dao.removePorId(id);
    }    
}