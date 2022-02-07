import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RozetkaMain {
    By compAndLaptop = By.xpath("//ul[@class='menu-categories menu-categories_type_main']/li[1]");

    private WebDriver driver;
    private WebDriverWait wait;

    public RozetkaMain(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public CompAndLaptop compAndLaptopClick() {
        driver.findElement(compAndLaptop).click();
        return new CompAndLaptop(driver, wait);
    }
}
