package Runners;
// senaryoları fakrlı şekilde gruplayıp çalıştırma işlemi nasıl yapılıyor.
// burada bunu görüyoruz. paralel test değil dikkat et. grup grup test çalıştırma

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (features = {"src/test/java/FeatureFiles/_01_Login.feature",  //buraya feature filesin pathini yazıyoruz.
                              "src/test/java/FeatureFiles/_05_DataTableOrnek.feature"},

                      glue = {"StepDefinitions"} // klasörün adını veriyoruz
                 )
        // burada neyi, nereden alıp çalıştırması gerektiğini söylüyoruz

public class _01_TestRunner extends AbstractTestNGCucumberTests {
}
