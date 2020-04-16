import org.testng.annotations.Test;

public class NewsLetter {

    @Test
    public void testNewsLetter (){
        BaseClass baseClass = new BaseClass();

        baseClass
                .openHomePage()
                .goToLoginPage()
                .setEmail("test@gmail.com")
                .setPassword("123456")
                .clickLoginButton();


    }
}
