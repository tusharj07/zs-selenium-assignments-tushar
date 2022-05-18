package org.example;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.utils.webdriver.WebdriverUtils;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class ListBoxFlipkart {
    @Test
    public void price() throws InterruptedException {
        WebdriverUtils driv=new WebdriverUtils();
        driv.openBrowser();
        WebDriver driver = driv.driver;
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.flipkart.com/");
        driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
        driver.findElement(By.name("q")).sendKeys("pendrive");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        WebElement min=driver.findElement(By.xpath("(//select[@class='_2YxCDZ'])[1]"));
        Select Min=new Select(min);
        Min.selectByIndex(2);



        WebElement max=driver.findElement(By.xpath("(//select[@class='_2YxCDZ'])[2]"));
//        Thread.sleep(2000);

        Select Max=new Select(max);


        WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//option[@class='_3AsjWR']")));

        Max.selectByIndex(4);
        int no_of_pendrives=driver.findElements(By.xpath("//a[@class='s1Q9rs']")).size();

        System.out.println("No. of pendrives"+" = "+no_of_pendrives);
        List<WebElement> list = driver.findElements(By.xpath("//a[@class='s1Q9rs']"));
        List<String> names=new ArrayList<>();

        for (int i=0;i<list.size();i++){
            names.add(list.get(i).getText());
            System.out.println(list.get(i).getText());

        }
        try{
            list.get(2).click();
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            driver.close();
        }
    }

}
