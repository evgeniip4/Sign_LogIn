package org.example;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class LoginTest {

    public static LoginPage loginPage;
    public static ProfilePage profilePage;
    public static WebDriver driver;

    @BeforeClass
    public static void Setup() {

        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        profilePage = new ProfilePage(driver);

        System.setProperty("webdriver.chrome.driver", "chromedriver");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(ConfProperties.getProperty("loginpage"));
    }

    @Test
    public void loginTest() {
        loginPage.clickLoginToLoginbtn();
        loginPage.inputEmail(ConfProperties.getProperty("email"));
        loginPage.inputPass(ConfProperties.getProperty("password"));
        loginPage.clickLoginbtn();
        String user = profilePage.getUserName();
        String userFact = "Welcome, " + ConfProperties.getProperty("name") +"!";
        Assert.assertEquals(userFact, user);
    }

    @AfterClass
    public static void tearDown() {
        profilePage.userLogout();
        driver.quit();
        }
}
