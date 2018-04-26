package com.godeltech.ha.model;

import java.io.FileReader;
import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.maven.model.Model;
import org.apache.maven.model.io.xpp3.MavenXpp3Reader;
import org.codehaus.plexus.util.xml.pull.XmlPullParserException;


public class MavenVersion {
    @JsonProperty("version")
    private String version;
    @Override
    public String toString() {
        return "MavenVersion{" +
                "version='" + version + '\'' +
                '}';
    }


    public String getVersion() {
        String version = "";
        try {

            MavenXpp3Reader reader = new MavenXpp3Reader();
            Model model = reader.read(new FileReader("pom.xml"));
            version = model.getVersion();
        } catch (IOException e) {
            return version;
        } catch (XmlPullParserException e) {
            return version;
        }

        return version;
    }

}
