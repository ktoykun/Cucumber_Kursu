package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _04_CitizenshipSteps {
    LeftNav ln=new LeftNav();
    DialogContent dc=new DialogContent();


    @And("Navigate to CitizenShip page")
    public void navigateToCitizenShipPage() {
        ln.clickFunction(ln.Setup);
        ln.clickFunction(ln.parameters);
        ln.clickFunction(ln.countries);
    }

    @When("User a CitizenShip name as {string} short name as {string}")
    public void userACitizenShipNameAsShortNameAs(String citizenName, String shortName) {
    dc.clickFunction(dc.plus);
    dc.sendKeysFunction(dc.namecountry,citizenName );
    dc.sendKeysFunction(dc.countrycode, shortName);
    dc.clickFunction(dc.save);
    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        dc.verifyContainsTextFunction(dc.confirm,"success" );
    }


    @Then("Already exist message should be displayed")
    public void alreadyExistMessageShouldBeDisplayed() {
        dc.verifyContainsTextFunction(dc.alreadyExist, "already" );
    }

    @When("User delete the {string}")
    public void userDeleteThe(String arg0) {
    }
}
