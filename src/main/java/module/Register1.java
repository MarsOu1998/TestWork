package module;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Register1 {
    public static  void register1(WebDriver driver) throws Exception {
        ExcelUtil.setExcelFile("src/main/java/ExcelFile/Register1.xlsx");
        System.out.println("data:"+ExcelUtil.getCellData(1, 0, "Register1Test"));
//       自动填写左边五行的数据
        for (int i = 0; i < 5; i++) {
            driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div/div[2]/div[2]/div[1]/div["+(i+1)+"]/div[2]/div/div/input")).sendKeys(ExcelUtil.getCellData(1,i,"Register1Test"));
        }
//        自动填写右边两行的数据
        for (int i = 0; i < 2; i++) {
            driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div/div[2]/div[2]/div[2]/div["+(i+1)+"]/div[2]/div/div/input\n")).sendKeys(ExcelUtil.getCellData(1,i+5,"Register1Test"));
        }
//        自动选中右边的checkbox
        for (int i = 0; i < 2; i++) {
            if(ExcelUtil.getCellData(1,i+7,"Register1Test").equals("1")){
                driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div/div[2]/div[2]/div[2]/div["+(i+3)+"]/div[1]/div/div\n")).click();
            }
        }


        //*[@id="app"]/div/div[2]/div/div[2]/div/div[2]/div[2]/div[2]/div[3]/div[1]/div/div
        //*[@id="app"]/div/div[2]/div/div[2]/div/div[2]/div[2]/div[2]/div[4]/div[1]/div/div


    }
}
