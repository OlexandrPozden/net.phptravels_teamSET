import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BaseClass {

    public LoginPage(WebDriver driver) {
        super(driver);

    }

    @FindBy(name = "username")
    private WebElement emailField;

    @FindBy(name = "password")
    private WebElement passwordField;

    @FindBy(className = "loginbtn")
    private WebElement submitButton;

    public LoginPage setEmail(String value) {
        emailField.sendKeys(value);
        return this;
    }

    public LoginPage setPassword (String value) {
        passwordField.sendKeys(value);
        return this;
    }

    public AccountPage clickSubmitButton (){
        submitButton.click();
        return new AccountPage(driver);
    }
    public AccountPage goToAccountPage(String email, String password){
        this.setEmail(email);
        this.setPassword(password);
        this.clickSubmitButton();
        return new AccountPage(driver);
    }

}