package org.example.StepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P03_homePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class D08_WishlistStepDef {
P03_homePage homePage =new P03_homePage();
WebDriverWait wait=new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));
@When("User click on wishlist icon under product")
    public void click_On_Wishlist_Icon(){
    homePage.wishlist_Button().click();
}
@When("User click on wishlist tap at top of page")
    public void click_On_Wishlist_Tap() throws InterruptedException {
    Thread.sleep(500);
    wait.until(ExpectedConditions.invisibilityOf(homePage.success_message()));
    homePage.wishlist_tap().click();
}
@Then("Success message is displayed successfully")
    public void message_Is_Displayed_Successfully() throws InterruptedException {
    SoftAssert soft=new SoftAssert();
    Thread.sleep(1000);
    soft.assertTrue(homePage.success_message().isDisplayed(), "The product has been added to your ");
    String actual = homePage.success_message().getCssValue("color");
    String expected = "rgba(255, 255, 255, 1)";
    soft.assertEquals(actual, expected, "color is correct");
    soft.assertAll();
}
@Then("Size of wishlist should be bigger than 0")
    public void check_Size(){
    int qyt=Integer.parseInt(homePage.wishlist_Qty().getAttribute("value"));
    Assert.assertTrue(qyt > 0);

}
}
