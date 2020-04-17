import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WishList {
    @Test
    @Description("adds tour to wishlist")
    public void test1(){
        String result;
    BaseClass bsc= new BaseClass();
    result=bsc.openHomePage().OpenSignUpPage().goToAccountPage("Bob","NE Marley", "123456789", "testng5@n.g","password")
            .BackToHomePage()
            .OpenPageWithTours()
            .goToPageWithWishes()
            .AddToWhishList()
            .AcceptAlert_WishesPage()
             .goToAccountPage()
            .OpenWishlist()
            .getText_WishList();
        Assert.assertEquals(result,"Lviv Private Food Tour");
    }
}
