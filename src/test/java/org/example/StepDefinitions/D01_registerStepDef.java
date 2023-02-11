package org.example.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P01_Register;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class D01_registerStepDef {
    P01_Register register=new P01_Register();
    @Given("User go to register page")
    public void go_Register_Page()
    {
        register.register_Link().click();
    }
    @And("User select gender type")
    public  void select_Gender(){
        register.gender_Male().click();
    }
    @When("User enter valid data")
    public void user_Enter_Valid_Data(){
        register.firstName().sendKeys("automation");
        register.lastName().sendKeys("tester");
        Select day=new Select(register.birthDay());
        day.selectByIndex(10);
        Select month=new Select(register.birthMonth());
        month.selectByVisibleText("December");
        Select year=new Select(register.birthYear());
        year.selectByVisibleText("2000");
        register.companyName().sendKeys("FWD");
        register.email().sendKeys("test@example.com");
        register.password().sendKeys("P@ssw0rd");
        register.confirmPassword().sendKeys("P@ssw0rd");
    }
    @Then("User click on register button")
    public void click_Register_Button(){
        register.registerButton().click();
    }
    @Then("Success message is displayed")
    public void success_Message(){
        SoftAssert soft=new SoftAssert();
        soft.assertTrue(register.successMessage().isDisplayed(), "Your registration completed");
        String actual = register.successMessage().getCssValue("color");
        String expected = "rgba(76, 177, 124, 1)";
        soft.assertEquals(actual, expected, "color is correct");
        soft.assertAll();
    }
}
