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
    /**
     * Establish connection to FTP server.
     * @param connectionManager
     * @throws IOException 
     */
    public void connect(ConnectionManager connectionManager) throws IOException;
    
    /**
     * Disconnect FTP server by executing pending commands.
     * @throws IOException 
     */
    public void disconnect() throws IOException;
    
    /**
     * Retrieve directory listing.
     * @param directory
     * @param ftpEntry
     * @return
     * @throws FTPException 
     */
    public List<RemoteFile> listing(String directory, FTPEntry ftpEntry) throws FTPException;
    
    /**
     * Upload local file to FTP server.
     * Note: 
     *  - {@link FileHolder#remoteLink}: FTP server file location
     *  - {@link FileHolder}: It extends {@link File} so it represent local file itself.
     * @param fileHolder
     * @return
     * @throws FTPException 
     */
    public Boolean upload(FileHolder fileHolder) throws FTPException;
    
    /**
     * Download remote file to local system
     * Note: 
     *  - {@link FileHolder#remoteLink}: FTP server file location
     *  - {@link FileHolder}: It extends {@link File} so it represent local file itself.
     * @param fileHolder
     * @return
     * @throws FTPException 
     */
    public Boolean download(FileHolder fileHolder) throws FTPException;
    
    /**
     * Delete remote file.
     * Note:
     *  - {@link FileHolder#remoteLink}: FTP server file location
     * @param fileHolder
     * @return
     * @throws FTPException 
     */
    public Boolean delete(FileHolder fileHolder) throws FTPException;
}
