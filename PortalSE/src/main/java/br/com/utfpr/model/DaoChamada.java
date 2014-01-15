/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.utfpr.model;

import br.com.utfpr.beans.Chamada;

/**
 *
 * @author willian
 */
public class DaoChamada extends HibernateDao<Chamada>{
    public DaoChamada() {
        clazz = Chamada.class;
    } 
}
