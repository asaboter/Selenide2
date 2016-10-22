package test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.Title;

/**
 * Created by monk on 10/20/2016.
 */
@Features("Google ")
@Stories("Google closed")
public class First {




    @Description("Test case check result of search on home page")
    @Title("EG_003_Check result of search on home page")

    @Test

    public void rundriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Chrome_driver\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        driver.close();

    }


}
