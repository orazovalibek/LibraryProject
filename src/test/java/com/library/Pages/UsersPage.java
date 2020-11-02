package com.library.Pages;

import com.library.Utilities.Driver;
import com.library.Utilities.Thread;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class UsersPage extends BasePage{

    @FindBy(id = "user_groups")
    private WebElement userGroupDropdown;

    public void selectFromUserGroupDropdown(String groupName){
        Select select = new Select(userGroupDropdown);
        Thread.wait(2);
        select.selectByVisibleText(groupName);
        Thread.wait(2);
    }

    public String actualGroupName(){

        return Driver.getDriver().findElement(By.xpath("//tbody/tr[3]/td[5]")).getText();

    }



}
