package com.library.pages;

import com.library.utility.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{


    @FindBy(xpath = "//label[.='Email address']")
    public WebElement usernameBox;

    @FindBy(xpath = "//label[.='Password']")
    public WebElement passwordBox;

    @FindBy (xpath = "//button[@class='btn btn-lg btn-primary btn-block']")
    public WebElement loginButton;




    public void login(){
        usernameBox.sendKeys(ConfigurationReader.getProperty("username"));
        passwordBox.sendKeys(ConfigurationReader.getProperty("password"));
        loginButton.click();
    }

    public void login(String username,String password){

        usernameBox.sendKeys(username);
        passwordBox.sendKeys(password);

    }
}
