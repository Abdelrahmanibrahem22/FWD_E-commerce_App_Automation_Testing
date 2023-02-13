package org.example.StepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P03_homePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class D06_homeSlidersStepDef {
     P03_homePage homePage=new P03_homePage();
     String first_Slider_Url="https://demo.nopcommerce.com/nokia-lumia-1020";
     String second_Slider_Url="https://demo.nopcommerce.com/iphone-6";
    @When("User click on first slider")
    public void click_on_first_Slider(){
        homePage.first_Slider().click();
    }
    @Then("User should be navigated to first slider page")
    public void check_Navigate_of_FirstSlider(){

        Assert.assertEquals(Hooks.driver.getCurrentUrl(),first_Slider_Url);
    }
    @When("User click on second slider")
    public void click_on_second_Slider() throws InterruptedException {
        Thread.sleep(4000);
        homePage.second_Slider().click();
    }
    @Then("User should be navigated to second slider page")
    public void check_Navigate_of_SecondSlider(){
       // WebDriverWait wait=new WebDriverWait(Hooks.driver, Duration.ofSeconds(5));
        //wait.until(ExpectedConditions.urlToBe(second_Slider_Url));
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),second_Slider_Url);
    }

}
