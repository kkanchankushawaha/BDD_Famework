package com.envision.ui.automation.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Features",
        glue = { "com.envision.ui.automation.stepDefns",
        "com.envision.ui.automation.configuration" },
        tags = "@ValidateGooglePageScenario",
        publish = true,
        dryRun = false,
        plugin = {
                "pretty",
                "html:target/Cucumber_html_Report/cucumber.html",
                "json:target/CucumberJason/cucumber.json",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        }

)

public class JunitRunner {
}



/*
@CucumberOptions(
        features = {"src/test/resources/Features"},
        glue = {"com.envision.ui.automation.stepDefns",
                "com.envision.ui.automation.configuration"},//we need to also define here the browserfactory
        //we have defined the @Before and @After annotations, so we are telling cucumber to check browserfactory package to check if these exist and
        //if yes, give the first priority to that annotations and then execute the steps
        tags = "@ValidateTitle_1", //we can also pass the feature so multiple scenarios can run at the same time
        publish = true,
        dryRun = false,//it is used for validation if the steps are correct or not true means -we are validating if all the steps are executing
        plugin = {
                "pretty",
                "html:target/CucumberHTML/cucumber-html-report.html",
                "json:target/CucumberJson/cucumber.json",

        }
)
*/

