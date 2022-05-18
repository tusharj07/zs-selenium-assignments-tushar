package org.example;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.utils.webdriver.WebdriverUtils;

import java.time.Duration;

public class TestException {
    @Test
    public void noSuchElementException()
    {
        WebdriverUtils driv=new WebdriverUtils();
        driv.openBrowser();
        WebDriver driver = driv.driver;

        driver.get("https://practicetestautomation.com/practice-test-exceptions/");
        driver.findElement(By.id("add_btn")).click();

        WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@class=\"input-field\"])[2]")));



        driver.findElement(By.xpath("(//input[@class=\"input-field\"])[2]")).isEnabled();
    }
}
