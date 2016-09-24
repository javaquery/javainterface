/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javainterface.database;

/**
 * Real time database interface.
 *
 * @author javaQuery
 * @date 24th September, 2016
 * @Github: https://github.com/javaquery/javainterface
 * @param <T>
 * @param <R>
 */
public interface RealTimeDatabase<T, R> {

    /**
     * To push(save) the object(data).
     *
     * @param object
     * @return
     */
    public boolean push(T object);

    /**
     * To get the object(data).
     *
     * @param object
     * @return
     */
    public R get(T object);

    /**
     * To update the existing object(data).
     *
     * @param object
     * @return
     */
    public boolean update(T object);

    /**
     * To remove the existing object(data).
     *
     * @param object
     * @return
     */
    public boolean removed(T object);
}
