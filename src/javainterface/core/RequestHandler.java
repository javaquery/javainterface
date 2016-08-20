/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javainterface.core;

/**
 * Request Handler
 * @author javaQuery
 * @date 20th August, 2016
 * @Github: https://github.com/javaquery/javainterface
 * @param <T>
 * @param <R>
 */
public interface RequestHandler<T, R> {
    /**
     * Before actual execution of request.
     * @param request 
     */
    public void beforeRequest(T request);
    
    /**
     * After response of request.
     * @param request
     * @param response 
     */
    public void afterResponse(T request, R response);
    
    /**
     * When exception occurs while processing request.
     * @param request
     * @param response
     * @param ex 
     */
    public void onException(T request, R response, Exception ex);
}
