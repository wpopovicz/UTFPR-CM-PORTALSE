/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.utfpr.model;

import br.com.utfpr.beans.Pessoa;

/**
 *
 * @author willian
 */
public class DaoPessoa extends HibernateDao<Pessoa>{
    public DaoPessoa() {
        clazz = Pessoa.class;
    } 
}
