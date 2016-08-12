/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javainterface.ftp.entities;

import java.util.Comparator;
import java.util.Date;
import javainterface.io.RemoteFile;

/**
 * Can be used for FTP directory listing filter.
 * @author javaQuery
 * @date 10th August, 2016
 * @Github: https://github.com/javaquery/javainterface
 */
public class FTPEntry {
    private String prefix;
    private String suffix;
    private Date fromDate;
    private Date toDate;
    private Comparator<RemoteFile> comparator; //for sorting purpose

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    public Comparator<RemoteFile> getComparator() {
        return comparator;
    }

    public void setComparator(Comparator<RemoteFile> comparator) {
        this.comparator = comparator;
    }
}
