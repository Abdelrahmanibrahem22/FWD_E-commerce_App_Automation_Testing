package org.example.Pages;

import org.example.StepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P03_homePage {
    public WebElement select_Euro(){
        return Hooks.driver.findElement(By.id("customerCurrency"));
    }
    public List <WebElement> currencies_List(){
        return Hooks.driver.findElements(By.xpath("//span[@class=\"price actual-price\"]"));
    }
    public WebElement search_Field(){
        return Hooks.driver.findElement(By.id("small-searchterms"));
    }
    public WebElement search_Button(){
        return Hooks.driver.findElement(By.xpath("//button[contains(text(),'Search')]"));
    }
    public List<WebElement> search_Results(){
        return Hooks.driver.findElements(By.className("item-box"));
    }
    public WebElement product_Sku(){
        return Hooks.driver.findElement(By.cssSelector("div.master-wrapper-page:nth-child(7) div.master-wrapper-content div.master-column-wrapper div.center-1 div.page.product-details-page div.page-body form:nth-child(1) div:nth-child(1) > meta:nth-child(2)"));
    }
    public WebElement mainCategory_Computers(){
        return Hooks.driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/a[1]"));
    }
    public WebElement subCategory_Software(){
        return  Hooks.driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/ul[1]/li[3]/a[1]"));
    }
    public WebElement subCategory_Page_Title(){
        return Hooks.driver.findElement(By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[1]"));
    }
    public WebElement first_Slider(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"nivo-slider\"]/a[1]"));
    }
    public  WebElement second_Slider(){
        return  Hooks.driver.findElement(By.xpath("//*[@id=\"nivo-slider\"]/a[2]"));
    }
    public WebElement facebook_Icon(){
        return Hooks.driver.findElement(By.linkText("Facebook"));
    }
    public WebElement twitter_Icon(){
        return Hooks.driver.findElement(By.linkText("Twitter"));
    }
    public WebElement rss_Icon(){
        return Hooks.driver.findElement(By.linkText("RSS"));
    }
    public WebElement youtube_Icon(){
        return Hooks.driver.findElement(By.linkText("YouTube"));
    }
    public WebElement wishlist_Button(){
        return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[3]/div/div[2]/div[3]/div[2]/button[3]"));

    }
    public WebElement success_message(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"bar-notification\"]/div/p"));
    }
    public WebElement wishlist_tap(){
        return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[3]/a"));

    }
    public WebElement wishlist_Qty(){
        return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/form/div[1]/table/tbody/tr/td[6]/input"));
    }


}
