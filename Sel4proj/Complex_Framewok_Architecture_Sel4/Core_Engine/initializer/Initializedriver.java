package initializer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Initializedriver {
    public static WebDriver driver = null;
    public static WebDriver createinstance(String browsername)
    {
        switch (browsername) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "E:/IjP1/Complex_Framework_Architecture/Driver/chromedriver.exe");
                driver = new ChromeDriver();
                break;
            case "edge":
                //returnedge instance
                break;
        }
        return  driver;
    }

}
