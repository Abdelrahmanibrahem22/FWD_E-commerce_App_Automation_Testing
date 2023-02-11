package org.example.StepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P03_homePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class D03_currenciesStepDef {
    P03_homePage homePage=new P03_homePage();
    @When("User select euro from dropdown list")
    public void change_Currencies(){
      Select currencies=new Select(homePage.select_Euro());
      currencies.selectByVisibleText("Euro");

    }
    @Then("Currencies change successfully")
    public void check_Currencies(){
        SoftAssert soft = new SoftAssert();
       List<WebElement>list= homePage.currencies_List();
        Assert.assertEquals(list.size(),4);
       for (WebElement element:list){
          Assert.assertTrue(element.getText().contains("€"));
      }
       soft.assertAll();
    }
}
