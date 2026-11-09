package pages;

import org.openqa.selenium.By;

public class RegisterPage {
        By signUpButton = By.xpath("//button[text()='Sign Up']");

        By emailField = By.id("email");

        By passwordField = By.id("password");

        By passwordConfirmField = By.id("confirm");
}
