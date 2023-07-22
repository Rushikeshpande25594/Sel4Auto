package commonFunctionWeb;

import org.openqa.selenium.WebElement;

public class WebTextBox {
    public static  void sendInput(WebElement textBox, String textToEnter){
        if (WebCommon.isClickable((textBox))){
            textBox.sendKeys(textToEnter);
        }
    }

    public static void clearTextBox (WebElement textBox){
        if (WebCommon.isClickable(textBox)){
            textBox.clear();
        }
    }
}
