package org.example.StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.Hook;
import org.example.Pages.P02_login;
import org.testng.asserts.SoftAssert;

public class D02_loginStepDef
{
    P02_login login =new P02_login();
    @Given("User go to login page")
    public void loginLink(){
        login.loginLink().click();
    }
    @When("User login with valid email and password")
    public void login_With_Valid_Email_And_Password(){
        login.email().sendKeys("test@example.com");
        login.password().sendKeys("P@ssw0rd");

    }
    @Then("User click on login button")
    public void click_on_login(){
        login.login_Button().click();
    }
    @Then("User login to the system successfully")
    public void User_login_to_the_system_successfully(){
        SoftAssert soft=new SoftAssert();
        soft.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/","login successfully");
        soft.assertTrue(login.my_Account().isDisplayed(),"My account");
        soft.assertAll();
    }
    @When("User login with invalid email or password")
    public void login_With_Invalid_Data(){
        login.email().clear();
        login.email().sendKeys("Wrong@example.com");
        login.password().clear();
        login.password().sendKeys("P@ssw0rd");
    }
    @Then("User could not login to the system")
    public void error_Message(){
        SoftAssert soft = new SoftAssert();
        login.wrong_Message().isDisplayed();
        String actual = login.wrong_Message().getText();
        soft.assertEquals(actual, "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found", "Wrong Message");
        actual = login.wrong_Message().getCssValue("color");
        String expected = "rgba(228, 67, 75, 1)";
        soft.assertEquals(actual, expected, "color is correct");
        soft.assertAll();

    }
}
