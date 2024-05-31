package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class YourCartPage {
    public WebDriver driver;
    public By shoppingCartBadge = By.className("shopping_cart_badge");
    public By removeFromCartButton = By.id("remove-sauce-labs-backpack");
    public By shoppingCartBadgeNumber = By.xpath("//*[text()='3']");
    public By checkoutButton = By.id("checkout");
    public YourCartPage(WebDriver driver) {
        this.driver = driver;
    }
    public boolean yourCartPageElementsPresent(){
        return driver.findElement(removeFromCartButton).isDisplayed() && driver.findElement(shoppingCartBadge).isDisplayed();
    }
    public void clickOnShoppingCartButton(){
        driver.findElement(shoppingCartBadge).click();
    }
    public void removeProductFromCart(){
        driver.findElement(removeFromCartButton).click();
    }
    public boolean productRemovedFromCart (){
        return driver.findElement(shoppingCartBadgeNumber).isDisplayed();
    }
    public void clickOnCheckoutButton(){
        driver.findElement(checkoutButton).click();
    }

}
