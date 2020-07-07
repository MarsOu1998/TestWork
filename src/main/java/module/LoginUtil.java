package module;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class LoginUtil {

//    登录模块
    public static void login(WebDriver driver) throws Exception {
        driver.manage().window().maximize();
        ExcelUtil.setExcelFile("src/main/java/ExcelFile/Account.xlsx");
        String account = ExcelUtil.getCellData(1, 1, "LoginTest");
        String password = ExcelUtil.getCellData(1, 2, "LoginTest");
        driver.findElement(By.id("username")).sendKeys(account);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("Login")).click();
    }
}
