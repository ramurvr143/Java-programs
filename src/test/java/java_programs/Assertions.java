package java_programs;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions {
	
	    @Test
	    public void testTitle() {
	        //String actualTitle = "Automation Testing Practice";
	        //String expectedTitle = "Automation Testing Practice";
	        //Assert.assertEquals(actualTitle, expectedTitle, "Page title did not match!");
	    }

	    @Test
	    public void testSoftAssertion() {
	        SoftAssert softAssert = new SoftAssert();
	        softAssert.assertTrue(2 > 3, "Condition failed: 2 is not greater than 3");
	        softAssert.assertNotNull("Hello", "String is null");
	        softAssert.assertAll();
	    }
	}



