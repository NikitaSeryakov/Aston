import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import service.MainPageService;
import utils.DriverManager;

public class BaseTest {
    protected MainPageService mainPageService;

    @BeforeMethod
    public void startTests() {
        mainPageService = new MainPageService();
    }

    @AfterMethod
    public void stopBrowser() {
        DriverManager.getDriver();
    }
}
