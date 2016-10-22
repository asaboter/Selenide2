package test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Description;

import java.io.File;

/**
 * Created by monk on 10/22/2016.
 */
/*@Test
public class Barancev {
    public void rundriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Chrome_driver\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        driver.close();

    }


}*/
@Description("Uroki Baranceva")
@Test
public class Barancev {
    public void rundriver1() {
        ChromeDriverService service = new ChromeDriverService.Builder()
                .usingDriverExecutable(new File("C:\\Chrome_driver\\chromedriver.exe"))
                .usingAnyFreePort()
                .build();

    }

}
