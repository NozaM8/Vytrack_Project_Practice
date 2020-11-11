package com.vytrack.pages;

import com.vytrack.utils.Configuration_Reader;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_Page extends  Base_Page{

    @FindBy (id = "prependedInput")
    private WebElement username;

    @FindBy (id = "prependedInput2")
    private WebElement password;

    String driverUsernameValue = Configuration_Reader.getProperty("driver.username");
    String storemanagerUsername = Configuration_Reader.getProperty("storemanager.username");
    String salesmanagerUsername = Configuration_Reader.getProperty("salesmanager.username");
    String passwordValue = Configuration_Reader.getProperty("password");

    public void login(){
        username.sendKeys(driverUsernameValue);
        password.sendKeys(passwordValue, Keys.ENTER);

    }

    public void login(String role){
        if(role.equalsIgnoreCase("driver")){
            username.sendKeys(driverUsernameValue);
        }else if(role.equalsIgnoreCase("store manager")){
            username.sendKeys(storemanagerUsername);
        }else if(role.equalsIgnoreCase("sales manager")){
            username.sendKeys(salesmanagerUsername);
        }else{
            System.out.println("Such role doesn't exist!");
        }
        password.sendKeys(passwordValue, Keys.ENTER);
    }



}
