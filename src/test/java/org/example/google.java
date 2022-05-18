package org.example;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.utils.webdriver.WebdriverUtils;

public class google
{
    @Test
    public void automation() throws InterruptedException {

        WebdriverUtils driv=new WebdriverUtils();
        driv.openBrowser();
        WebDriver driver = driv.driver;

            driver.get("https://google.com");
            driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Hello");
            driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.ENTER);
            Thread.sleep(1000);
            //driver.findElement(By).click();
            driver.close();
        }

}