/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javainterface.io.writer;

import java.io.IOException;
import javainterface.io.FileHolder;

/**
 * Writer interface.
 * @author javaQuery
 * @date 10th August, 2016
 * @Github: https://github.com/javaquery/javainterface
 * @param <T>
 */
public interface Writer<T> {
    public void write(T data, FileHolder fileHolder) throws IOException;
}
