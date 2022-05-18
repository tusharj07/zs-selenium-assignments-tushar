package org.example;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.utils.webdriver.WebdriverUtils;

public class Alerts {
    @Test
    public void alert() throws InterruptedException {
        WebdriverUtils driv=new WebdriverUtils();
        driv.openBrowser();
        WebDriver driver = driv.driver;
        driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
//        Thread.sleep(5000);
        driver.findElement(By.name("confirmation")).click();
        Alert alert = driver.switchTo().alert();
//        String alertText=alert.getText();
//        System.out.println(alertText);
            alert.accept();
    }

}
