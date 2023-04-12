package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent {
    // sol taraftaki menünün birçok lcaotor ve özelliği aynı o yüzden hepsini burada topladık
    public LeftNav () {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy (xpath = "(//span[text()='Setup'])[1]")
    public WebElement Setup;

    @FindBy (xpath = "//span[text()='Parameters']")
    public WebElement parameters;

    @FindBy (xpath = "(//span[text()='Countries'])[1]")
    public WebElement countries;

    @FindBy (xpath ="//span[text()='Citizenships']")
    public WebElement citizenship;



           /*
            @FindBy(xpath = "(//span[text()='Entrance Exams'])[1]")
    private WebElement entranceExam1;


    @FindBy(xpath = "(//span[text()='Setup'])[2]")
    private WebElement setup2;

    @FindBy(xpath = "(//span[text()='Entrance Exams'])[2]")
    private WebElement entranceExam2;

    public WebElement getWebElement (String strbutton) {
        switch (strbutton) {



            */

}
