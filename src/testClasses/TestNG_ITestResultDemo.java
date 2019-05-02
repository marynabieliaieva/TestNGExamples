package testClasses;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

public class TestNG_ITestResultDemo {
  @Test
  public void testMethod1() {
	  System.out.println("Running -> TestMethod1");
	  Assert.assertTrue(false);
  }
  
  @Test
  public void testMethod2() {
	  System.out.println("Running -> TestMethod2");
	  Assert.assertTrue(true);
  }
  
  @AfterMethod
  public void afterMethod(ITestResult testResult) {
	  if (testResult.getStatus() == ITestResult.FAILURE) {
		  System.out.println(testResult.getName() + " was FAILED");
	  }
	  if (testResult.getStatus() == ITestResult.SUCCESS) {
		  System.out.println(testResult.getName() + " was PASS");
	  }
	  
  }

}
