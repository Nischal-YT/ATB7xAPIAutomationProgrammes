package com.thetesting.ex_22092024.Verification;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Verification001 {

    @Test
    public void test_verify(){
        String responseName = "pramod";
        Assert.assertEquals("pramod",responseName);
    }
}
