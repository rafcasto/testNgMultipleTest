import org.testng.Assert;
import org.testng.annotations.Test;

public class SingleTestThree {
    @Test(groups = {"funtest","one"})
    public void testMethodOne()throws InterruptedException{
        Thread.sleep(3000);
        System.out.println("Test One");
        Assert.assertTrue(true);
    }

    @Test(groups = {"funtest","Two"})
    public void testMethodTwo()throws InterruptedException{
        Thread.sleep(3000);
        Assert.assertTrue(true);
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
