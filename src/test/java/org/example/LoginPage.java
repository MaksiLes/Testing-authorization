package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public WebDriver driver;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }

    @FindBy (id = "auth__input--enterEmailOrLogin")
    private WebElement loginBtn;

    @FindBy (className = "Button_button__vpqEH")
    private WebElement continueBtn;

    @FindBy (name = "pwd")
    private WebElement passwordBtn;

    @FindBy (className = "Button_button__vpqEH")
    private WebElement button;

    public void inputEmail(String email) {
        loginBtn.sendKeys(email);
    }
    public void clickContinue() {
        continueBtn.click();
    }

    public void inputPassword(String password) {
        passwordBtn.sendKeys(password);
    }

    public void clickButton() {
        button.click();
    }
}
