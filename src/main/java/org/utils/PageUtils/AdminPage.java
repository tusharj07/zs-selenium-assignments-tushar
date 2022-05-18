package org.utils.PageUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage {
    @FindBy(id= "searchSystemUser_userName")
    private WebElement nameBox;

    public AdminPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    public WebElement getName() {
        return nameBox;
    }
}
