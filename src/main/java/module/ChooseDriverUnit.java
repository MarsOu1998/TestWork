package module;

import module.ConstConfig;
import org.openqa.selenium.WebDriver;

public class ChooseDriverUnit {
    private static WebDriver driver;
//    选择测试的浏览器驱动
    public static WebDriver choose(WebDriver driver){
        if(driver==ConstConfig.chromeDriver)
                return ConstConfig.chromeDriver;
        else if(driver==ConstConfig.firefoxDriver)
                return ConstConfig.chromeDriver;
        else
            return null;
        }
}
