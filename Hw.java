package IjP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

public class Hw {
    public static void main(String[] args) {
        System.out.println("juststarted");
        System.setProperty("webdriver.chrome.driver", "E:\\IjP1\\ChromeDriver 114\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.myfinsutra.com/");
        //driver.quit();
    }
}

