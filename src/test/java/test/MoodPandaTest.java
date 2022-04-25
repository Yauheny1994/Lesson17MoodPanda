package test;

import model.User;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MoodPandaTest extends BaseTest {

    private String rating = "9";

    @Test
    public void moodTest() {
        User user = new User();
        dashboardPage = loginPage.openLoginPage()
                .login(user)
                .clickYourDashboardLink()
                .setupRating(rating)
                .clickUpdateButton();
        Assert.assertTrue(dashboardPage.isSuccessMessageDisplayed());
    }
}
