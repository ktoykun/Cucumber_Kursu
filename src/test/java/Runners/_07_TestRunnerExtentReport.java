package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

// resource klasörünün olduğu dersi dinledikten sonra bunu tekrar çalıştır hata raporunu gör
// sol tarafta tets output çıkıyor ona tıklat sparka tıklat ve raporu gör
@CucumberOptions(
        // tags = "@SmokeTest",
        features = {"src/test/java/FeatureFiles/_01_Login.feature"},
        glue = {"StepDefinitions"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
        // bu plug ini programsbuzz sayfasından aldık. yıldızlı.


public class _07_TestRunnerExtentReport  extends AbstractTestNGCucumberTests {


}