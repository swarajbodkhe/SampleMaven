package SampleTest;

import org.junit.Assert;
import org.junit.Test;

public class JenkinsTest {

    @Test
    public void helloWorldTest(){
        int a=10;
        int b=20;
        System.out.println("a="+a+" b="+b);
        Assert.assertTrue("Check a==b",a!=b);
    }
}
