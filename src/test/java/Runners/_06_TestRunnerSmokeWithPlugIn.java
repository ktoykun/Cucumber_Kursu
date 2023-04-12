package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


    @CucumberOptions(
            tags = "@SmokeTest",
            features = {"src/test/java/FeatureFiles"},
            glue = {"StepDefinitions"},
            plugin= {"html:target/site/cucumber-pretty.html"} // bu basit bi rapor yazar
    )          // plugini sonra kendin çalıştır sol taraftaki target site içinden chrome gidip rapor alınacak

    public class _06_TestRunnerSmokeWithPlugIn  extends AbstractTestNGCucumberTests {


    }
