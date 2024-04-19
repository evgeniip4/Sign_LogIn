package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SignInPage {
    public SignInPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//*[@id=\"navbarMenuHeroA\"]/div/a[3]")
        private WebElement singInBtn;

    public void clickLoginToSignInbtn () {
            singInBtn.click();
    }

    @FindBy(xpath = "/html/body/section/div[2]/div/div/div/form/div[1]/div/input")
    private WebElement emailField;

    @FindBy(xpath = "/html/body/section/div[2]/div/div/div/form/div[2]/div/input")
    private WebElement nameField;

    @FindBy(xpath = "/html/body/section/div[2]/div/div/div/form/div[3]/div/input")
    private WebElement passwdField;

    public void inputEmail (String email) {
            emailField.sendKeys(email);
    }
    public void inputName (String name) {
        nameField.sendKeys(name);
    }
    public void inputPass (String pass) {
        passwdField.sendKeys(pass);
    }
    @FindBy(xpath = "/html/body/section/div[2]/div/div/div/form/button")
    private WebElement signBtn;

    public void clickSignBtn () {
            signBtn.click();
    }




}