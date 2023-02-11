package org.example.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P04_Search;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class D04_SearchStepDef {

    P04_Search search=new P04_Search();
    @When("User search by product name {string} in search field")
    public void search_By_Name(String name){
        search.search_Field().sendKeys(name);
    }
    @And("User click on search button")
    public void click_On_Search_Button(){
        search.search_Button().click();
    }
    @Then("Results appear with products related to the product name {string}")
    public void results_With_Name(String name){
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(Hooks.driver.getCurrentUrl().toLowerCase().contains("https://demo.nopcommerce.com/search?q="));
        List<WebElement> results=search.search_Results();
        for(WebElement product:results){
            soft.assertTrue(product.getText().toLowerCase().contains(name));
        }
        soft.assertAll();
    }
    @When("User search by product sku {string} in search field")
    public void search_By_Sku(String sku){

        search.search_Field().sendKeys(sku);
    }
    @Then("Results appear with products related to the product sku {string}")
    public void result_With_Sku(String sku){
        search.search_Results().get(0).click();
        Assert.assertTrue(search.product_Sku().getAttribute("content").contains(sku));
    }

}
