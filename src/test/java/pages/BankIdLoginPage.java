package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.TestData;

public class BankIdLoginPage extends BasePage {

    private final By mainHeading = By.xpath("//h1[contains(., 'Aplikace')]");
    private final By signInHeading = By.xpath("//*[contains(., 'Sign in to your bank account')]");
    private final By troubleLoginLink = By.xpath("//a[contains(., 'Zjistit více') or contains(., 'Find out more')]");

    public BankIdLoginPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get(TestData.BASE_URL);
    }

    public boolean isMainHeadingVisible() {
        return isVisible(mainHeading);
    }

    public boolean isSignInHeadingVisible() {
        return isVisible(signInHeading);
    }

    public boolean isTroubleLoginLinkVisible() {
        return isVisible(troubleLoginLink);
    }

    public void selectDemoAccount(String accountName) {
        click(By.xpath("//a[normalize-space()='" + accountName + "']"));
    }

    public boolean isDemoAccountVisible(String accountName) {
        return isVisible(By.xpath("//a[normalize-space()='" + accountName + "']"));
    }
}