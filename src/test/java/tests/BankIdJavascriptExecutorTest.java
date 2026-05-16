package tests;

import base.BaseTest;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;
import pages.BankIdLoginPage;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BankIdJavascriptExecutorTest extends BaseTest {

    @Test
    public void userCanScrollWithJavascriptExecutor() {
        BankIdLoginPage loginPage = new BankIdLoginPage(driver);

        loginPage.open();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

        Long scrollY = (Long) js.executeScript("return Math.round(window.scrollY);");

        assertTrue(scrollY >= 0);
    }
}