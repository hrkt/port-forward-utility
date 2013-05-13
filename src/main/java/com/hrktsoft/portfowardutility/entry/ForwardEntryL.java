package com.hrktsoft.portfowardutility.entry;

/**
 * this class represents an entry for port forward.
 * 
 * @author hrkt
 * 
 */
public class ForwardEntryL extends ForwardEntry {
    /**
     * local port number
     */
    private int localPort;

    /**
     * destination host
     */
    private String destHost;

    /**
     * port number of destination port
     */
    private int destPort;

    /**
     * @param localPort
     * @param destHost
     * @param destPort
     */
    public ForwardEntryL(int localPort, String destHost, int destPort) {
        super();
        this.localPort = localPort;
        this.destHost = destHost;
        this.destPort = destPort;
    }

    /**
     * @return the localPort
     */
    public int getLocalPort() {
        return localPort;
    }

    /**
     * @param localPort
     *            the localPort to set
     */
    public void setLocalPort(int localPort) {
        this.localPort = localPort;
    }

    /**
     * @return the destHost
     */
    public String getDestHost() {
        return destHost;
    }

    /**
     * @param destHost
     *            the destHost to set
     */
    public void setDestHost(String destHost) {
        this.destHost = destHost;
    }

    /**
     * @return the destPort
     */
    public int getDestPort() {
        return destPort;
    }

    /**
     * @param destPort
     *            the destPort to set
     */
    public void setDestPort(int destPort) {
        this.destPort = destPort;
    }

    public String toString(){
        return String.format("local:%d -> %s:%d", localPort, destHost, destPort);
    }
}
