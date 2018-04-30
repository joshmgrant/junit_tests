package test.authentication;

import test.base.*;
import test.data.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.HashMap;
import java.util.Map;

import static junit.framework.TestCase.assertTrue;

public class LogInTest extends Base {

    @Test
    public void signInSuccessfully() {
        HomePage homePage = HomePage.visit(driver);
        homePage.getMenuButton().click();
        SignInPage signInPage = homePage.getSignInLink().click();

        signInPage.waitFor(homePage.getEmailElement);
        User user = User.validUser();

        signInPage.getEmailElement().sendKeys(user.getEmail());
        signInPage.getPasswordElement().sendKeys(user.getPassword());
        signInPage.getSubmitButton().click();
        assertTrue(homePage.isElementPresent(homePage.getCurrentUser));
    }

    @Test
    public void signInUnsuccessfully() {
        driver.get("http://a.testaddressbook.com");
        driver.findElement(By.id("sign-in")).click();

        Map<String, String> blankPassword = new HashMap<String, String>();
        blankPassword.put("password", "");

        User user = new User(blankPassword);
        String email = user.getEmail();
        String password = user.getPassword();

        WebDriverWait explicitWait = new WebDriverWait(driver, 20);

        WebElement emailElement = explicitWait.until(
                ExpectedConditions.presenceOfElementLocated(By.id("session_email")));

        emailElement.sendKeys(email);
        driver.findElement(By.id("session_password")).sendKeys(password);
        driver.findElement(By.tagName("form")).submit();

        By emailField = By.id("sign-in");
        assertTrue(driver.findElements(emailField).size() > 0);
    }

    @Test
    public void signInBlankPassword() {
        driver.get("http://a.testaddressbook.com");
        driver.findElement(By.id("sign-in")).click();

        User user = User.blankPassword();
        String email = user.getEmail();
        String password = user.getPassword();

        WebDriverWait explicitWait = new WebDriverWait(driver, 20);

        WebElement emailElement = explicitWait.until(
                ExpectedConditions.presenceOfElementLocated(By.id("session_email")));

        emailElement.sendKeys(email);
        driver.findElement(By.id("session_password")).sendKeys(password);
        driver.findElement(By.tagName("form")).submit();

        By emailField = By.id("sign-in");
        assertTrue(driver.findElements(emailField).size() > 0);
    }

}
