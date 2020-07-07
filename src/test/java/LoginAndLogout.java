import module.ChooseDriverUnit;
import module.LoginUtil;
import module.LogoutUtil;
import module.URLUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//本测试用例用于测试EMA的登入和登出
public class LoginAndLogout {
    private WebDriver driver=new ChromeDriver();

    @Before
    public void before() throws Exception {
        URLUnit.url(driver);
    }

    @Test
    public void test() throws Exception {
        LoginUtil.login(driver);
        LogoutUtil.logout(driver,1);
    }
    @After
    public void after(){
        driver.quit();
    }
}
