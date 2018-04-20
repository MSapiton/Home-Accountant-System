package Model;

import java.io.FileReader;
import java.io.IOException;

import org.apache.maven.model.Model;
import org.apache.maven.model.io.xpp3.MavenXpp3Reader;
import org.codehaus.plexus.util.xml.pull.XmlPullParserException;


    public class MavenVersion {

        public String getVersion()  {
            String version = "";
            try {

                MavenXpp3Reader reader = new MavenXpp3Reader();
                Model model = reader.read(new FileReader("pom.xml"));
                version = model.getVersion();
            }
            catch (IOException e){return version;}
            catch (XmlPullParserException e){return version;}

            return version;
        }

    }
