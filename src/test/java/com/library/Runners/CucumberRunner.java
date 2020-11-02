package com.library.Runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/Resourses/Features",
        glue = "com/library/StepDefinitions",
        dryRun = false
        //tags = "@students_group"
)

public class CucumberRunner {
}
