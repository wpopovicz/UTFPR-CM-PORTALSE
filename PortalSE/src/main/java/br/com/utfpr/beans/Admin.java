/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.utfpr.beans;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author willian
 */
@Entity
public class Admin implements Serializable{
    @Id
    private int id;
    private String nome,senha,email;
}
