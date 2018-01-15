package step_definitions;

import cucumber.api.java.en.And;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.When;



public class HomeSteps {
    public WebDriver driver;

    
    
    public HomeSteps()
    {
    	driver = Hooks.driver;

    }
    
    @When("^I open adidas website$")
    public void i_open_automationpractice_website() throws Throwable {
        driver.get("https://www.adidas.fi/");
    }

    @And("I select spanish location")
    public void location() throws Throwable {
        driver.findElement(By.className("flag-large-es_ES")).click();
    }
}