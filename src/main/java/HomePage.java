import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends BaseClass{

    public HomePage(){}

    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);

    }
    @FindBy(className = "dropdown-login")
    private WebElement DropDownMyAccount; //My account (you click there, when you want to log in, or sign up)

    @FindBy(xpath = "//div[contains(@class, 'dropdown-login')]//a[contains (text(), 'Sign Up')]")
    private WebElement SignUpElement; // SignUp button
    @FindBy(xpath = "//div[contains(@class, 'dropdown-login')]//a[contains (text(), 'Login')]" )
    private  WebElement LogInElement;  // Login button
    @FindBy(css = "a.tours")     // button Tour
    private  WebElement ToursTab;
    @FindBy(id="s2id_textsearch")
    private WebElement Destination_div_Tours;
    @FindBy(css="#select2-drop .select2-input")
    private  WebElement DestinationInput_Tours;
    @FindBy(css=".select2-result-label .select2-match")
    private WebElement ChooseFromList_Destination;
    @FindBy(id="DateTours")
    private WebElement FromDate_Tours;
    @FindBy(id="EndDateTours")
    private  WebElement ToDate_Tours;
    @FindBy(css="#tours .btn")
    private WebElement SearchButton_Tours;

    public LoginPage OpenLoginPage() {// type = LoginPage
        this.DropDownMyAccount.click();
        this.LogInElement.click();
        return new LoginPage(driver);
    }
    public SignUpPage OpenSignUpPage(){  // type = SignUpPage
        this.DropDownMyAccount.click();
        this.SignUpElement.click();
        return new SignUpPage(driver);
    }
    public HomePage setDestination_div_Tours(String value){
        this.Destination_div_Tours.click();
        this.DestinationInput_Tours.sendKeys(value);
        this.ChooseFromList_Destination.click();
        return this;
    }
    public HomePage setFromDate_Tours(String value){
        this.FromDate_Tours.click();
        this.FromDate_Tours.sendKeys(value);
        this.FromDate_Tours.sendKeys(Keys.ENTER);
        return this;
    }
    public HomePage setToDate_Tours(String value){
        this.ToDate_Tours.click();
        this.ToDate_Tours.sendKeys(value);
        this.ToDate_Tours.sendKeys(Keys.ENTER);
        return this;
    }
    public PageWithTours OpenPageWithTours(){// type = ToursPage
        this.ToursTab.click();
        this.setDestination_div_Tours("Lviv");
        this.setFromDate_Tours("17/04/2020");
        this.setToDate_Tours("19/04/2020");
        return new PageWithTours(driver);
    }




}