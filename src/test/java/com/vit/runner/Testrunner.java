package com.vit.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="classpath:features",//to tell cucumber where is ur feature file
        glue="classpath:stepdefs", // to tell cucumber where is ur step def codetags="@login", // to tell which tagged feature file to execute
        plugin = {"pretty", // to generate reports
                "html:target/html/htmlreport.html",
               "json:target/json/file.json",
          //      "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        },
        publish=false,
        dryRun=false


/*
features = "classpath:features",
        glue = "",
        plugin = {"pretty",
        "html:target/cucumber-report.html",
        "json:target/cucumber-json-report.json",

        },
        dryRun = true
*/

)









public class Testrunner {
}
