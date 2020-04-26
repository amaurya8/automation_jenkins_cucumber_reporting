package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

        @FindBy(how = How.LINK_TEXT, using = "Log In")
        static public WebElement loginBtn;
        @FindBy(how = How.XPATH, using = "//input[@id='user_login']")
        static public WebElement userName;
        @FindBy(how = How.XPATH, using = "//input[@id='user_pass']")
        static public WebElement passWord;
        @FindBy(how=How.ID, using = "wp-submit")
        static public WebElement submit;
        @FindBy(how=How.PARTIAL_LINK_TEXT, using = "Howd")
        static public WebElement usernameValid;
        public void clickLoginButton () {
        loginBtn.click();

        }

    }
