package org.example;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.utils.webdriver.WebdriverUtils;

import java.time.Duration;

public class Frames{
    @Test
    public void alert() throws InterruptedException {
        WebdriverUtils driv=new WebdriverUtils();
        driv.openBrowser();
        WebDriver driver = driv.driver;
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
        driver.switchTo().frame("frame1");
        driver.switchTo().frame("frame3");
        boolean check=driver.findElement(By.id("a")).isSelected();
        if(!check){
            driver.findElement(By.id("a")).click();
        }

        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frame2");
        WebElement animals=driver.findElement(By.id("animals"));
        Select listBox=new Select(animals);
        Thread.sleep(1000);
        listBox.selectByIndex(2);
    }

}
