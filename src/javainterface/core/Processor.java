/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javainterface.core;

/**
 * @author javaQuery
 * @date 20th August, 2016
 * @Github: https://github.com/javaquery/javainterface
 * @author Vicky
 * @param <T>
 */
public interface Processor<T> {
    /**
     * Intended to process data where you don't expect any return values.
     * data - Should be ready for final processing.
     * @param data 
     */
    public void process(T data);
}
