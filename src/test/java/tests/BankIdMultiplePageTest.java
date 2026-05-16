package tests;

import base.BaseTest;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class BankIdMultiplePageTest extends BaseTest {

    @Test
    public void severalBankIdPagesHaveTitles() {
        List<String> urls = List.of(
                "https://bank.sandbox.bankid.cz/login",
                "https://bank.sandbox.bankid.cz/login#login-form"
        );

        for (String url : urls) {
            driver.get(url);
            assertFalse(driver.getTitle().isBlank());
        }
    }
}