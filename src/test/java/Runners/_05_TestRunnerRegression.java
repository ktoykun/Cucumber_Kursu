package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


    @CucumberOptions(
            tags = "@SmokeTest or @Regression", // hangi senaryolarda bu etiketler varsa onu çalıştır.
            // araya and de diyebiliriz o zaman sadece her iki taga de sahip olanları çalıştırır
            features = {"src/test/java/FeatureFiles"},
            glue = {"StepDefinitions"},
            plugin= {"json:target/cucumber/cucumber.json"})

    public class _05_TestRunnerRegression  extends AbstractTestNGCucumberTests {


    }

