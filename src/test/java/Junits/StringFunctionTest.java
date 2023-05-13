package Junits;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import code.StringFunctions;

public class StringFunctionTest {

	@Test
	public void positiveTest() {

		Assertions.assertTrue(StringFunctions.isPalindrome("NITIN"));

	}

	@Test
	public void negativeTest() {

		Assertions.assertFalse(StringFunctions.isPalindrome("SHIVANI"));

	}
}
