package com.hrktsoft.portfowardutility;

import com.jcraft.jsch.UIKeyboardInteractive;
import com.jcraft.jsch.UserInfo;

/**
 * UserInfo class for using JSch
 * 
 * @author hrkt
 *
 */
public class JschUserInfo implements UserInfo, UIKeyboardInteractive{
    /**
     * password
     */
    private String password;
    
    /**
     * 
     */
    public String getPassphrase() {
        return null;
    }

    /**
     * 
     */
    public String getPassword() {
        return password;
    }
    
    /**
     * 
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 
     */
    public void clearPassword(){
        this.password = null;
    }
    
    /**
     * 
     */
    public boolean promptPassphrase(String arg0) {
        return false;
    }

    /**
     * 
     */
    public boolean promptPassword(String arg0) {
        return false;
    }

    /**
     * 
     */
    public boolean promptYesNo(String arg0) {
        return false;
    }

    /**
     * 
     */
    public void showMessage(String arg0) {
        //do nothing
    }

    /**
     * 
     */
    public String[] promptKeyboardInteractive(String destination, String name,
            String instruction, String[] prompt, boolean[] echo) {
        char[] password = System.console().readPassword("Password: ");
        return new String[]{new String(password)};
    }

}
