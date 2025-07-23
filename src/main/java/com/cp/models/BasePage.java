package com.cp.models;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class BasePage {

   private WebDriver driver;

    //Private Locators
   private By usernamefield = By.xpath("//input[@id='user-name']");
   private By passField = By.xpath("//input[@id='password']");
   private By loginBtn  = By.xpath("//input[@type='submit']");
   private By products = By.xpath("//span[@class='title']");

   public BasePage(WebDriver driver){
      this.driver= driver;

   }

   public void setUsername(String username){
      driver.findElement(usernamefield).sendKeys(username);
   }

   public void setPass(String password){
      driver.findElement(passField).sendKeys(password);

   }

     public void clickBtn(){
      driver.findElement(loginBtn).click();
     }

     public void validateLoginPage(){
         String actualText = driver.findElement(By.xpath("//span[@class='title']")).getText();
         Assert.assertEquals(actualText,"Products", "Login validation Failed...");

     }

}
