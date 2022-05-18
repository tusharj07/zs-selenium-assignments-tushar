package org.example;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.ss.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.utils.dataReader.PropertyFileUtils;
import org.utils.webdriver.WebdriverUtils;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;


public class UrbanLadderAutomation {


    @Test
    public void reader() throws IOException, InterruptedException {
        WebdriverUtils driv=new WebdriverUtils();
        driv.openBrowser();
        WebDriver driver = driv.driver;

        PropertyFileUtils prop=new PropertyFileUtils();
        String data = prop.propertyFile("src/test/resources/Property/google.properties", "url2");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get(data);
        Actions action = new Actions(driver);
        WebElement btn = driver.findElement(By.xpath("(//span[@class=\"topnav_itemname\"])[2]"));
        action.moveToElement(btn).perform();
        driver.findElement(By.xpath("//li[@class='subnav_item 1697']/a")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[@class=\"close-reveal-modal hide-mobile\"]")).click();
        driver.findElement(By.className("gname")).click();

        Thread.sleep(1000);
        WebElement axis= driver.findElement(By.xpath("//div[@class=\"noUi-handle noUi-handle-lower\"]"));
        action.dragAndDropBy(axis,40,0).perform();
        Thread.sleep(2000);
        driver.findElement(By.className("gname")).click();

        WebElement axiss= driver.findElement(By.xpath("//div[@class=\"noUi-handle noUi-handle-upper\"]"));
        action.dragAndDropBy(axiss,-30,0).perform();
        Thread.sleep(3000);

        List<WebElement> list = driver.findElements(By.xpath("(//div[@class=\"product-title product-title-sofa-mattresses\"])/span[@class=\"name\"]"));
        List<String> text=new ArrayList<>();
        for (int i=0;i<list.size();i++){
            text.add(list.get(i).getText());
        }
        try{
            list.get(2).click();
        }
        catch (Exception e){
            System.out.println(e);
        }

        String originalWindow = driver.getWindowHandle();
        for (String windowHandle : driver.getWindowHandles()) {
            if(!originalWindow.contentEquals(windowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
        Thread.sleep(3000);

        String txt =driver.findElement(By.xpath("//div[@class=\"warranty-details\"]/span/span/b")).getText();

        String y=txt.substring(0,2);
        int i=Integer.parseInt(y);
        if (i>=12){
            System.out.println("Yes,the product has 12 months warranty!");

        }








    }
}