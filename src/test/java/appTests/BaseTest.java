package appTests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.*;

public class BaseTest {
    public static WebDriver driver;

    @BeforeClass
    public static void beforeClass() throws Exception {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }
    @AfterClass
    public static void afterClass() throws Exception {
        driver.quit();
    }
    @Before
    public void setUp() throws Exception {
        driver.get("https://www.saucedemo.com/");
    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(3000);
    }

    LogInPage logInPage = new LogInPage(driver);
    ProductsPage productsPage = new ProductsPage(driver);
    YourCartPage yourCartPage = new YourCartPage(driver);
    CheckoutPage checkoutPage = new CheckoutPage(driver);
    CheckoutOverviewPage checkoutOverviewPage = new CheckoutOverviewPage(driver);
    SuccessfulPurchasePage successfulPurchasePage = new SuccessfulPurchasePage(driver);

}
