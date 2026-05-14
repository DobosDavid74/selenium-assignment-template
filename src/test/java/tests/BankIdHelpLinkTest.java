package tests;

import base.BaseTest;
import org.junit.jupiter.api.Test;
import pages.BankIdHelpPage;
import pages.BankIdLoginPage;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BankIdHelpLinkTest extends BaseTest {

    @Test
    public void userCanOpenTroubleLoginPage() {
        BankIdLoginPage loginPage = new BankIdLoginPage(driver);
        BankIdHelpPage helpPage = new BankIdHelpPage(driver);

        loginPage.open();
        helpPage.openTroubleLoginPage();

        assertTrue(helpPage.getCurrentUrl().contains("developer.bankid.cz"));
    }
}