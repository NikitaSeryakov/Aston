package page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {
    @FindBy(xpath = "//*[text() = 'Принять']")
    private WebElement cookieButton;
    public MainPage openPage(String url) {
        driver.get(url);
        return this;
    }
    public MainPage acceptCookie(){
        cookieButton.click();
        return this;
    }

}
