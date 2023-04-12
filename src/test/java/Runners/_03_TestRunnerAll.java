package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

// bu şimdi bütün testleri çalıştıracak. regretion test diyebiliriz:))

@CucumberOptions (features = {"src/test/java/FeatureFiles"},
                    glue = {"StepDefinitions"},
                     dryRun = true
        //true olduğunda testi çalıştırmaz. sadece featurelara ait
        // steplerin varlığın kontrol eder. false olduğunda ise testi çalıştırır.

)

public class _03_TestRunnerAll extends AbstractTestNGCucumberTests {
}
