package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DialogContent extends Parent {
    // Page Object Model (POM) sol taraftaki pom ile bir ilgisi yok.
    // o project object model
    // dialog content gibi açılan pecenreler için
    // bunu kullanacağız. bunun içine locatorlar koyacağız

    public DialogContent() {
        // ekran ilk açıldığında elementlerin yüklenmesi zaman alıyor.
        // onun için burayı yazdık. yine de bekletmeye ihtiyaç var.
        // onu da login stepsin içine koyduk
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(css = "input[formcontrolname='username']")
    public WebElement username;

    @FindBy(css ="[formcontrolname='password']")
    public WebElement password;

    @FindBy(css ="button[aria-label='LOGIN']")
    public WebElement loginbutton;

    @FindBy(css ="[class='mat-tooltip-trigger logo-text']")
    public WebElement txtTechnoStudy;

    @FindBy (xpath = "//ms-add-button[contains (@tooltip, 'ADD')]//button")
    public  WebElement plus;

    @FindBy (xpath = "//ms-text-field[@formcontrolname='name']/input")
    public WebElement namecountry;

    @FindBy (xpath = "//ms-text-field[@formcontrolname='code']/input")
    public WebElement countrycode;

    @FindBy (xpath = "//ms-save-button/button")
    public WebElement save;

    @FindBy (xpath = "//div[contains(text(),'successfully')]")
    public WebElement confirm;

    @FindBy (xpath = "//div[contains(text(),'already exist')]")
    public WebElement alreadyExist;

    @FindBy (xpath = "//ms-text-field[@formcontrolname='budgetAccountIntegrationCode']//input")
    private WebElement integrationCode;

    @FindBy (xpath = "//ms-integer-field[@formcontrolname='priority']/input")
    private WebElement priorityCode;

    @FindBy (xpath = "//mat-slide-toggle[@formcontrolname='active']")
    private WebElement toggleBar;

    @FindBy (xpath = "//mat-slide-toggle[@formcontrolname='active']")
    private WebElement academicPeriod;

    @FindBy (xpath = "(//mat-option/span)[1]")
    private WebElement academicPeriod1;

    @FindBy (xpath = "//span[text()='Grade Level'][1]")
    private WebElement gradelevel;

    @FindBy (xpath = "(//mat-option//span)[2]")
    private WebElement gradelevel1;


    public void deleteItem(String searchText) {
        //  sendKeysFunction(searchInput,searchText);
        //  clickFunction(searchButton);   //fuse-progress-bar/*   gözüküyor
        //beklet
        //1. StaleElemetn hatası verdi : erken buldum tez kaybettim
        //wait.until(ExpectedConditions.elementToBeClickable(searchButton));

        //fuse-progress-bar/*    bu 0 olana kadar beklet
        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//fuse-progress-bar/*"), 0));

        // clickFunction(deleteImageBtn);
        // clickFunction(deleteDialogBtn);
    }

}
