/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.utfpr.model;

import br.com.utfpr.beans.Admin;

/**
 *
 * @author willian
 */
public class DaoAdmin extends HibernateDao<Admin>{
    public DaoAdmin() {
        clazz = Admin.class;
    } 
}
