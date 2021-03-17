package com.vytrack.pages;

import com.vytrack.Utilities.ConfigurationReader;
import com.vytrack.pages.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(id="prependedInput")
    public WebElement inputUserName;

    @FindBy(id="prependedInput2")
    public WebElement inputPassword;

    @FindBy(id="_submit")
    public WebElement submitButton;

    public void loginAsDriver(){
        inputUserName.sendKeys(ConfigurationReader.getProperty("driver1"));
        inputPassword.sendKeys(ConfigurationReader.getProperty("password"));
        submitButton.click();
    }

}
