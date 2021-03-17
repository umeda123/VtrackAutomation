package com.vytrack.pages.base;

import com.vytrack.Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    protected WebDriver driver = Driver.getDriver();

    public BasePage(){
        PageFactory.initElements(driver, this);
    }
}
