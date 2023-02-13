package org.example.StepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P03_homePage;
import org.testng.Assert;

import java.util.ArrayList;

public class D07_followUsStepDef {
P03_homePage homePage= new P03_homePage();
String faceBook_Url="https://www.facebook.com/nopCommerce";

@When("User click on facebook icon")
    public  void click_On_FaceBook_Icon(){
    homePage.facebook_Icon().click();
}
    @When("User click on twitter icon")
    public  void click_On_Twitter_Icon(){
        homePage.twitter_Icon().click();
    }
    @When("User click on rss icon")
    public  void click_On_Rss_Icon(){
        homePage.rss_Icon().click();
    }
    @When("User click on youtube icon")
    public  void click_On_Youtube_Icon(){
        homePage.youtube_Icon().click();
    }

@Then("This url {string} is opened in new tab")
    public void check_Url(String url) throws InterruptedException {
    Thread.sleep(2000);
    ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
    Hooks.driver.switchTo().window(tabs.get(1));
    Assert.assertEquals(Hooks.driver.getCurrentUrl(),url);
    Hooks.driver.close();
    Hooks.driver.switchTo().window(tabs.get(0));
}
}
