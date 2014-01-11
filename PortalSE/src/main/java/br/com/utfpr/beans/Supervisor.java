/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.utfpr.beans;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author willian
 */
@Entity
public class Supervisor implements Serializable {    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ID;
    private String nome, senha, email;
    @OneToMany(mappedBy = "supervisor")
    private List<Oficina> oficinas;

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }
}
