package userRegister;

import module.LoginUtil;
import module.LogoutUtil;
import module.RegisterStep1;
import module.URLUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterStep1Test {
    private WebDriver driver=new ChromeDriver();

    @Before
    public void before(){
        URLUnit.url(driver);
    }
    @After
    public void after() throws InterruptedException {
        LogoutUtil.logout(driver);
        driver.quit();

    }

    @Test
    public void test() throws Exception {
        LoginUtil.login(driver);
        RegisterStep1.register1(driver);
    }
}
