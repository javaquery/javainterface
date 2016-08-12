/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javainterface.paymentgateway;

import javainterface.paymentgateway.entities.Payment;
import javainterface.paymentgateway.exception.PaymentGatewayException;

/**
 * PaymentGateway interface.
 * @author javaQuery
 * @date 10th August, 2016
 * @Github: https://github.com/javaquery/javainterface
 * @param <T>
 */
public interface PaymentGateway<T> {
    public T credit(Payment payment) throws PaymentGatewayException;
    public T debit(Payment payment) throws PaymentGatewayException;
}
