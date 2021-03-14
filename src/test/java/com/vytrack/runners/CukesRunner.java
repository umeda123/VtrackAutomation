package com.vytrack.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
               "html:target/Vytrack-Report.html",
                "json:target/Vytrack-Report.json",
                "return:target/Vytrack-Report.txt",
           },
        features = "src/test/resources/features",
        glue = "src/test/java/com/vytrack/step_defenitions",
        dryRun = false,
        tags = ""


)







public class CukesRunner {
}
