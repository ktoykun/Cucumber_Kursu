package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

// gruplama işlemini nasıl yaparız? etiketi ilgili cucumber dosyasında
//scenario kısmının üstüne yazıyoruz.tags kısmına yazdığımızda o etkikete sahip
// senaryolar çalışır.

@CucumberOptions(
        tags = "@SmokeTest", // hangi senaryolarda bu etiket varsa onu çalıştır.
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"},
        plugin= {"json:target/cucumber/cucumber.json"}
)

public class _04_TestRunnerSmoke extends AbstractTestNGCucumberTests {


}
