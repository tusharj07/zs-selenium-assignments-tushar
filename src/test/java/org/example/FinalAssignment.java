package org.example;

import org.apache.poi.ss.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.utils.PageUtils.ExportData;
import org.utils.PageUtils.FlipkartFirstPage;
import org.utils.PageUtils.FlipkartSecondPage;
import org.utils.PageUtils.FlipkartThirdPage;
import org.utils.dataReader.PropertyFileUtils;
import org.utils.webdriver.WebdriverUtils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.*;

public class FinalAssignment {
    @Test
    public void finalassign() throws InterruptedException, IOException {

        WebdriverUtils driv=new WebdriverUtils();
        driv.openBrowser();
        WebDriver driver=driv.driver;


        FlipkartFirstPage flip=new FlipkartFirstPage();
        flip.openFlipkart(driver);

        flip.openRouters(driver);

        FlipkartSecondPage flips= new FlipkartSecondPage();
        flips.captureRouters(driver);

        FlipkartThirdPage flipt=new FlipkartThirdPage();
        flipt.switchtoNewWindow(driver);

        flipt.checkForPIN(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        String data = driver.findElement(By.xpath("//div[@class=\"_2418kt\"]/ul")).getText();
        System.out.println(data);

        ExportData exp=new ExportData();
        exp.excel(data);





    }
}
