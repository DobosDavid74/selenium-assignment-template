package tests;

import base.BaseTest;
import org.junit.jupiter.api.Test;
import pages.BankIdLoginPage;
import pages.BankIdPasswordPage;
import utils.ConfigReader;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BankIdLoginTest extends BaseTest {

    @Test
    public void userCanSelectDemoAccountAndSeePasswordInput() {
        BankIdLoginPage loginPage = new BankIdLoginPage(driver);
        BankIdPasswordPage passwordPage = new BankIdPasswordPage(driver);

        loginPage.open();
        loginPage.selectDemoAccount(ConfigReader.get("demo.account"));

        assertTrue(passwordPage.isPasswordInputVisible());
    }
}