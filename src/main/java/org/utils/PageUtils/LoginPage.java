package org.utils.PageUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utils.webdriver.WebdriverUtils;

public class LoginPage {

    @FindBy(id = "txtUsername")
    private WebElement username;

    @FindBy(id = "txtPassword")
    private WebElement password;

    public LoginPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getUsername() {

        return username;
    }
    public void logg(WebDriver driver){
        LoginPage log=new LoginPage(driver);


        log.getUsername().sendKeys("Admin");
        log.getPassword().sendKeys("admin123");
        driver.findElement(By.id("btnLogin")).click();
    }
}
