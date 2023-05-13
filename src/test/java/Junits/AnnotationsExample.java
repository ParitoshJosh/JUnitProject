package Junits;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import code.Calculator;

public class AnnotationsExample {

	@BeforeAll
	public static void beforeall() {

		System.out.println("@BeforeAll- Runs in the beginning");
	}

	@BeforeEach
	public void beforejunit() {

		System.out.println("@BeforeEach - Runs before every test");
	}

	@Test()
	public void test1() {

		int result = Calculator.add(5, 5);
		Assertions.assertEquals(10, result);
	}

	@Test()
	public void test2() {

		int result = Calculator.add(4, 5);
		Assertions.assertEquals(9, result);
	}

	@AfterEach
	public void afterjunit() {

		System.out.println("@AfterEach -Runs after each test");
	}

	@AfterAll
	public static void Afterall() {

		System.out.println("@AfterAll -Runs at last");
	}

}
