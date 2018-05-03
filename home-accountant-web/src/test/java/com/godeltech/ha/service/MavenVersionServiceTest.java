package com.godeltech.ha.service;

import org.junit.Test;
import static org.junit.Assert.*;


public class MavenVersionServiceTest {
    private String currrentVersion = "1.1.0-SNAPSHOT";

    @Test
    public void getMavenVersionMethodShouldReturnCorrectVersion() {

        MavenVersionService serviceTester = new MavenVersionService();
        assertEquals(currrentVersion, serviceTester.getMavenVersion().toString());

    }

}
