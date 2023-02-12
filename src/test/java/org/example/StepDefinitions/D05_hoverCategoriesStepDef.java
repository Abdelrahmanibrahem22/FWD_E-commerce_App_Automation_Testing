package org.example.StepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P03_homePage;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class D05_hoverCategoriesStepDef {
    P03_homePage homePage =new P03_homePage();
    String subCategory_Title;
    @When("User select a category and click on one of its subcategories")
    public void select_MainCategory_And_Hover_To_Subcategory(){
        Actions ac=new Actions(Hooks.driver);
        ac.moveToElement(homePage.mainCategory_Computers()).
                moveToElement(homePage.mainCategory_Computers()).build().perform();
        WebDriverWait wait=new WebDriverWait(Hooks.driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOf(homePage.mainCategory_Computers()));
        subCategory_Title=homePage.subCategory_Software().getText().toLowerCase().trim();
        ac.moveToElement(homePage.mainCategory_Computers()).
                moveToElement(homePage.subCategory_Software()).click().build().perform();

    }
    @Then("User should be navigated to a page that contains that product subcategory")
    public void check_Result_Of_Navigate(){
        SoftAssert soft=new SoftAssert();
        soft.assertTrue(Hooks.driver.getCurrentUrl().contains("Software"));
        soft.assertEquals(homePage.subCategory_Page_Title().getText(), "Software");
        soft.assertTrue(homePage.subCategory_Page_Title().getText().
                toLowerCase().equals(subCategory_Title));
        soft.assertAll();
    }
}
