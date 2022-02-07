import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Logic {
    By seller = By.xpath("//li[@class='checkbox-filter__item ng-star-inserted']");
    By maxPriceInput = By.xpath("//input[@formcontrolname='max']");
    By okeyBtn = By.xpath("//input[@formcontrolname='max']/../button");
    By firstPromotionProduct = By.xpath("//span[contains(@class, 'promo-label_type_action')]/..");


    private WebDriver driver;
    private WebDriverWait wait;

    public Logic(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public Logic selectSellerRozetka() {
        driver.findElement(seller).click();
        return this;
    }

    public Logic maxPriceInputClear() {
        wait.until(ExpectedConditions.visibilityOfElementLocated((maxPriceInput))).clear();
        return this;
    }

    public Logic MaxPrice(String price) {
        driver.findElement(maxPriceInput).sendKeys(price);
        return this;
    }

    public Logic okeyBtnClick() {
        driver.findElement(okeyBtn).click();
        return this;
    }

    public RozetkaProductPage firstPromoProductClick() {
        WebElement firstPromotionElement = wait.until(ExpectedConditions.elementToBeClickable(firstPromotionProduct));
        firstPromotionElement.click();
        return new RozetkaProductPage(driver, wait);
    }
}
