import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by monk on 10/20/2016.
 */
public class First {


    //public static void main(String[] args) {
    @Test
    public void rundriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Chrome_driver\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");

    }


}
