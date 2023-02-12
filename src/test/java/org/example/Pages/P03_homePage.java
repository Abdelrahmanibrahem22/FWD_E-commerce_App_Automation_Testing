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
        return Hooks.driver.findElement(By.linkText("Computers"));
    }
    public WebElement subCategory_Software(){
        return  Hooks.driver.findElement(By.linkText("Software"));
    }
    public WebElement subCategory_Page_Title(){
        return Hooks.driver.findElement(By.xpath("//*[@class='page-title']"));
    }

}
