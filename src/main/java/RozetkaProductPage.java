import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RozetkaProductPage {
    By promoOnTheCard = By.xpath("//app-label[contains(@class,'main-gallery__label')]");

    private WebDriver driver;
    private WebDriverWait wait;

    public RozetkaProductPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public boolean checkPromo() {
        return driver.findElement(promoOnTheCard).isDisplayed();
    }
}
