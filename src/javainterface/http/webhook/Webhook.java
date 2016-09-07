/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javainterface.http.webhook;

import javainterface.core.Subscriber;
import javainterface.core.Unsubscriber;

/**
 * Webhook subscription/unsubscription.
 * @author javaQuery
 * @param <T>
 * @date 31st August, 2016
 * @Github: https://github.com/javaquery/javainterface
 */
public abstract class Webhook<T> implements Subscriber<T>, Unsubscriber<T>{
    /**
     * All available webhook can be loaded by this method. You need 
     * to just provide implementation of availableWebhook();
     * 
     * Can be used in implementation of 
     *      {@link Subscriber#subscribe(java.lang.Object)} and 
     *      {@link Unsubscriber#unsubscribe(java.lang.Object)}
     */
    public void availableWebhook(){
     // Implementation   
    }
}
