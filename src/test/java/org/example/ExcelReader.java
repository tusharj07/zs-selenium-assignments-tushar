package org.example;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.ss.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ExcelReader {
    @Test
    public void reader() throws IOException {

//        FileInputStream fis1=new FileInputStream("src/test/resources/Property/google.properties");
        FileInputStream fis2=new FileInputStream("src/test/resources/Excel/data.xlsx");

        Properties prop=new Properties();
        ExcelReader read=new ExcelReader();
//        prop.load(fis1);


//        driver.get(prop.getProperty("url"));
        Workbook wb= WorkbookFactory.create(fis2);
//        Sheet sh= wb.getSheet("data");
//        Row row = sh.getRow(3);
//        Cell cell = row.getCell(0);
//        String value = cell.getStringCellValue();
        for(int i=1;i<=10;i++) {
            String print = wb.getSheet("data").getRow(i).getCell(0).getStringCellValue();
            System.out.println(print);
        }
//        driver.findElement(By.name("q")).sendKeys(prop.getProperty("Name"));
    }
}

