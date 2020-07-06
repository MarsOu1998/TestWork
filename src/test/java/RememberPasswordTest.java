import module.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RememberPasswordTest {
    private WebDriver driver=new ChromeDriver();

    @Before
    public void before() throws Exception {
        URLUnit.url(driver);
    }

    @Test
    public void test() throws Exception {
        RememberPassword.rememberPassword(driver);
        LoginUtil.login(driver);
        LogoutUtil.logout(driver);
        ValidateRememberPassword.validate(driver);
    }
    @After
    public void after() throws InterruptedException {
        driver.quit();
    }
}
