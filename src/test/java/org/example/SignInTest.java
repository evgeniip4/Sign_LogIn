package org.example;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SignInTest {
    public static SignInPage signInPage;
    public static LoginPage loginPage;
    public static ProfilePage profilePage;
    public static WebDriver driver;

    @BeforeClass
    public static void Setup() {

        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        profilePage = new ProfilePage(driver);
        signInPage = new SignInPage(driver);

        System.setProperty("webdriver.chrome.driver", "chromedriver");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(ConfProperties.getProperty("loginpage"));
    }
    @Test
    public void signInTest(){

        signInPage.clickLoginToSignInbtn();
        signInPage.inputEmail(ConfProperties.getProperty("email"));
        signInPage.inputName(ConfProperties.getProperty("name"));
        signInPage.inputPass(ConfProperties.getProperty("password"));
        signInPage.clickSignBtn();
    }
    @AfterClass
    public static void tearDown() {
        driver.quit();
    }
}