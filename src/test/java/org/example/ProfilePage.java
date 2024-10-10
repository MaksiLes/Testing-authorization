package org.example;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ProfilePage {

    public WebDriver driver;
    public ProfilePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    @FindBy (css = "#modal > div > div > div > div > div > div > div > div.AuthContent_button__VNGp7 > button")
    private WebElement closeBtn;

    @FindBy (className = "CatalogButton_wrapper__nZ5n8")
    private WebElement catalog;

    @FindBy (className = "Profile_wrapper__Zt16s")
    private WebElement profileUser;

    @FindBy(xpath = "//*[@id=\"popup-merge-users\"]/a")
    private WebElement closeWindowBtn;

    @FindBy (className = "Menu__menu_item_HQg8V")
    private WebElement exitBtn;

    public void entryCloseBtn() {
        closeBtn.click();
    }

    public void entryCatalog() {
        catalog.click();
    }

    public void entryProfilUser () {
        profileUser.click();
    }

    public void closeWindow() {
        closeWindowBtn.click();
    }
    public void entryExit() {
        exitBtn.click();
    }


}

