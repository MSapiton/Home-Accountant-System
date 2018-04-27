package com.godeltech.ha.controller;

import com.godeltech.ha.model.MavenVersion;
import com.godeltech.ha.service.MavenVersionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ApplicationVersionController {
    @Autowired
    private MavenVersionService mavenVersionService;

    @RequestMapping("/")
    public ModelAndView welcome() {
        return new ModelAndView("index.html");
    }

    @RequestMapping(value = "api/version",
            method = RequestMethod.GET,
            produces = {MediaType.APPLICATION_JSON_VALUE})

    @ResponseBody
    public MavenVersion returnVersion() {
        return mavenVersionService.getMavenVersion();
    }
}
