/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.utfpr.model;

import br.com.utfpr.beans.Escola;

/**
 *
 * @author willian
 */
public class DaoEscola extends HibernateDao<Escola>{
    public DaoEscola() {
        clazz = Escola.class;
    }  
}
