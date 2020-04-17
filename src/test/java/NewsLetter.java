import org.testng.annotations.Test;

public class NewsLetter {

    @Test
    public void testNewsLetter (){
        BaseClass baseClass = new BaseClass();

        baseClass
                .openHomePage()
                .goToSignUpPage()
                .goToAccountPage()

                .OpenNewsLetter()
                .subscribeSlider();
    }

}
