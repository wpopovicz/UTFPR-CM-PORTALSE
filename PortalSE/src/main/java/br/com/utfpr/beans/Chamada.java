/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.utfpr.beans;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author Acer
 */
@Entity
public class Chamada implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    @ManyToOne
    private Oficina oficina;
    public enum EstadoChamada {PRESENTE, AUSENTE, ATESTADO};
    private EstadoChamada estado;

    public Chamada() {
    }

    public Oficina getOficina() {
        return oficina;
    }

    public void setOficina(Oficina oficina) {
        this.oficina = oficina;
    }

    public EstadoChamada getEstado() {
        return estado;
    }

    public void setEstado(EstadoChamada estado) {
        this.estado = estado;
    }    
    
    
    public Long getID() {
        return Id;
    }

    public void setID(Long ID) {
        this.Id = ID;
    }
    
}
