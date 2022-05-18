package org.example;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.utils.webdriver.WebdriverUtils;

public class Task {
    @Test
    public void alert() throws InterruptedException {
        WebdriverUtils driv=new WebdriverUtils();
        driv.openBrowser();
        WebDriver driver = driv.driver;
        driver.get("http://demo.automationtesting.in/");
//        Thread.sleep(5000);
        driver.findElement(By.id("email")).sendKeys("xyz@gmail.com");
        driver.findElement(By.xpath("(//a[@href='Register.html'])[2]")).click();
        driver.findElement(By.xpath("(//a[@href='SwitchTo.html'])[1]"));
        WebElement ele = driver.findElement(By.xpath("(//a[@href='SwitchTo.html'])[1]"));
        Actions action = new Actions(driver);
        action.moveToElement(ele).build().perform();
        driver.findElement(By.xpath("(//a[@href='Frames.html'])[1]")).click();
        driver.findElement(By.xpath("//a[@href='#Multiple']")).click();

        driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"Multiple\"]/iframe")));
        driver.switchTo().frame(driver.findElement(By.xpath("//div[@class=\"row\"]/iframe")));
        driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Challenging task");

    }

}

