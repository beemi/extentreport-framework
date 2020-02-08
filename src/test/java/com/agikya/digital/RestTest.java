package com.agikya.digital;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;
import io.restassured.RestAssured;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({ExtentITestListenerClassAdapter.class})
public class RestTest {

    ExtentReports extentReports;

    @BeforeTest
    public void setUp() {

        extentReports = new ExtentReports();
    }


    @Test(groups = {"t:JIRA-500", "a:Raja Beemi"})
    public void postcodeTest() {

        var response = RestAssured.given()
                                  .get("http://api.postcodes.io/postcodes/RM17 6EY")
                                  .andReturn();

        response.then().log().all().statusCode(200);
    }

    @Test(groups = {"t:JIRA-501", "a:Raja Beemi"})
    public void failTest() {


        Assert.assertNotEquals(2, 3 + 2);
    }

    @Test
    @Ignore
    public void skipTest() {

        Assert.assertEquals(2, 3 + 2);
    }
}
