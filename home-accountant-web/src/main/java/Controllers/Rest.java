
package Controllers;
import Model.MavenVersion;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Rest {


    @RequestMapping(value = "api/version",
            method = RequestMethod.GET,
            produces = {MediaType.APPLICATION_JSON_VALUE})

    @ResponseBody
    public MavenVersion returnVersion() {

        return new MavenVersion();
    }
}
