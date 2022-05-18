package org.example;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.utils.webdriver.WebdriverUtils;

public class Omayo {
    @Test
    public void listBox()
    {
        WebdriverUtils driv=new WebdriverUtils();
        driv.openBrowser();
        WebDriver driver = driv.driver;
        driver.get("http://omayo.blogspot.com/");
        WebElement listBox=driver.findElement(By.id("drop1"));
        Select s=new Select(listBox);
        s.selectByIndex(2);
    }

}
