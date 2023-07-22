package _page_Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration_Page_Locators {

    WebDriver driver = null;
    public Registration_Page_Locators(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver, this);
    }

    //WebElement username = driver.findElement(By.name("name"))
    @FindBy(name = "name")
    private WebElement userName;
    public  WebElement getUserName(){
        return userName;
    }

    @FindBy(name = "password")
    private WebElement password;
    public  WebElement getPassword(){
        return password;
    }

    @FindBy(xpath = "//*[@name='confirmpassword']")
    private WebElement confirmpassword;
    public  WebElement getconfirmpassword(){
        return confirmpassword;
    }

    @FindBy(linkText = "LOGIN")
    private WebElement loginButton;
    public  WebElement getLoginButton(){
        return loginButton;
    }
}
