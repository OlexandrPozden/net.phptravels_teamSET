import jdk.jfr.Description;
import org.testng.annotations.Test;
import org.testng.Assert;

public class TestAddress {
    @Test
    @Description("changes address1")
    public void testAddress1(){

        String email = "testng4@n.g",
                password = "password",
                address1 = "Lviv",
                address2 = "Warsaw";
        AccountPage ac;

        BaseClass baseClass = new BaseClass();
        ac = baseClass
                .openHomePage()
                .OpenLoginPage()
                .setEmail(email)
                .setPassword(password)
                .clickSubmitButton()
                .OpenMy_Profile()
                .Set_Address1(address1)
               // .Set_Address2(address2)
                .Click_Submit()
                .OpenMy_Profile();

        String actualResult = ac.getText_address1();


        Assert.assertEquals(actualResult, "Lviv");

    }

}
