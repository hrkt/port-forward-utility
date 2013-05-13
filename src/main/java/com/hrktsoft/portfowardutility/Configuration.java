package com.hrktsoft.portfowardutility;

import java.util.List;

import com.hrktsoft.portfowardutility.entry.ForwardEntryL;

/**
 * 
 * @author hrkt
 *
 */
public class Configuration {
    /**
     * address of remote host
     */
    private String host;
    
    /**
     * account for remote host
     */
    private String user;
    
    /**
     * port for ssh (option. default = 22)
     */
    private int port = 22;
    
    /**
     * local-port to remote-port entries
     */
    private List<ForwardEntryL> forwardEntriesL;

    /**
     * @return the host
     */
    public String getHost() {
        return host;
    }

    /**
     * @param host the host to set
     */
    public void setHost(String host) {
        this.host = host;
    }
    
    

    /**
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * @return the forwardEntriesL
     */
    public List<ForwardEntryL> getForwardEntriesL() {
        return forwardEntriesL;
    }

    /**
     * @param forwardEntriesL the forwardEntriesL to set
     */
    public void setForwardEntriesL(List<ForwardEntryL> forwardEntriesL) {
        this.forwardEntriesL = forwardEntriesL;
    }

    /**
     * @return the port
     */
    public int getPort() {
        return port;
    }

    /**
     * @param port the port to set
     */
    public void setPort(int port) {
        this.port = port;
    }
    
    
}
