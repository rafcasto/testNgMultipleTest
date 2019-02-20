import org.testng.Assert;
import org.testng.annotations.Test;

public class SingleTestTwo {
    @Test(groups = {"funtest","Six"})
    public void testMethodSix()throws InterruptedException{
        Thread.sleep(3000) ;
        Assert.assertTrue(true);
        System.out.println("Test Five");
    }

    @Test(groups = {"funtest","Five"})
    public void testMethodFive()throws InterruptedException{
        Thread.sleep(3000);
        Assert.assertTrue(true);
        System.out.println("Test Five");
    }


}
