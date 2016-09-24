/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javainterface.database;

/**
 * Real time database listener interface.
 *
 * @author javaQuery
 * @date 24th September, 2016
 * @Github: https://github.com/javaquery/javainterface
 * @param <T>
 * @param <R>
 */
public interface RealTimeDatabaseListener<T, R> {

    /**
     * When new object(data) is added on particular node.
     *
     * @param node
     * @return
     */
    public T onDataAdded(R node);

    /**
     * When object(data) update on particular node.
     *
     * @param node
     * @return
     */
    public T onDataChanged(R node);

    /**
     * When object(data) moved from particular node.
     *
     * @param node
     * @return
     */
    public T onDataMoved(R node);

    /**
     * When object(data) removed from particular node.
     *
     * @param node
     * @return
     */
    public T onDataRemoved(R node);
}
