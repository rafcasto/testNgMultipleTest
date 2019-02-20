package utils;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    @BeforeMethod
    public void setUp(){
        System.out.println("Creating set up scenarios");
    }
    @AfterMethod
    public void close(){
        System.out.println("closing driver");
    }

}
