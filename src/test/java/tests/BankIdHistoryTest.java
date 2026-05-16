package tests;

import base.BaseTest;
import org.junit.jupiter.api.Test;
import pages.BankIdLoginPage;
import utils.ConfigReader;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BankIdHistoryTest extends BaseTest {

    @Test
    public void userCanNavigateBackAfterOpeningAnotherPage() {
        BankIdLoginPage loginPage = new BankIdLoginPage(driver);

        loginPage.open();

        driver.get(ConfigReader.get("base.url"));
        driver.navigate().back();

        assertTrue(driver.getCurrentUrl().contains("bank.sandbox.bankid.cz"));
        assertTrue(driver.getCurrentUrl().contains("login"));
    }
}