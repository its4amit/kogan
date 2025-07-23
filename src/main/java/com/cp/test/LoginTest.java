package com.cp.test;

import com.cp.models.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {

    @Test
    public void testLogin(){

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");

        BasePage login = new BasePage(driver);
        login.setUsername("standard_user");
        login.setPass("secret_sauce");
        login.clickBtn();
        login.validateLoginPage();

        driver.quit();

    }
}
