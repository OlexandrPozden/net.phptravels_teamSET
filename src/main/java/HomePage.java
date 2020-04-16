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

    public void OpenLoginPage() {
        this.DropDownMyAccount.click();
        this.LogInElement.click();
        //return new SignUpPage(driver);
    }
    public void OpenSignUpPage(){
        this.DropDownMyAccount.click();
        this.SignUpElement.click();
    }
    public void OpenToursPage(){
        this.ToursTab.click();
        this.Destination_div_Tours.click();
        this.DestinationInput_Tours.sendKeys("Lviv");
        this.ChooseFromList_Destination.click();
        this.FromDate_Tours.click();
        this.FromDate_Tours.sendKeys("17/04/2020");
        this.FromDate_Tours.sendKeys(Keys.ENTER);
       // this.Destination_div_Tours.click();
        this.ToDate_Tours.click();
        this.ToDate_Tours.sendKeys("19/04/2020");
        this.ToDate_Tours.sendKeys(Keys.ENTER);
        //this.SearchButton_Tours.click();
    }




}