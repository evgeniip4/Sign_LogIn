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
    @FindBy(xpath = "/html/body/section/div[2]/div/h1")
    private WebElement userMenu;

    @FindBy(xpath = "//*[@id=\"navbarMenuHeroA\"]/div/a[3]")
    private WebElement logoutBtn;

    public String getUserName() {
        String userName = userMenu.getText();
        return userName; }

    public void userLogout() {
        logoutBtn.click();}


}
