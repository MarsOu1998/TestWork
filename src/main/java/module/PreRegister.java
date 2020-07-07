package module;

import okio.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class PreRegister {
    public static void register1(WebDriver driver) throws InterruptedException {

        driver.findElement(By.id("vue_register_head")).click();
        driver.findElement(By.cssSelector(".end-user-block:nth-child(2) .button-main")).click();
    }
}
