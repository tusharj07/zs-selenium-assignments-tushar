package org.example;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.utils.webdriver.WebdriverUtils;

public class example
{
    @Test
    public void automation() throws InterruptedException {

        WebdriverUtils driv=new WebdriverUtils();
        driv.openBrowser();
        WebDriver driver= driv.driver;
            driver.get("http://results.drait.in/");
//            driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Hello");
            driver.findElement(By.xpath("//*[@id=\"myDIV\"]/button[3]")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"ugpg\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"ugpg\"]/option[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"usn\"]")).sendKeys("1DA18IS054");
        Thread.sleep(10000);
        driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
//        Thread.sleep(1000);
//            driver.close();

    }
}