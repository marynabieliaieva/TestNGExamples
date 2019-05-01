package testClasses;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import appcode.SomeClassToTest;

public class TestNG_Asserts {
	
	@Test
	public void testSum() {
		System.out.println("\nRunning Test -> testSum");
		SomeClassToTest obj = new SomeClassToTest();
		int result = obj.sumNumbers(1, 2);
		AssertJUnit.assertEquals(result, 3);
	}
	
	@Test
	public void testStrings() {
		System.out.println("\nRunning Test -> testStrings");
		String expectedString = "Hello World";
		SomeClassToTest obj = new SomeClassToTest();
		String result = obj.addStrings("Hello", "World");
		AssertJUnit.assertEquals(result, expectedString);
	}
	
	@Test
	public void testArrays() {
		System.out.println("\nRunning Test -> testArrays");
		int[] expectedArray = {1, 2, 3, 4};
		SomeClassToTest obj = new SomeClassToTest();
		int[] result = obj.getArray();
		AssertJUnit.assertEquals(result, expectedArray);
		System.out.println("\nEnd Test -> testArrays");
	}
}