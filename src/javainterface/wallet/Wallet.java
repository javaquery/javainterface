/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javainterface.wallet;

import javainterface.wallet.entities.WalletTransaction;
import javainterface.wallet.exception.WalletException;

/**
 * Wallet interface.
 * @author javaQuery
 * @date 10th August, 2016
 * @Github: https://github.com/javaquery/javainterface
 * @param <T>
 */
public interface Wallet<T> {
    public T credit(WalletTransaction transaction) throws WalletException;
    public T debit(WalletTransaction transaction) throws WalletException;
}
