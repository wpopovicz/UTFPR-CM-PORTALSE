/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.utfpr.model;

import br.com.utfpr.beans.Oficina;

/**
 *
 * @author willian
 */
public class DaoOficina extends HibernateDao<Oficina>{
    public DaoOficina() {
        clazz = Oficina.class;
    }   
}
