package module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ConstConfig {
    public static final String CHROME_DRIVER = "ChromeDriver";
    public static final String FIREFOX_DRIVER = "FirefoxDriver";
    public static WebDriver chromeDriver=new ChromeDriver();
    public static WebDriver firefoxDriver=new FirefoxDriver();
}
