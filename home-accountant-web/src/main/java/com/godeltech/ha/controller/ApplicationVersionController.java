package com.godeltech.ha.controller;

import com.godeltech.ha.model.MavenVersion;
import com.godeltech.ha.service.MavenVersionService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
public class ApplicationVersionController {
    private static final Logger log = Logger.getLogger(ApplicationVersionController.class);

    @Autowired
    private MavenVersionService mavenVersionService;

    /**
     * Returns welcome page
     * @return index.html
     */
    @RequestMapping("/")
    public ModelAndView welcome() {
        log.info("welcome page returned");
        return new ModelAndView("index.html");
    }

    /**Handles get request to REST api and
     * returns MavenVersion as response
     * @return application version in JSON format
     */
    @RequestMapping(value = "api/version",
            method = RequestMethod.GET,
            produces = {MediaType.APPLICATION_JSON_VALUE})

    public MavenVersion returnVersion()  {
        log.info("application version returned");
        return mavenVersionService.getMavenVersion();
    }
}
