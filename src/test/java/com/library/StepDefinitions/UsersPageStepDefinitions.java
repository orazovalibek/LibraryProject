package com.library.StepDefinitions;

import com.library.Pages.BasePage;
import com.library.Pages.LoginPage;
import com.library.Pages.UsersPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class UsersPageStepDefinitions {

    UsersPage usersPage = new UsersPage();

    @When("clicks to the {string} tab")
    public void clicks_to_the_tab(String string) {
        usersPage.navigateAndClickTo(string);
    }

    @When("choose {string} from Users Group dropdown")
    public void choose_from_dropdown(String string) {
        usersPage.selectFromUserGroupDropdown(string);
    }

    @Then("user should see only users from {string} group")
    public void user_should_see_only_users_from_group(String string) {
        String expectedUserGroupName = string;
        String actualUserGroupName = usersPage.actualGroupName();

        Assert.assertEquals("Group names not equal!!!", actualUserGroupName,expectedUserGroupName);
    }


}
