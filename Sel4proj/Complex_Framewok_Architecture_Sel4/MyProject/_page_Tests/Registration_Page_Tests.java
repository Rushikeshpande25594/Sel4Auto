package _page_Tests;
import _page_Actions.Registration_Page_Actions;
import initializer.BaseClass;

import org.testng.annotations.Test;

public class Registration_Page_Tests extends BaseClass{
    @Test
    public void registrationProcess(){
        Registration_Page_Actions regOnePA = new Registration_Page_Actions(driver);
        regOnePA.pageOnedata("c4c5","@eNGLISH","@eNGLISH");
    }
}
