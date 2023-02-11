package org.example.Pages;

import org.example.StepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class P01_Register {

    public WebElement register_Link(){
        return Hooks.driver.findElement(By.linkText("Register"));
    }
    public WebElement gender_Male(){
        return Hooks.driver.findElement(By.id("gender-male"));
    }
    public WebElement firstName(){
        return  Hooks.driver.findElement(By.id("FirstName"));
    }
    public  WebElement lastName(){
        return Hooks.driver.findElement(By.name("LastName"));
    }
    public WebElement birthDay(){
        return  Hooks.driver.findElement(By.name("DateOfBirthDay"));
    }
    public WebElement birthMonth(){
        return  Hooks.driver.findElement(By.name("DateOfBirthMonth"));
    }
    public WebElement birthYear(){
        return  Hooks.driver.findElement(By.name("DateOfBirthYear"));
    }
    public  WebElement email(){
        return Hooks.driver.findElement(By.id("Email"));
    }
    public WebElement companyName(){
        return Hooks.driver.findElement(By.name("Company"));
    }
    public WebElement password(){
        return  Hooks.driver.findElement(By.id("Password"));
    }
    public WebElement confirmPassword(){
        return  Hooks.driver.findElement(By.id("ConfirmPassword"));
    }
    public  WebElement registerButton(){
        return Hooks.driver.findElement(By.id("register-button"));

    }
    public WebElement successMessage(){
        return Hooks.driver.findElement(By.xpath("//div[@class=\"result\"]"));
    }


}
