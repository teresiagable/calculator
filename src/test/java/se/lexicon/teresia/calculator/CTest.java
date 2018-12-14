package se.lexicon.teresia.calculator;

import org.junit.Assert;
import org.junit.Test;

public class CTest {
	
	@Test
	public void test_calculate_add_numbers_return_expected() {
		//Setting up
		double number1 = 1.0;
		double number2 = 5.0;
		String operator = "+";
		double expected = 6.0;		
		double actual = App.calculate(number1, number2, operator); 
		Assert.assertEquals(expected, actual,0.1);		
	}
	
	@Test
	public void test_calculate_subtracktion() {
		double number1 = 5.0;
		double number2 = 6.0;
		String operator = "-";
		double expected = -1.0;		
		double actual = App.calculate(number1, number2, operator); 
		Assert.assertEquals(expected, actual,0.1);
	}
	
	@Test
	public void test_calculate_multipication() {
		double number1 = 5.0;
		double number2 = 6.0;
		String operator = "*";
		double expected = 30.0;		
		double actual = App.calculate(number1, number2, operator); 
		Assert.assertEquals(expected, actual,0.1);
	}
	
	@Test
	public void test_calculate_division_by_zero() {
		double expected = 0;
		Assert.assertEquals(expected,  App.calculate(10, 0, "/"),0.1);
		
		
	}

	@Test
	public void test_calculate_division() {
		double expected = 5;
		Assert.assertEquals(expected,  App.calculate(10, 2, "/"),0.1);		
	}


}
