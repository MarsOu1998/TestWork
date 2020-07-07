package module;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LogoutUtil {
    public static void logout(WebDriver driver,int version) throws InterruptedException {
        switch (version){
            case 1:
                driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/ul/li[5]/span/a")).click();
                break;
            case 2:
                driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div[2]/div/ul/li[5]")).click();
                break;
        }
    }
}
