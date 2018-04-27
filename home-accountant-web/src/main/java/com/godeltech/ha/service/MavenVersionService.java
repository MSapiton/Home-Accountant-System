package com.godeltech.ha.service;

import com.godeltech.ha.model.MavenVersion;
import org.apache.maven.model.Model;
import org.apache.maven.model.io.xpp3.MavenXpp3Reader;
import org.codehaus.plexus.util.xml.pull.XmlPullParserException;


import java.io.FileReader;
import java.io.IOException;


public class MavenVersionService {

private MavenVersion mavenVersion = new MavenVersion();

    private void readVersionFromPom() {
        try {
            MavenXpp3Reader reader = new MavenXpp3Reader();
            Model model = reader.read(new FileReader("pom.xml"));
            mavenVersion.setVersion(model.getVersion());
        } catch (IOException e) {

        } catch (XmlPullParserException e) {

        }
    }

    public MavenVersion getMavenVersion(){
        readVersionFromPom();
        return mavenVersion;
    }
}
