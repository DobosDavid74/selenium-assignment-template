package tests;

import base.BaseTest;
import org.junit.jupiter.api.Test;
import pages.BankIdLoginPage;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class BankIdTitleTest extends BaseTest {

    @Test
    public void loginPageHasPageTitle() {
        BankIdLoginPage loginPage = new BankIdLoginPage(driver);

        loginPage.open();

        assertFalse(driver.getTitle().isBlank());
    }
}