package pages;

import driverfactory.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public WebDriver driver;

    @FindBy(xpath="//a[@id='nava']//img")
    WebElement logoItem;
    @FindBy(xpath="//li[@class='nav-item active']//a[@class='nav-link']")
    WebElement homeItem;

    @FindBy(xpath="//a[normalize-space()='Contact']")
    WebElement contactItem;

    @FindBy(xpath = "//a[normalize-space()='About us']")
    WebElement aboutusItem;

    @FindBy(xpath = "//a[@id='cartur']")
    WebElement cartitem;

    @FindBy(id = "login2")
    WebElement logInItem;

    @FindBy(id = "signin2")
    WebElement signUpItem;

    public HomePage(){
        this.driver= DriverFactory.init_driver();
        PageFactory.initElements(driver,this);
    }

    public Boolean logoPresent(){
        return logoItem.isDisplayed();
    }
    public Boolean homeItemPresent() {
        return homeItem.isDisplayed();
    }

    public Boolean contactItemPresent(){
            return contactItem.isDisplayed();
    }
    public Boolean aboutusItemPresent(){
        return aboutusItem.isDisplayed();
    }
    public Boolean cartitemPresent(){
        return cartitem.isDisplayed();
    }
    public Boolean logInItemPresent(){
        return logInItem.isDisplayed();
    }
    public Boolean loginItemPresent(){
        return logoItem.isDisplayed();
    }
    public Boolean signUpItemPresent(){
        return signUpItem.isDisplayed();
    }
}
