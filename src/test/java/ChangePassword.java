import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ChangePassword {
    @Test
    @Description("Changes password and checks has it changed")
    public void test1(){
        String actres;
       BaseClass bsc=new BaseClass();
       actres=bsc.openHomePage().OpenLoginPage().goToAccountPage("alextest5@ukr.net","123456")
        .ChangePassword("098765")
               .Click_Submit()
       .LogOut()
       .goToAccountPage("alextest5@ukr.net","098765").getText_UserName();
        Assert.assertEquals(actres,"Hi, Alex Meinhom");
    }
}
