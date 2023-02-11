package org.example.Pages;

import org.example.StepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P02_login {
    public WebElement loginLink(){
        return Hooks.driver.findElement(By.xpath("//a[@class=\"ico-login\"]"));
    }
    public WebElement email(){
        return Hooks.driver.findElement(By.name("Email"));
    }
    public WebElement password(){
        return  Hooks.driver.findElement(By.id("Password"));
    }
    public WebElement login_Button(){
        return Hooks.driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
    }
    public WebElement my_Account()
    {
        return Hooks.driver.findElement(By.xpath("//a[@class=\"ico-account\"]"));
    }

    public WebElement wrong_Message()
    {
        return Hooks.driver.findElement(By.xpath("//div[@class=\"message-error validation-summary-errors\"]"));
    }
}
