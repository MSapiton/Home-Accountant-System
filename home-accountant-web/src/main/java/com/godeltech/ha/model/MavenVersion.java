package com.godeltech.ha.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * MavenVersion store the current version of this project
 */
public class MavenVersion {

    @JsonProperty("applicationVersion")
    private String version;

    /**
     * sets the version
     * @param version String that store the current application version
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * @return current version field of this object
     */
    public String getVersion() {
        return version;
    }

    /**
     * Overriding method of Object class toString()
     * @return version in String type
     */
    @Override
    public String toString() {
        return version;
    }

}
