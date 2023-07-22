package _page_Actions;

import _page_Locators.Registration_Page_Locators;
import commonFunctionWeb.WebButton;
import commonFunctionWeb.WebTextBox;
import org.openqa.selenium.WebDriver;

public class Registration_Page_Actions {
    WebDriver driver = null;
    Registration_Page_Locators pageOnePL = null;
    public Registration_Page_Actions(WebDriver driver){
        this.driver= driver;
        pageOnePL= new Registration_Page_Locators(driver);
    }

    public void enterUsername (String username){
        if (pageOnePL.getUserName()!= null){
            WebTextBox.sendInput(pageOnePL.getPassword(), username);
        }
    }
    public void enterpassword (String password){
        if (pageOnePL.getPassword()!= null){
            WebTextBox.sendInput(pageOnePL.getPassword(), password);
        }
    }

    public void enterConfirmPassword(String confirmPassword){
        if (pageOnePL.getconfirmpassword()!= null){
            WebTextBox.sendInput(pageOnePL.getconfirmpassword(), confirmPassword);
        }
    }

    public void clickLogin(){
        if (pageOnePL.getLoginButton()!=null){
            WebButton.click(pageOnePL.getLoginButton());
        }
    }

    public void pageOnedata(String user, String pass, String confPass){
        enterUsername(user);
        enterpassword(pass);
        enterConfirmPassword(confPass);
    }
}
