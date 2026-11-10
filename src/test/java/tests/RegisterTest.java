package tests;

import hooks.Hooks;
import keywords.RegisterKeywords;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.RegisterPage;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class RegisterTest extends Hooks {

    private RegisterKeywords registerKeywords;
    private RegisterPage registerPage;

    @BeforeEach
    public void startTests(){
        registerKeywords = new RegisterKeywords(driver);
        registerPage = new RegisterPage();
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/register-data.csv", numLinesToSkip = 1)
    public void registerDifferentCredentials(
            String email,
            String password,
            String confirmPassword
    ) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(registerPage.signUpButton)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(registerPage.emailField));
        registerKeywords.fillEmail(email);
        wait.until(ExpectedConditions.visibilityOfElementLocated(registerPage.passwordField));
        registerKeywords.fillPassword(password);
        wait.until(ExpectedConditions.visibilityOfElementLocated(registerPage.passwordConfirmField));
        registerKeywords.fillPasswordConfirm(confirmPassword);
        wait.until(ExpectedConditions.visibilityOfElementLocated(registerPage.lowerSignUpButton));
        registerKeywords.clickLowerSignUpButton();
        assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(registerPage.logoutButton)).isDisplayed());
    }



/*    @Test
    public void registerWihValidEmailAndPassword(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(registerPage.signUpButton)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(registerPage.emailField));
        registerKeywords.fillEmail("jakucs4@gmail.com");
        wait.until(ExpectedConditions.visibilityOfElementLocated(registerPage.passwordField));
        registerKeywords.fillPassword("Ripazha4");
        wait.until(ExpectedConditions.visibilityOfElementLocated(registerPage.passwordConfirmField));
        registerKeywords.fillPasswordConfirm("Ripazha4");
        wait.until(ExpectedConditions.visibilityOfElementLocated(registerPage.lowerSignUpButton));
        registerKeywords.clickLowerSignUpButton();
        assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(registerPage.logoutButton)).isDisplayed());
    }*/
}
