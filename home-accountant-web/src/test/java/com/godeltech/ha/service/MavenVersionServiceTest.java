package com.godeltech.ha.service;


import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;


public class MavenVersionServiceTest {
    private String currrentVersion = "1.1.0-SNAPSHOT";

    @Test
    public void getMavenVersionMethodShouldReturnCorrectVersion() {
        MavenVersionService serviceTester = new MavenVersionService();
        assertThat(currrentVersion, is(equalTo(serviceTester.getMavenVersion().toString())));

    }
}
