package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BankIdPasswordPage extends BasePage {

    private final By passwordInput = By.xpath("//input[@type='password']");
    private final By submitButton = By.xpath("//button[@type='submit']");

    public BankIdPasswordPage(WebDriver driver) {
        super(driver);
    }

    public void enterPassword(String password) {
        type(passwordInput, password);
    }

    public void submitLogin() {
        click(submitButton);
    }

    public void loginWithPassword(String password) {
        enterPassword(password);
        submitLogin();
    }

    public boolean isPasswordInputVisible() {
        return !driver.findElements(passwordInput).isEmpty()
                && driver.findElement(passwordInput).isDisplayed();
    }
}