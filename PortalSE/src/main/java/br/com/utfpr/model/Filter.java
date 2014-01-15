/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.utfpr.model;

/**
 *
 * @author willian
 */
public class Filter {
    private String attribute;
    private Operator operator;
    private Object value;

    public Filter(String attribute, Operator operator, Object value) {
        this.attribute = attribute;
        this.operator = operator;
        this.value = value;
    }

    public String getAttribute() {
        return attribute;
    }

    public Operator getOperator() {
        return operator;
    }

    public Object getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Filter{" + attribute + " " + operator + " " + value + '}';
    }
}
