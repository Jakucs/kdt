package keywords;

import hooks.Hooks;
import org.openqa.selenium.WebDriver;
import pages.RegisterPage;

public class RegisterKeywords {

    private RegisterPage registerPage;
    private WebDriver driver;

    public RegisterKeywords(WebDriver driver){
        this.driver = driver;
        this.registerPage = new RegisterPage();
    }

    public void clickSignUp(){
        driver.findElement(registerPage.signUpButton).click();
    }

    public void fillEmail(String email){
        driver.findElement(registerPage.emailField).sendKeys(email);
    }

    public void fillPassword(String password){
        driver.findElement(registerPage.passwordField).sendKeys(password);
    }

    public void fillPasswordConfirm(String confirmPassword){
        driver.findElement(registerPage.passwordConfirmField).sendKeys(confirmPassword);
    }

    public void clickLowerSignUpButton(){
        driver.findElement(registerPage.lowerSignUpButton).click();
    }
}