/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javainterface.network;

/**
 * Holds connection properties for any network related Authentication.
 * @author javaQuery
 * @date 10th August, 2016
 * @Github: https://github.com/javaquery/javainterface
 */
public class ConnectionManager {

    private final String host;
    private final int port;
    private final String username;
    private final String password;
    private int connectionTimeout = 1000 * 60 * 1;
    private int socketTimeout = 1000 * 60 * 5;

    public ConnectionManager(String host, int port, String username, String password) {
        this.host = host;
        this.port = port;
        this.username = username;
        this.password = password;
    }

    public String getHost() {
        return host;
    }

    public int getPort() {
        return port;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getConnectionTimeout() {
        return connectionTimeout;
    }

    public void setConnectionTimeout(int connectionTimeout) {
        this.connectionTimeout = connectionTimeout;
    }

    public int getSocketTimeout() {
        return socketTimeout;
    }

    public void setSocketTimeout(int socketTimeout) {
        this.socketTimeout = socketTimeout;
    }
}
