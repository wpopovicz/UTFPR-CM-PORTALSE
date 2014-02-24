package br.com.utfpr.controle;

import br.com.utfpr.beans.Chamada;
import br.com.utfpr.model.Dao;
import java.util.List;


/**
 *
 * @author Carlos
 */
public class ControleChamada {
    private Chamada chamada;
    private Dao<Chamada> dao;

       public ControleChamada(){
        this.dao = new Dao(Chamada.class);
        this.chamada = new Chamada();
    }
    
    public Chamada getChamada() {
        return chamada;
    }

    public void setChamada(Chamada chamada) {
        this.chamada = chamada;
    }

    public Dao getChamadaDao() {
        return dao;
    }

    public void setChamadaDao(Dao dao) {
        this.dao = dao;
    }
    
    
    public Chamada buscarPorId(long id){
        return this.dao.buscaPorId(id);
    }
    
    
    public List listaTodos(){
        return this.dao.listaTodos();
    }  
    
    
    public void adiciona(Chamada chamada){
        this.dao.adiciona(chamada);
    }
    public void update(Chamada chamada){
        this.dao.update(chamada);
    }  
    
    public void remove(Chamada chamada){
        this.dao.remove(chamada);
    }    
     public void removePorId(long id){
        this.dao.removePorId(id);
    }    
}