package org.example;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.utils.dataReader.PropertyFileUtils;
import org.utils.webdriver.WebdriverUtils;

import java.io.IOException;
import java.time.Duration;

public class StaleElementReferenceException {
    @Test
    public void staleElement() throws IOException {
        WebdriverUtils driv=new WebdriverUtils();
        driv.openBrowser();
        WebDriver driver=driv.driver;
        PropertyFileUtils prop=new PropertyFileUtils();
        String link = prop.propertyFile("src/test/resources/Property/google.properties", "stale");
        driver.get(link);
        WebElement instruction= driver.findElement(By.id("instructions"));
        driver.findElement(By.id("add_btn")).click();
        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOf(instruction));
        try {
            Boolean isDisplayed = instruction.isDisplayed();
            System.out.println(isDisplayed);
        }
        catch(Exception e) {
            System.out.println(e);
            System.out.println("Instruction text element is no longer displayed");
        }
    }
}
