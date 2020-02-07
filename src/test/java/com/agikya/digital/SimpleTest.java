package com.agikya.digital;

import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({ExtentITestListenerClassAdapter.class})
public class SimpleTest {

    @Test(groups = {"SimpleTest001", "t:DOVE-502", "a:Raja Beemi"})
    public void passTest() {

        Assert.assertEquals(5,3+2);
    }

    @Test(groups = {"SimpleTest002", "t:DOVE-503", "a:Raja Beemi"})
    public void failTest() {

        Assert.assertEquals(2,3+2);
    }

    @Test
    @Ignore
    public void skipTest() {

        Assert.assertEquals(2,3+2);
    }
}
