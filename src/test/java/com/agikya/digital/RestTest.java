package com.agikya.digital;

import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({ExtentITestListenerClassAdapter.class})
public class RestTest {

    @Test(groups = {"t:DOVE-500", "a:Raja Beemi"})
    public void passTest() {

        Assert.assertEquals(5,3+2);
    }

    @Test(groups = {"t:DOVE-501", "a:Raja Beemi"})
    public void failTest() {


        Assert.assertNotEquals(2,3+2);
    }

    @Test
    @Ignore
    public void skipTest() {

        Assert.assertEquals(2,3+2);
    }
}
