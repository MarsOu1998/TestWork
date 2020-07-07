package userRegister;

import module.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register1Test {
    private WebDriver driver=new ChromeDriver();

    @Before
    public void before(){
        URLUnit.url(driver);
    }
    @After
    public void after() throws InterruptedException {
        LogoutUtil.logout(driver,2);
        driver.quit();
    }

    @Test
    public void test() throws Exception {
        LoginUtil.login(driver);
        PreRegister.register1(driver);
        Register1.register1(driver);
        Thread.sleep(5000);
    }
}
