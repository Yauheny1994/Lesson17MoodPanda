package page;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

import com.codeborne.selenide.Condition;
import java.time.Duration;
import org.openqa.selenium.By;

public class DashboardPage {

    private static final String RATING_SELECT = "//td//select";
    private static final String UPDATE_BUTTON = "//button[@class='button is-primary is-outdlined is-rounded']";
    private static final String SUCCESS_MESSAGE = "//*[contains(text(), 'Post updated')]";

    private static final int RATING_POSITION = 0;


    public DashboardPage setupRating(String rating) {
        $$(By.xpath(RATING_SELECT)).get(RATING_POSITION).selectOptionByValue(rating);
        return this;
    }

    public DashboardPage clickUpdateButton() {
        $$(By.xpath(UPDATE_BUTTON)).get(RATING_POSITION).click();
        return this;
    }

    public boolean isSuccessMessageDisplayed() {
        return $(By.xpath(SUCCESS_MESSAGE)).shouldBe(Condition.visible, Duration.ofSeconds(10)).isDisplayed();
    }
}
