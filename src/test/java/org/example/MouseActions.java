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

import javax.swing.*;
import java.time.Duration;

public class MouseActions {
    @Test
    public void mouseAction(){
        WebdriverUtils driv=new WebdriverUtils();
        driv.openBrowser();
        WebDriver driver = driv.driver;
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/dragabble");
        Actions act = new Actions(driver);
//        WebElement dragBox = driver.findElement(By.id("dragBox"));
//        act.dragAndDropBy(dragBox,452,150).perform();
        WebElement rightClick= driver.findElement(By.id("draggableExample-tab-axisRestriction"));
        act.contextClick(rightClick).perform();


    }
}
