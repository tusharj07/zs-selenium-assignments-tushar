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

import java.util.ArrayList;
import java.util.List;

public class GoogleAutoSuggestion {

    @Test

    public void suggestion() throws InterruptedException {
        WebdriverUtils driv=new WebdriverUtils();
        driv.openBrowser();
        WebDriver driver = driv.driver;
        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("(//input[@type=\"text\"])[1]")).sendKeys("python");
        Thread.sleep(2000);
        int x=driver.findElements(By.xpath("//div[@class=\"wM6W7d\"]/span")).size();
        List<WebElement> list = driver.findElements(By.xpath("//div[@class=\"wM6W7d\"]/span"));
        List<String> text=new ArrayList<>();

        for (int i=0;i<list.size();i++){
            text.add(list.get(i).getText());
            System.out.println(list.get(i).getText());

        }
        try{
            list.get(100).click();
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            driver.close();
        }






    }
}