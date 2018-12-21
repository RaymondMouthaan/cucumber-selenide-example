package org.mouthaan.google.hooks;

import com.codeborne.selenide.Configuration;
import cucumber.api.java.Before;

public class Browser {
    @Before
    public void setup() {
        Configuration.reportsFolder = "target/selenide-reports";
    }
}
