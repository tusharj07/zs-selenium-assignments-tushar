package org.utils.PageUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.utils.dataReader.PropertyFileUtils;
import java.io.IOException;
import java.time.Duration;

public class FlipkartFirstPage {
    public void openFlipkart(WebDriver driver) throws IOException {
        PropertyFileUtils prop=new PropertyFileUtils();
        String link = prop.propertyFile("src/test/resources/Property/google.properties", "finalassign");
        driver.get(link);
    }

    public void openRouters(WebDriver driver) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
        WebElement electronics = driver.findElement(By.xpath("(//div[@class='eFQ30H'])[5]"));

        Actions act=new Actions(driver);
        act.moveToElement(electronics).perform();
        WebElement accessories= driver.findElement(By.xpath("//a[@class=\"_6WOcW9\"][5]"));
        act.moveToElement(accessories).perform();

        driver.findElement(By.xpath("//a[@class='_6WOcW9 _3YpNQe'][4]")).click();
    }

    }

