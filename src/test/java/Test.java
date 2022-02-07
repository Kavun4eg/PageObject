import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Test {

        private WebDriver driver;
        private WebDriverWait wait;

        @BeforeMethod
        public void beforeTest() {
            System.setProperty("webdriver.chrome.driver", "D:\\qa\\driver\\chromedriver.exe");
            driver = new ChromeDriver();
            wait = new WebDriverWait(driver, Duration.ofSeconds(60));
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get("https://rozetka.com.ua/");
        }

        @org.testng.annotations.Test

        public void testRozetka() throws InterruptedException {
            new RozetkaMain(driver, wait).compAndLaptopClick();
            new RozetkaProductPage(driver, wait);
            new CompAndLaptop(driver, wait).laptopClick();
            new Logic(driver, wait).selectSellerRozetka().maxPriceInputClear().MaxPrice("10000").okeyBtnClick().firstPromoProductClick();



            WebElement label = RozetkaProductPage.checkPromo();
            Assert.assertTrue(label.isDisplayed());
        }

        @AfterMethod
        public void afterTest() {
            driver.quit();
        }
}
