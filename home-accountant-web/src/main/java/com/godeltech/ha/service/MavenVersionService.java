package com.godeltech.ha.service;

import com.godeltech.ha.exception.VersionReaderException;
import com.godeltech.ha.model.MavenVersion;
import org.apache.maven.model.Model;
import org.apache.maven.model.io.xpp3.MavenXpp3Reader;
import org.codehaus.plexus.util.xml.pull.XmlPullParserException;
import org.springframework.stereotype.Service;

import java.io.FileReader;
import java.io.IOException;

/**
 * MavenVersionService reads the current version of this project
 * using MavenXpp3Reader class
 * @see org.apache.maven.model.io.xpp3.MavenXpp3Reader
 */
@Service
public class MavenVersionService {
    /**
     * Returns the current version of this project by reading pom.xml that placed
     * in home-accountant-web unit and setting the version as field version
     * of MavenVersion object
     * @return this home-accountant-web unit's maven version
     * @throws VersionReaderException  if an reading pom.xml exception occurred
     */
    public MavenVersion getMavenVersion() {
        MavenVersion mavenVersion = new MavenVersion();
        try {
            MavenXpp3Reader reader = new MavenXpp3Reader();
            Model model = reader.read(new FileReader("pom.xml"));
            mavenVersion.setVersion(model.getVersion());
        } catch (IOException e) {
            e.printStackTrace();
            throw new VersionReaderException("cannot read file", e);
        } catch (XmlPullParserException ex) {
            ex.printStackTrace();
            throw new VersionReaderException("cannot parse XML", ex);
        }

        return mavenVersion;
    }
}
