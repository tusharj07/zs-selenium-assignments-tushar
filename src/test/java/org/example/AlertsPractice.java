package org.example;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.utils.webdriver.WebdriverUtils;

public class AlertsPractice
{
    @Test
    public void alerts() throws InterruptedException {
        WebdriverUtils driv=new WebdriverUtils();
        driv.openBrowser();
        WebDriver driver = driv.driver;
        driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
        driver.findElement(By.name("alert")).click();
        Thread.sleep(1000);
        Alert alert = driver.switchTo().alert();
        String alertText=alert.getText();
        System.out.println(alertText);
        alert.accept();

        //confirmation box

        driver.findElement(By.name("confirmation")).click();
        Thread.sleep(1000);
        Alert confirmation = driver.switchTo().alert();
        String confirmationText=alert.getText();
        System.out.println(confirmationText);
        confirmation.accept();

        //prompt

//        driver.findElement(By.name("prompt")).sendKeys("Hello");
        Thread.sleep(1000);
        driver.findElement(By.name("prompt")).click();

        Alert prompt = driver.switchTo().alert();
        prompt.sendKeys("Selenium");
        Thread.sleep(2000);
        prompt.accept();

        //file upload

        driver.findElement(By.name("upload")).sendKeys("/home/raramuri/Desktop/alerts_practice");
        Thread.sleep(2000);


        //double click
        WebElement element = driver.findElement(By.id("double-click"));
        Actions act = new Actions(driver);
        act.doubleClick(element);
        act.perform();

        Alert double_click = driver.switchTo().alert();
        String doubleclickText=double_click.getText();
        System.out.println(doubleclickText);
        Thread.sleep(2000);
        double_click.accept();


        //hover

        WebElement ele = driver.findElement(By.id("sub-menu"));
        Actions action = new Actions(driver);
        action.moveToElement(ele).perform();
        Thread.sleep(1000);


    }
}