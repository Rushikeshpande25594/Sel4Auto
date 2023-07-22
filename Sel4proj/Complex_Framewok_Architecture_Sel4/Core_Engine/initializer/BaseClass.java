package initializer;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class BaseClass {
   protected static WebDriver driver;
    @BeforeMethod
    public void beforeEachTestcase(){
        driver = Initializedriver.createinstance("chrome");
        driver.get("https://www.knowledgeware.in/final.html");
    }
    @AfterMethod
    public void afterEachMethod(){
       driver.close();
    }

}
