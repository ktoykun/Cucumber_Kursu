package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GWD {
    private static ThreadLocal<WebDriver> threadDriver=new ThreadLocal<>(); //webDriver 1 , webDriver 2..
    private static ThreadLocal<String> threadBrowserName=new ThreadLocal<>(); // chrome, firefox

    private static WebDriver driver;

    public static WebDriver getDriver() {

        // extend report Türkçe pc lerde çalışmıyor. o hatayı ortadan kaldırdık.
        Locale.setDefault(new Locale("EN"));
        System.setProperty("user.language", "EN");

        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.SEVERE);
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");

        if (driver == null) { // bir kere çalışsın. daha önce açılmamışsa aç diyoruz
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            driver = new ChromeDriver(options);
            driver.manage().window().maximize();
        }

        return driver; // çağırılığında driver gönderiyor
    }


    // kapatmayı da buradan yapıyoruz. senaryo bittiğinde çalışmalı.
    // bunun için cucumberin bir özelliği var. her senaryodan önce/sonra
    // çalışıacak olan işlemler için anotationlar kullanıyoruz.
    // Test ng deki after class gibi. hooks olarak yeni oluşturduğuuz klasöre attık.
    public static void quitDriver () {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);

        }

        if (driver !=null) { // boş değilse, dolu ise yani. çalışıyorsa.
            driver.quit();
            driver=null;
        }
    }

    public static void threadBrowserSet(String browser){
        threadBrowserName.set(browser);
    }

    public static String threadBrowserGet(){
        return threadBrowserName.get();
    }

}

