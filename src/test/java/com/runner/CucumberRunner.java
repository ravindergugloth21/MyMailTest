package com.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
@RunWith(CucumberWithSerenity.class)
//@RunWith(Cucumber.class)
@CucumberOptions(
features = "./src/test/resources/features",


glue = {"com.StepDefinition"},
tags= {"@test"},
plugin = {"pretty"}
//plugin={"html:target/cucumber-html-report", "json:target/cucumber.json"}


)


public class CucumberRunner {

}
