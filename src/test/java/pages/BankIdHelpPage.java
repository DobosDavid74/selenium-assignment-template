package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BankIdHelpPage {
    private final WebDriver driver;

    private final By troubleLoginLink = By.xpath("//a[contains(., 'Zjistit více') or contains(., 'Find out more')]");

    public BankIdHelpPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openTroubleLoginPage() {
        driver.findElement(troubleLoginLink).click();
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }
}