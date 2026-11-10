package pages;

import org.openqa.selenium.By;

public class RegisterPage {
        public By signUpButton = By.xpath("//button[text()='Sign Up']");

        public By emailField = By.id("email");

        public By passwordField = By.id("password");

        public By passwordConfirmField = By.id("confirm");

        public By lowerSignUpButton = By.cssSelector("button[type='submit']");

        public By logoutButton = By.xpath("//button[text()='Logout']");
}
