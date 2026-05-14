package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BankIdPasswordPage {
    private final WebDriver driver;

    private final By passwordInput = By.xpath("//input[@type='password']");
    private final By submitButton = By.xpath("//button[@type='submit']");

    private final By invalidPasswordMessage = By.xpath(
            "//*[contains(translate(normalize-space(.), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), 'invalid') " +
                    "or contains(translate(normalize-space(.), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), 'password')]"
    );

    public BankIdPasswordPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterPassword(String password) {
        driver.findElement(passwordInput).clear();
        driver.findElement(passwordInput).sendKeys(password);
    }

    public void submitLogin() {
        driver.findElement(submitButton).click();
    }

    public void loginWithPassword(String password) {
        enterPassword(password);
        submitLogin();
    }

    public boolean isPasswordInputVisible() {
        return !driver.findElements(passwordInput).isEmpty()
                && driver.findElement(passwordInput).isDisplayed();
    }

    public boolean isInvalidPasswordMessageVisible() {
        return !driver.findElements(invalidPasswordMessage).isEmpty()
                && driver.findElement(invalidPasswordMessage).isDisplayed();
    }

    public String getPageSource() {
        return driver.getPageSource();
    }
}