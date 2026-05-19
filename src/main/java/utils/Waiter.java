package utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Waiter {
    public final static int WAIT_10_SECONDS = 10;

    public static Boolean waitElementToBeInvisible(WebElement element){
        return new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(WAIT_10_SECONDS))
                .until(ExpectedConditions.invisibilityOf(element));
    }
}
