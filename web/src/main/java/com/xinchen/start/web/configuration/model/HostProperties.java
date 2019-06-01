package com.xinchen.start.web.configuration.model;

import java.io.Serializable;

/**
 * @author xinchen
 * @version 1.0
 * @date 31/05/2019 15:04
 */
public class HostProperties implements Serializable {
    private String name;

    private String ip;

    private String port;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }
}
