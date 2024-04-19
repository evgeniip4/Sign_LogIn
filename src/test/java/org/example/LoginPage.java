package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public WebDriver driver;
    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//*[@id=\"navbarMenuHeroA\"]/div/a[2]")
    private WebElement loginToLoginBtn;


    public void clickLoginToLoginbtn () {
        loginToLoginBtn.click();
    }

    @FindBy(xpath = "/html/body/section/div[2]/div/div/div/form/div[1]/div/input")
    private WebElement emailField;

    @FindBy(xpath = "/html/body/section/div[2]/div/div/div/form/div[2]/div/input")
    private WebElement passwdField;

    public void inputEmail (String email) {
        emailField.sendKeys(email);
    }
    public void inputPass (String pass) {
        passwdField.sendKeys(pass);
    }
    @FindBy(xpath = "/html/body/section/div[2]/div/div/div/form/button")
    private WebElement loginBtn;

    public void clickLoginbtn () {
        loginBtn.click();
    }


}
