package com.vytrack.pages.fleet;

import com.vytrack.utils.Browser_Utils;
import com.vytrack.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Fleet_Page {

    @FindBy (xpath = "(//span[@class='title title-level-1'])[1]")
    private WebElement fleetModule;

    public void clickOnPage(String page){
        Actions actions = new Actions(Driver.getDriver());
        Browser_Utils.wait(2);

        actions.moveToElement(fleetModule).build().perform();
        Browser_Utils.wait(2);
        WebElement specificPage = Driver.getDriver().findElement(By.xpath("//span[.='"+page+"']"));

        Browser_Utils.wait(2);
        specificPage.click();
    }

    public static void navigateToFleetPage(String page){
        WebElement moduleXpath = Driver.getDriver().findElement(By.xpath("//*[contains(text(), 'Fleet') and @class='title title-level-1']"));
        WebElement pageXpath = Driver.getDriver().findElement(By.xpath("//span[.='"+page.trim()+"']"));

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(moduleXpath).build().perform();
        Browser_Utils.wait(1);
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.elementToBeClickable(pageXpath)).click();
    }


}
