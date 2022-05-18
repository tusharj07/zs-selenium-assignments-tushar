package org.utils.PageUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class FlipkartThirdPage {
    public void switchtoNewWindow(WebDriver driver){
        String originalWindow = driver.getWindowHandle();
        for (String windowHandle : driver.getWindowHandles()) {
            if(!originalWindow.contentEquals(windowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
    }

    public void checkForPIN(WebDriver driver){
        driver.findElement(By.id("pincodeInputId")).sendKeys("560056");
        driver.findElement(By.id("pincodeInputId")).sendKeys(Keys.ENTER);
    }
}
