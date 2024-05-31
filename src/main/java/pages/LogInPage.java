package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogInPage {
    public WebDriver driver;
    public By userNameInputField = By.id("user-name");
    public By passwordInputField = By.id("password");
    public By logInButton = By.id("login-button");
    public By errorMessage = By.xpath("//*[contains(text(),'Epic sadface')]");

    public LogInPage(WebDriver driver) {
        this.driver = driver;
    }
    public void enterUserName(String userName){
        driver.findElement(userNameInputField).sendKeys(userName);
    }
    public void enterPassword(String password){
        driver.findElement(passwordInputField).sendKeys(password);
    }
    public void clickOnLogInButton(){
        driver.findElement(logInButton).click();
    }
    public void successfulLogIn(){
        driver.findElement(userNameInputField).sendKeys("standard_user");
        driver.findElement(passwordInputField).sendKeys("secret_sauce");
        driver.findElement(logInButton).click();
    }
    public boolean errorMessageIsPresent(){
        return driver.findElement(errorMessage).isDisplayed();
    }
}

