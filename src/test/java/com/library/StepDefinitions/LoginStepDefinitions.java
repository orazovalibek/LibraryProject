package com.library.StepDefinitions;

import com.library.Pages.BasePage;
import com.library.Pages.LoginPage;
import com.library.Utilities.ConfigurationReader;
import com.library.Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import sun.jvm.hotspot.debugger.Page;

public class LoginStepDefinitions {

    LoginPage loginPage = new LoginPage();

    @Given("user on the login page")
    public void user_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }


    @When("user logs in as a {string}")
    public void user_logs_in_as_a(String string) {
        loginPage.login(string);
    }


    @Then("user should see {string} page")
    public void user_should_see_home_page(String string) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);
        wait.until(ExpectedConditions.urlContains(string.toLowerCase()));
        String url = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(url.contains(string.toLowerCase()));
    }


}
