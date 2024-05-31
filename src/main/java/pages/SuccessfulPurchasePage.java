package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SuccessfulPurchasePage {
    public WebDriver driver;

    public By successfulPurchaseMessage = By.xpath("//*[text()='Thank you for your order!']");

    public SuccessfulPurchasePage(WebDriver driver) {
        this.driver = driver;
    }
    public boolean successfulPurchaseMessagePresent(){
        return driver.findElement(successfulPurchaseMessage).isDisplayed();
    }
}
