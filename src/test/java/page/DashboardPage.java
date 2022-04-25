package page;


import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class DashboardPage {

    private static final String RATING_SELECT = "//td//select";
    private static final String UPDATE_BUTTON = "//button[@class='button is-primary is-rounded']";
    private static final String SUCCESS_MESSAGE = "//*[contains(text(), 'Post updated')]";

    private static final int RATTING_POSITION = 0;

    public DashboardPage setupRatting(String rating) {
        $$(By.xpath(RATING_SELECT)).get(RATTING_POSITION).selectOptionByValue(rating);
        return this;
    }

    public DashboardPage clickUpdateButton() {
        $$(By.xpath(UPDATE_BUTTON)).get(RATTING_POSITION).click();
        return this;
    }

    public boolean isSuccessMessageDisplayed() {
        return $(By.xpath(SUCCESS_MESSAGE)).shouldBe(Condition.visible, Duration.ofSeconds(10)).isDisplayed();

    }
}
