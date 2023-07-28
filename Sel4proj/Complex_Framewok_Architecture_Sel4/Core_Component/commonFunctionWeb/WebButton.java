package commonFunctionWeb;
import org.openqa.selenium.WebElement;
public class WebButton {
    public static void click(WebElement button){
        if (WebCommon.isClickable((button))){
            button.click();
        }
    }
}
