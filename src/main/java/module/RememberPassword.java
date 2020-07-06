package module;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class RememberPassword {

    public static void rememberPassword(WebDriver driver){
        String js="document.getElementById(\"RemeberPassword\").click()";
        ((JavascriptExecutor) driver).executeScript(js);
    }

}
