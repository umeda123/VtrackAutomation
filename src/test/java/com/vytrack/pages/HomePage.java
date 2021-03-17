package com.vytrack.pages;

import com.vytrack.pages.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//a[@class='unclickable']")
    public WebElement fleetModule;
}
