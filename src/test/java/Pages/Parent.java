package Pages;

import Utilities.GWD;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
// elementler ile fonsktionlarımız barındıran class.

public class Parent {
    WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));

    public void sendKeysFunction(WebElement element, String text)
    // textbox için de bunu kullanıyoruz.
    {
        waitUntilVisible(element); // gözükene kadar bekle
        scrollToElement(element);  // scroll yap
        element.clear();           // temizle
        element.sendKeys(text);    // gönder
    }

    // butona tıklamak için bunu kullanıyoruz
    public void clickFunction(WebElement element)
    {
        waitUntilClickable(element);// tıklatılabilir olana kadar bekle
        scrollToElement(element);// scroll yap
        element.click();// tıkla

    }

    // scroll olana kadar bekle demek için şunu yapıyoruz:
    public void scrollToElement(WebElement element){
        JavascriptExecutor js=(JavascriptExecutor) GWD.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    // doğrulama işlemini bununla yapıyoruz. her sefereinde ayrı ayrı doğrulama yapamayız. o yüzden
    // buraya aldık
    public void verifyContainsTextFunction(WebElement element, String value){
        wait.until(ExpectedConditions.textToBePresentInElement(element, value));
        Assert.assertTrue(element.getText().toLowerCase().contains(value.toLowerCase()),"no such TEXT");
        new Actions(GWD.getDriver()).sendKeys(Keys.ESCAPE).perform();
        // açık dialog kutusu varsa kapansın
        //Ek not: texttobe dediğimiz zaman bir de elementin locatorını ister oyüzden yukarıdaki kod öyle.

    }
    // element görünene kadar bekle demek için bunu kullanıyoruz
    public void waitUntilVisible(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    // element tıklatılabilir olana kadar bekle demek için bunu kullanıyoruz
    public void waitUntilClickable(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }


}

