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

public class ActiTime {
    @Test
    public void login()
    {
        WebdriverUtils driv=new WebdriverUtils();
        driv.openBrowser();
        WebDriver driver = driv.driver;
        driver.get("https://demo.actitime.com/login.do");
        String user=driver.findElement(By.xpath("//td[@id=\"userCredentialsUsername\"]/b")).getText();
        driver.findElement(By.id("username")).sendKeys(user);

        String pass=driver.findElement(By.xpath("//table[@id=\"demoCredentials\"]/tbody/tr[4]/td/b")).getText();
        driver.findElement(By.name("pwd")).sendKeys(pass);
        driver.findElement(By.xpath("//a[@id=\"loginButton\"]")).click();

    }
}
