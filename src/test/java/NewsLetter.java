import jdk.jfr.Description;
import org.testng.annotations.Test;

public class NewsLetter {

    @Test
    @Description("Turns on newsletter and check does it save choice")
    public void testNewsLetter (){
        BaseClass baseClass = new BaseClass();

        baseClass
                .openHomePage()
                .OpenSignUpPage()
                .goToAccountPage("Moe", "Alkarov","732261553","testemail0@m.c","123456")
                .OpenNewsLetter()
                .subscribeSlider()
                .LogOut()
                .goToAccountPage("testemail@m.c","123456")
                .OpenNewsLetter();
            // here we had to check had slider turned on or not.
    }

}