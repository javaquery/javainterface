/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javainterface.core;

/**
 * @author javaQuery
 * @date 31st August, 2016
 * @Github: https://github.com/javaquery/javainterface
 * @param <T>
 */
public interface Unsubscriber<T> {
    public void unsubscribe(T t);
}
