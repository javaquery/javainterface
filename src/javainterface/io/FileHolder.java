/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javainterface.io;

import java.io.File;
import java.util.Date;

/**
 * Will serve purpose of {@link File} and gives you room to hold other details for file.
 * @author javaQuery
 * @date 10th August, 2016
 * @Github: https://github.com/javaquery/javainterface
 */
public class FileHolder extends File{

    public FileHolder(String pathname) {
        super(pathname);
    }
    
    private String remoteLink;
    private Date timestamp;

    public String getRemoteLink() {
        return remoteLink;
    }

    public void setRemoteLink(String remoteLink) {
        this.remoteLink = remoteLink;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}
