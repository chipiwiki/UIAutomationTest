package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;


public class BasketSteps {
    public WebDriver driver;


    public BasketSteps()
    {
    	driver = Hooks.driver;

    }

    @And("I open the shopping cart")
    public void open_cart() throws Throwable{
        driver.findElement(By.className("header_cart_link___1fecd"));
    }

    @When("I do mouse over the basket")
    public void mouseOver() throws Throwable{
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.className("header_cart_link___1fecd"));
        action.moveToElement(we).build().perform();
    }
    @Then("my basket is empty")
    public void basket() throws Throwable{
        assertTrue(driver.findElement(By.className("empty_cart_notification___1VKII")).isDisplayed());
    }

}