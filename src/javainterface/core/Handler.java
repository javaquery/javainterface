/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javainterface.core;

/**
 * Pluggable (common) code. We used it with {@link RequestHandler}.
 * @author javaQuery
 * @date 30th August, 2016
 * @Github: https://github.com/javaquery/javainterface
 * @param <T>
 * @param <R>
 */
public interface Handler<T,R> {
    public T handle(R r);
}
