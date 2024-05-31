package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
    public WebDriver driver;
    public By firstNameField = By.id("first-name");
    public By lastNameField = By.id("last-name");
    public By postalCodeField = By.id("postal-code");
    public By continueButton = By.id("continue");

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }
    public void fillInYourInformation(){
        driver.findElement(firstNameField).sendKeys("Christina");
        driver.findElement(lastNameField).sendKeys("Ross");
        driver.findElement(postalCodeField).sendKeys("6922");
        driver.findElement(continueButton).click();
    }
}
