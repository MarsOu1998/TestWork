package module;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class URLUnit {
    public static void url(WebDriver driver){
        //       设置全局等待时间为5秒钟
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("http://60.190.131.190:9007/emaGen5/index.action");
//        driver.get("https://www.baidu.com");
    }
}
