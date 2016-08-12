/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javainterface.ftp;

import java.io.IOException;
import java.util.List;
import javainterface.ftp.entities.FTPEntry;
import javainterface.ftp.exception.FTPException;
import javainterface.io.FileHolder;
import javainterface.io.RemoteFile;
import javainterface.network.ConnectionManager;

/**
 * File Transfer Protocol interface.
 * @author javaQuery
 * @date 10th August, 2016
 * @Github: https://github.com/javaquery/javainterface
 */
public interface FileTransferProtocol {
    public void connect(ConnectionManager connectionManager) throws IOException;
    public void disconnect() throws IOException;
    public List<RemoteFile> listing(String directory, FTPEntry ftpEntry) throws FTPException;
    public Boolean upload(FileHolder fileHolder) throws FTPException;
    public Boolean download(FileHolder fileHolder) throws FTPException;
    public Boolean delete(FileHolder fileHolder) throws FTPException;
}
