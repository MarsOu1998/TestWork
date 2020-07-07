import module.ExcelUtil;
import org.junit.Test;
import org.openqa.selenium.By;

public class GenerateTest {
    @Test
    public void test() throws Exception {
        ExcelUtil.setExcelFile("C:\\Users\\Mars\\Desktop\\Register2.xls");
        for (int i = 0; i < 5; i++) {
            System.out.println("data"+i+" "+ExcelUtil.getCellData(1, i, "Register1Test"));
        }
        for (int i = 0; i < 2; i++) {
            System.out.println(ExcelUtil.getCellData(1, i + 5, "Register1Test"));
        }

        for (int i = 0; i < 2; i++) {
            System.out.println(ExcelUtil.getCellData(1, i + 7, "Register1Test").equals(1));
        }
    }
}
