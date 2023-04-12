package StepDefinitions;

import Pages.DialogContent;
import Utilities.ExcelUtility;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class _10_ApachePOISteps {
    DialogContent dc = new DialogContent();

    @When("User Create citizenship with ApacehPOI")
    public void userCreateCitizenshipWithApacehPOI() throws FileNotFoundException {
        ArrayList<ArrayList<String>> tablo =
                ExcelUtility.getData("src/test/java/ApachePOI/resource/ApacheExcel2.xlsx", "testCitizen", 2);

        for (ArrayList<String> satir : tablo) {
            dc.clickFunction(dc.plus);
            dc.sendKeysFunction(dc.namecountry, satir.get(0));
          //  dc.sendKeysFunction(dc.shortName, satir.get(1)); shortname değişecek
            dc.clickFunction(dc.plus);
            dc.verifyContainsTextFunction(dc.confirm, "success");
        }
    }

    @Then("User Delete citizenship with ApacehPOI")
    public void userDeleteCitizenshipWithApacehPOI() throws FileNotFoundException {
        ArrayList<ArrayList<String>> tablo =
                ExcelUtility.getData("src/test/java/ApachePOI/resource/ApacheExcel2.xlsx", "testCitizen", 1);

        for (ArrayList<String> satir : tablo) {
            dc.deleteItem(satir.get(0));
            dc.verifyContainsTextFunction(dc.confirm, "success");
        }
    }
}
