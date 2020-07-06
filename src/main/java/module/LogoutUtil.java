package module;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class LogoutUtil {
    public static void logout(WebDriver driver) throws InterruptedException {
        String js="logout()";
        ((JavascriptExecutor) driver).executeScript(js);
//        driver.findElement(By.linkText("Sign out")).click();
    }
}
