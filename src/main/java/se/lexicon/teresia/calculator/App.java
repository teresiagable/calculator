package se.lexicon.teresia.calculator;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Welcome to Calculator!");
		boolean continueCalculator = true;

		while (continueCalculator) {
			System.out.println("Let us calculate");
			// if not Esc

			double firstValue = readInput();
			String operator = readOperator();
			double secondValue = readInput();
			double result = calculate(firstValue, secondValue, operator);
			System.out.println(firstValue + " " + operator + " " + secondValue + " = " + result);

			continueCalculator = continueOrNot();
		}
		System.out.println("Calculator is off");

	}

	private static boolean continueOrNot() {
		System.out.println("Continue calculating (Y/N) ?");
		String input = scanner.nextLine();
		boolean returnValue = true;
		switch (input) {
		case "Y":
		case "y":
			returnValue = true;
			break;
		case "N":
		case "n":
			returnValue = false;
			break;
		default:
			System.out.println("I'll take that as a YES");
			returnValue = true;
			break;
		}
		return returnValue;
	}

	public static double calculate(double firstValue, double secondValue, String operator) {
		double result = 0;
		switch (operator) {
		case "+":
			result = firstValue + secondValue;
			break;
		case "-":
			result = firstValue - secondValue;
			break;
		case "*":
		case "x":
		case "X":
			result = firstValue * secondValue;
			break;
		case "/":
			if (secondValue == 0) {
				result = 0; // if division of zero return 0
			} else
				result = firstValue / secondValue;
			break;

		default:

			break;
		}
		return (double) result;
	}

	private static String readOperator() {
		
		System.out.println("Enter the mathematical operator (+ - / or *): ");
		String input = scanner.nextLine();
		String operator = input.trim();
		switch (operator) {
		case "+":
		case "-":
		case "/":
		case "*":
			break;
		default:
			System.out.println("Not a valid operator");
			return readOperator();
			//break;
		}
		return operator;
	}

	private static double readInput() {
		double number;
		try {
			System.out.println("Enter a number: ");
			String input = scanner.nextLine();
			number = Double.parseDouble(input);
		} catch (NumberFormatException e) {
			System.out.println("Not a valid number");
			return readInput();
		}
		return number;

	}

}
