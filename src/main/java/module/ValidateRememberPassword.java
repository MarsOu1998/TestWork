package module;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ValidateRememberPassword {
    public static void validate(WebDriver driver) throws Exception {
        String account = ExcelUtil.getCellData(1, 1, "LoginTest");
        String password = ExcelUtil.getCellData(1, 2, "LoginTest");
        String attribute = driver.findElement(By.id("username")).getAttribute("value");
        String attribute1 = driver.findElement((By.id("password"))).getAttribute("value");
        if(account.equals(attribute)){
            if(password.equals(attribute1)){
                ExcelUtil.add_Value_InSpecifiedCell__FromExcel("C:\\Users\\Mars\\Desktop\\TestFile.xlsx","LoginTest",1,4,"Successfully");

            }else{

            }
        }
    }
}
