package org.example;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.utils.dataReader.PropertyFileUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileRead {
    @Test
    public void fileRead() throws IOException, InterruptedException {
        PropertyFileUtils prop=new PropertyFileUtils();
        String x=prop.propertyFile("src/test/resources/Property/google.properties","ActiUrl");
        String user=prop.propertyFile("src/test/resources/Property/google.properties","ActiUsername");
        String pass=prop.propertyFile("src/test/resources/Property/google.properties","ActiPassword");
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
//        FileInputStream fis=new FileInputStream("src/test/resources/Property/google.properties");
//        Properties prop=new Properties();
//        prop.load(fis);
//        driver.get(prop.getProperty("ActiUrl"));
        driver.get(x);
        driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys(user);
        driver.findElement(By.xpath("//input[@name=\"pwd\"]")).sendKeys(pass);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@id=\"loginButton\"]/div")).click();

    }
}
