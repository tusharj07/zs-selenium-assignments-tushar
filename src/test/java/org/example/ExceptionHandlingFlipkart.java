package org.example;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.utils.webdriver.WebdriverUtils;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class ExceptionHandlingFlipkart {

    @Test

    public void iPhone() throws InterruptedException {
        WebdriverUtils driv=new WebdriverUtils();
        driv.openBrowser();
        WebDriver driver = driv.driver;
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.flipkart.com/");
        driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
        driver.findElement(By.name("q")).sendKeys("iphone13");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        int no_of_iphones=driver.findElements(By.xpath("//div[@class=\"_4rR01T\"]")).size();

        System.out.println("No. of iPhones"+" = "+no_of_iphones);
        List<WebElement> list = driver.findElements(By.xpath("//div[@class=\"_4rR01T\"]"));
        List<String> names=new ArrayList<>();

        for (int i=0;i<list.size();i++){
            names.add(list.get(i).getText());
            System.out.println(list.get(i).getText());

        }
        try{
            list.get(1).click();
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            driver.close();
        }







    }
}
