package project.registration;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/featureFile",
    glue = "project.registration",
    plugin = {
        "pretty", 
        "html:target/cucumber-reports/cucumber.html", 
        "json:target/cucumber-reports/cucumber.json", 
        "junit:target/cucumber-reports/cucumber.xml" 
    },
    monochrome = true
    
)
public class testRunner {

}