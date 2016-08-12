/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javainterface.paymentgateway.exception;

/**
 * @author javaQuery
 * @date 10th August, 2016
 * @Github: https://github.com/javaquery/javainterface
 */
public class PaymentGatewayException extends Exception{

    public PaymentGatewayException(String message, Throwable cause) {
        super(message, cause);
    }
}
