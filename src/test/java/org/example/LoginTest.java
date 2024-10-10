package org.example;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest {
    public static WebDriver driver;
    public static LoginPage loginPage;
    public static ProfilePage profilePage;


    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(ConfProperties.getProperty("loginpage"));

        loginPage = new LoginPage(driver);
        profilePage = new ProfilePage(driver);
    }

    @Test
    public void loginTest() {
        loginPage.inputEmail(ConfProperties.getProperty("login"));
        loginPage.clickContinue();
        loginPage.inputPassword(ConfProperties.getProperty("password"));
        loginPage.clickButton();
        profilePage.entryCloseBtn();
        profilePage.entryCatalog();
        profilePage.entryProfilUser();
        profilePage.closeWindow();
        profilePage.entryExit();

    }
    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
