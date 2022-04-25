package test;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeClass;
import page.DashboardPage;
import page.FeedGlobalPage;
import page.LoginPage;

public abstract class BaseTest {

    protected LoginPage loginPage;
    protected FeedGlobalPage feedGlobalPage;
    protected DashboardPage dashboardPage;

    @BeforeClass
    public void init() {
        Configuration.browser = "chrome";
        Configuration.timeout = 5000;
        Configuration.holdBrowserOpen = false;
        Configuration.headless = false;
        loginPage = new LoginPage();
        feedGlobalPage = new FeedGlobalPage();

    }

}
