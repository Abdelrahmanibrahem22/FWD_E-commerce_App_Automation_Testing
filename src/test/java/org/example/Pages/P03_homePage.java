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
}
