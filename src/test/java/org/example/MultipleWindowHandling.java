package org.example;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.utils.webdriver.WebdriverUtils;

import java.time.Duration;


public class MultipleWindowHandling {
    @Test
    public void windowHandling() throws InterruptedException {
        WebdriverUtils driv=new WebdriverUtils();
        driv.openBrowser();
        WebDriver driver = driv.driver;
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.get("https://demoqa.com/browser-windows");
        driver.findElement(By.xpath("//*[@id=\"windowButton\"]")).click();

        //switch control to new window
        String originalWindow = driver.getWindowHandle();
        for (String windowHandle : driver.getWindowHandles()) {
            if(!originalWindow.contentEquals(windowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }

        String text =driver.findElement(By.id("sampleHeading")).getText();
        System.out.println(text);

        //switching back control to original window
        String newWindow = driver.getWindowHandle();
        for (String windowHandle : driver.getWindowHandles()) {
            if(!newWindow.contentEquals(windowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
        driver.findElement(By.xpath("//*[@id=\"app\"]/header/a/img")).click();


    }



}