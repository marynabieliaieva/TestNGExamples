package testClasses;

import org.testng.annotations.Test;

public class TestNG_TestParallel2 {
	 @Test
	  public void TestMethod1() throws InterruptedException {
		  System.out.println("TestNG_TestParallel2 -> TestMethod1");
		  Thread.sleep(6000);
		  System.out.println("TestNG_TestParallel2 -> TestMethod1 -> More steps");
	  }
	  
	  @Test
	  public void TestMethod2() throws InterruptedException {
		  System.out.println("TestNG_TestParallel2 -> TestMethod2");
		  Thread.sleep(6000);
		  System.out.println("TestNG_TestParallel2 -> TestMethod2 -> More steps");
	  }
}
