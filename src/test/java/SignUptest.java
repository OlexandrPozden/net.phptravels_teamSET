import org.testng.Assert;
import org.testng.SuiteRunner;
import org.testng.annotations.Test;

public class SignUptest {
    BaseClass bsc=new BaseClass();
    AccountPage acp;
    String actualresult;
    @Test
    public void test1(){


        actualresult="dfd";
               acp= bsc.openHomePage().OpenSignUpPage()
        .goToAccountPage("Alex","Meinhom","7894651233","alextest7@ukr.net","123456");
               actualresult=acp.getText_UserName();
        Assert.assertEquals(actualresult,"Hi, Alex Meinhom");
    }
    @Test
    public void test2(){

        actualresult=acp.LogOut().goToAccountPage("alextest7@ukr.net","123456").getText_UserName();
        Assert.assertEquals(actualresult,"Hi, Alex Meinhom");
    }
}
