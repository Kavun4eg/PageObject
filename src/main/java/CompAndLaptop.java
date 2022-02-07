import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CompAndLaptop {
    By laptops = By.xpath("//div[@class='tile-cats']");

    private WebDriver driver;
    private WebDriverWait wait;

    public CompAndLaptop(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public Logic laptopClick() {
        driver.findElement(laptops).click();
        return new Logic(driver, wait);
    }
}
