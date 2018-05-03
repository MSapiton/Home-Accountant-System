package com.godeltech.ha.model;

import com.fasterxml.jackson.annotation.JsonProperty;


public class MavenVersion {

    @JsonProperty("applicationVersion")
    private String version;

    public void setVersion(String version) {
        this.version = version;
    }

    public String getVersion() {
        return version;
    }

    @Override
    public String toString() {
        return "MavenVersion{" +
                "version='" + version + '\'' +
                '}';
    }

}
