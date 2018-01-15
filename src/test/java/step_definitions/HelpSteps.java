package step_definitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;


public class HelpSteps {
    public WebDriver driver;
    WebDriverWait wait;

    public HelpSteps()
    {
    	driver = Hooks.driver;

    }

    @When ("^I enter \"([^\"]*)\" in search bar")
    public void ayuda(String input) throws Throwable{
        driver.findElement(By.className("help-form-container")).findElement(By.name("q")).sendKeys(input);
    }

    @When("I select help in menu")
    public void help() throws Throwable{
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.className("inner___2zBm-"))));
        driver.findElement(By.className("inner___2zBm-")).findElement(By.tagName("a")).click();
    }

    @Then("the help page is displayed")
    public void help_page() throws Throwable{
        assertTrue(driver.findElement(By.className("ask-help-search")).isDisplayed());

    }

    @Then("suggestions are displayed")
    public void suggestions() throws Throwable{
        assertTrue(driver.findElement(By.className("suggestions")).isDisplayed());
    }

    
}