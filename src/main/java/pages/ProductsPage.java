package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {
    public WebDriver driver;
    public By productImage = By.className("inventory_item_img");
    public By addToCartButton = By.id("add-to-cart-sauce-labs-backpack");
    public By addProduct1 = By.id("add-to-cart-sauce-labs-bolt-t-shirt");
    public By addProduct2 = By.id("add-to-cart-sauce-labs-fleece-jacket");
    public By addProduct3 = By.id("add-to-cart-test.allthethings()-t-shirt-(red)");

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
    }
    public boolean homePageElementsPresent(){
        return driver.findElement(productImage).isDisplayed() && driver.findElement(addToCartButton).isDisplayed();
    }
    public void addingProductsToCart(){
        driver.findElement(addProduct1).click();
        driver.findElement(addToCartButton).click();
        driver.findElement(addProduct2).click();
        driver.findElement(addProduct3).click();
    }

}
