package org.example;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.utils.webdriver.WebdriverUtils;

public class ActiTimeAlignment {
    @Test
    public void alignment()
    {
        WebdriverUtils driv=new WebdriverUtils();
        driv.openBrowser();
        WebDriver driver = driv.driver;
        driver.get("https://demo.actitime.com/login.do");
        int username_x_axis=driver.findElement(By.id("username")).getLocation().getX();
        System.out.println(username_x_axis);
        int password_x_axis=driver.findElement(By.name("pwd")).getLocation().getX();
        System.out.println(password_x_axis);






        if (username_x_axis==password_x_axis)
        {
            System.out.println("Aligned");
        }
        else
        {
            System.out.println("Not Aligned");
        }

        driver.close();

    }

}
