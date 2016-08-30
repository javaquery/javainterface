/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javainterface.network;

import javainterface.io.FileHolder;

/**
 * When you store your files to remote servers like AmazonS3.
 * @author javaQuery
 * @date 30th August, 2016
 * @Github: https://github.com/javaquery/javainterface
 */
public interface RemoteStorage {
    /**
     * Upload local file to server. 
     * Here {@link FileHolder#remoteLink} used to specify remote file location.
     * @param file
     * @return 
     */
    public boolean upload(FileHolder file);
    
    /**
     * Download remote file to local. 
     * Use {@link FileHolder#createTempFile(java.lang.String, java.lang.String)} to create temporary file
     * and then download file using {@link FileHolder#remoteLink}.
     * 
     * You can also create new file using {@link FileHolder#createNewFile()}
     * @param file
     * @return 
     */
    public boolean download(FileHolder file);
}
