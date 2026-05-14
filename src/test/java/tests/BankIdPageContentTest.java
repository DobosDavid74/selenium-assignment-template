package tests;

import base.BaseTest;
import org.junit.jupiter.api.Test;
import pages.BankIdLoginPage;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BankIdPageContentTest extends BaseTest {

    @Test
    public void loginPageShowsExpectedBankIdContent() {
        BankIdLoginPage loginPage = new BankIdLoginPage(driver);

        loginPage.open();

        assertTrue(loginPage.isMainHeadingVisible());
        assertTrue(loginPage.isSignInHeadingVisible());
        assertTrue(loginPage.isTroubleLoginLinkVisible());
    }

    @Test
    public void loginPageShowsDemoAccounts() {
        BankIdLoginPage loginPage = new BankIdLoginPage(driver);

        loginPage.open();

        assertTrue(loginPage.isDemoAccountVisible("JanN"));
        assertTrue(loginPage.isDemoAccountVisible("Lenka"));
        assertTrue(loginPage.isDemoAccountVisible("LeosV"));
    }
}