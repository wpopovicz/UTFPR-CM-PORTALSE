/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.utfpr.model;

import br.com.utfpr.beans.Supervisor;

/**
 *
 * @author willian
 */
public class DaoSupervisor extends HibernateDao<Supervisor>{
    public DaoSupervisor() {
        clazz = Supervisor.class;
    } 
}