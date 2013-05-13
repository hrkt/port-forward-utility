package com.hrktsoft.portfowardutility;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.hrktsoft.portfowardutility.entry.ForwardEntryL;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;

/**
 * An entry point
 * 
 * @author hrkt
 * 
 */
public class Main {
    /**
     * version
     */
    public static String VERSION = "0.1";

    /**
     * path of configuration file
     */
    private static String filePath = System.getProperty(
            "forward.configuration.file.path", "forward.conf");

    /**
     * 
     * @param args
     */
    public static void main(String[] args) {
        if (args.length > 0) {
            filePath = args[0];
        }

        ConfigurationLoader loader = new ConfigurationLoader(filePath);
        Configuration configuration = null;
        try {
            configuration = loader.getConfiguration();
        } catch (FileNotFoundException e) {
            System.err.println("Configuration file(" + filePath
                    + ") was not found.");
            System.exit(1);
        } catch (IOException e) {
            System.err.println("I/O error occured.");
            System.exit(1);
        } catch (IllegalConfigurationException e) {
            System.err.println("Configuration file is invalid : "
                    + e.getMessage());
            System.exit(1);
        }

        JSch jsch = new JSch();
        JSch.setConfig("StrictHostKeyChecking", "no");

        try {
            Session session = jsch.getSession(configuration.getUser(),
                    configuration.getHost(), configuration.getPort());
            JschUserInfo userinfo = new JschUserInfo();
            session.setUserInfo(userinfo);
            session.connect();
            userinfo.clearPassword();

            System.out.println("[Port Forward Utility] ver." + VERSION);
            for (ForwardEntryL entry : configuration.getForwardEntriesL()) {
                session.setPortForwardingL(entry.getLocalPort(),
                        entry.getDestHost(), entry.getDestPort());
                System.out.println(entry);
            }

        } catch (JSchException e) {
            System.err.println("An error occured : " + e);
            // e.printStackTrace();
        }
    }

}
