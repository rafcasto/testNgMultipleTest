import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BaseTest;


public class SingleTest extends BaseTest {
    @Test( testName = "API",groups = {"funtest"})
 public void testMethodOne()throws InterruptedException{
        Thread.sleep(3000);
        Assert.assertTrue(true);
        System.out.println("Test One");
 }

    @Test(testName = "UI",groups = {"funtest","Two"})
 public void testMethodTwo()throws InterruptedException{
        Thread.sleep(3000);
        Assert.assertTrue(false);
        System.out.println("Test Two");
 }


    @Test(groups = {"funtest","Three"})
    public void testMethodThree()throws InterruptedException{
        Thread.sleep(3000);
        Assert.assertTrue(true);
        System.out.println("Test Three");
    }


    @Test(groups = {"funtest","Four"})
    public void testMethodFour()throws InterruptedException{
        Thread.sleep(3000);
        Assert.assertTrue(true);
        System.out.println("Test Four");
    }

    @Test(groups = {"funtest","Five"})
    public void testMethodFive()throws InterruptedException{
        Thread.sleep(3000);
        Assert.assertTrue(true);
        System.out.println("Test Five");
    }



}
