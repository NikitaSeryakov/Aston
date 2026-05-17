package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utils.DriverManager;


public class BasePage {
    protected WebDriver driver = DriverManager.getDriver();

    protected BasePage () {
        PageFactory.initElements(driver, this);
    }
}
