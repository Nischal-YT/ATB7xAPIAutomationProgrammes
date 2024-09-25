package com.thetesting.ex_21092024.testngexamples;
import org.testng.annotations.Test;
import org.testng.Assert;
public class TestNG007 {

    @Test
    public void serverStartedOk() {
        System.out.println("I will run first");
        Assert.assertTrue(false);
    }

    @Test(dependsOnMethods = "serverStartedOk")
    public void method1() {
        System.out.println("method1");
    }
}
