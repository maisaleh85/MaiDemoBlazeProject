package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.HomePage;

public class HomeSteps {
    HomePage homePage=new HomePage();

    @When("the user goes the demoblaze URL")
    public void the_user_goes_the_demoblaze_url() {
        homePage.driver.get("https://www.demoblaze.com/");

    }
    @Then("The user sees the presence of logo,menu items")
    public void the_user_sees_the_presence_of_logo_menu_items() {
        //to check logo
        Assert.assertTrue(homePage.logoPresent());
    }
}
