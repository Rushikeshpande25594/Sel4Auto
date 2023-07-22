package commonFunctionWeb;

import org.openqa.selenium.WebElement;

public class WebCommon {
 public static boolean isPresent(WebElement element){
   boolean isDisplay =false;
   if (element.isDisplayed()){
       isDisplay =true;
   }
   return isDisplay;
 }
 public static boolean isClickable(WebElement element){
     boolean isClick= false;
     if(isPresent(element)){
         if (element.isEnabled()){
             isClick = true;
         }
     }
     return isClick;
 }
}
