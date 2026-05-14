package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BankIdLoginPage {
    private final WebDriver driver;

    private final String url = "https://bank.sandbox.bankid.cz/login#login-form";

    private final By mainHeading = By.xpath("//h1[contains(., 'Aplikace')]");
    private final By signInHeading = By.xpath("//*[contains(., 'Sign in to your bank account')]");
    private final By troubleLoginLink = By.xpath("//a[contains(., 'Zjistit více') or contains(., 'Find out more')]");

    public BankIdLoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get(url);
    }

    public boolean isMainHeadingVisible() {
        return driver.findElement(mainHeading).isDisplayed();
    }

    public boolean isSignInHeadingVisible() {
        return driver.findElement(signInHeading).isDisplayed();
    }

    public boolean isTroubleLoginLinkVisible() {
        return driver.findElement(troubleLoginLink).isDisplayed();
    }

    public void selectDemoAccount(String accountName) {
        driver.findElement(By.xpath("//a[normalize-space()='" + accountName + "']")).click();
    }

    public boolean isDemoAccountVisible(String accountName) {
        return driver.findElement(By.xpath("//a[normalize-space()='" + accountName + "']")).isDisplayed();
    }
}