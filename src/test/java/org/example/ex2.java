package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.utils.webdriver.WebdriverUtils;

public class ex2 {
    @Test
    public void ex2()
    {
        WebdriverUtils driv=new WebdriverUtils();
        driv.openBrowser();
        WebDriver driver = driv.driver;
        driver.get("http://omayo.blogspot.com/");

//        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Bangalore");
//        driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.ENTER);
        driver.findElement(By.id("ta1")).sendKeys("ZopSmart");
        driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("tushar");
//        driver.findElement(By.xpath("//input[@id='alert1']")).click();
        driver.findElement(By.xpath("//div[@id=\"HTML7\"]/div[@class=\"widget-content\"]/button[@type=\"button\"]")).click();


    }
}
