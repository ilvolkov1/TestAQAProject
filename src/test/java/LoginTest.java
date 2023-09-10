import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginTest {



    @Test
    void successfulLoginTest ()
    {
        open("https://qa.guru/cms/system/login");
        $(".login-form").shouldHave(text("Войти"));
    }
}
