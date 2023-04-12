package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;

public class _02_CountrySteps {
    LeftNav ln = new LeftNav();
    DialogContent dc = new DialogContent();

    @And("Navigate to country page")
    public void navigateToCountryPage() {
        ln.clickFunction(ln.Setup);
        ln.clickFunction(ln.parameters);
        ln.clickFunction(ln.countries);
    }

    @When("Enter name and code and click + button")
    public void createACountry() {
        String ulkeAdi= RandomStringUtils.randomAlphanumeric(8); // 8 harf
        String ulkeKodu= RandomStringUtils.randomNumeric(4); // 4 rakam

        dc.clickFunction(dc.plus);
        dc.sendKeysFunction(dc.namecountry, ulkeAdi);
        dc.sendKeysFunction(dc.countrycode, ulkeKodu);
        dc.clickFunction(dc.save);
    }

    @Then("country should create succefully")
    public void successMessageShouldBeDisplayed() {

        dc.verifyContainsTextFunction(dc.confirm,"success");
    }

    @When("create a country name as {string} code as {string}")
    public void createACountryNameAsCodeAs(String name, String kod) {
        dc.clickFunction(dc.plus);
        dc.sendKeysFunction(dc.namecountry, name);
        dc.sendKeysFunction(dc.countrycode, kod);
        dc.clickFunction(dc.save);
    }
}
