/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javainterface.io;

import java.util.Date;

/**
 * Will hold the properties of remote file.
 * @author javaQuery
 * @date 10th August, 2016
 * @Github: https://github.com/javaquery/javainterface
 */
public class RemoteFile {

    private boolean directory;
    private boolean file;
    private String name;
    private String remoteLocation;
    private long size;
    private Date timestamp;

    public boolean isDirectory() {
        return directory;
    }

    public void setDirectory(boolean directory) {
        this.directory = directory;
    }

    public boolean isFile() {
        return file;
    }

    public void setFile(boolean file) {
        this.file = file;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemoteLocation() {
        return remoteLocation;
    }

    public void setRemoteLocation(String remoteLocation) {
        this.remoteLocation = remoteLocation;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "RemoteFile{" + "directory=" + directory + ", file=" + file + ", name=" + name + ", remoteLocation=" + remoteLocation + ", size=" + size + ", timestamp=" + timestamp + '}';
    }
}
