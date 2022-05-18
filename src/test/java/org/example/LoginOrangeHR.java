package org.example;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.utils.PageUtils.AdminPage;
import org.utils.PageUtils.LoginPage;
import org.utils.dataReader.PropertyFileUtils;
import org.utils.webdriver.WebdriverUtils;

import java.io.IOException;

public class LoginOrangeHR {
    @Test
    public void login() throws InterruptedException, IOException {

        WebdriverUtils driv=new WebdriverUtils();
        driv.openBrowser();
        WebDriver driver=driv.driver;
        LoginPage log=new LoginPage(driver);
        AdminPage admin=new AdminPage(driver);
        PropertyFileUtils prop=new PropertyFileUtils();
        String link = prop.propertyFile("src/test/resources/Property/google.properties", "orangeHR");
        driver.get(link);
        log.logg(driver);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']/b")).click();
        String name= driver.findElement(By.xpath("(//tr[@class='even']/td)[2]")).getText();
        admin.getName().sendKeys(name);
        driver.findElement(By.id("searchBtn")).click();

        String name2=driver.findElement(By.xpath("//td[@class=\"left\"]/a")).getText();
        System.out.println(name2);
        if (name.equals(name2)){
            System.out.println("User found");
        }
        driver.close();
    }
}
