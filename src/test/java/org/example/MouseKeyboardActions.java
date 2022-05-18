package org.example;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.utils.webdriver.WebdriverUtils;

import java.time.Duration;

public class MouseKeyboardActions {
@Test

        public static void actions() {

    WebdriverUtils driv=new WebdriverUtils();
    driv.openBrowser();
    WebDriver driver = driv.driver;
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            driver.manage().window().maximize();
            driver.get("https://chercher.tech/java/mouse-keyboard-actions-class-selenium-webdriver");
            WebElement element = driver.findElement(By.xpath("//a[@href='https://chercher.tech/playwright-java/open-browser-playwright-java']"));
            Actions act = new Actions(driver);
            act.contextClick(element);
            act.perform();
        }

}
