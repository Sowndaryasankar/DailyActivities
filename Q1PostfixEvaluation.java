package org.zoho;

import java.util.Scanner;
import java.util.Stack;

public class Q1PostfixEvaluation {
	public static int evaluatePostfix(String expression) {
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < expression.length(); i++) {
			char c = expression.charAt(i);
			if (Character.isDigit(c)) {
				stack.push(c - '0');
			} else {
				int operand2 = stack.pop();
				int operand1 = stack.pop();
				switch (c) {
				case '+':
					stack.push(operand1 + operand2);
					break;
				case '-':
					stack.push(operand1 - operand2);
					break;
				case '*':
					stack.push(operand1 * operand2);
					break;
				case '/':
					stack.push(operand1 / operand2);
					break;
				}
			}
		}
		return stack.pop();
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter postfix expression: ");
		String expression = input.nextLine();
		int result = evaluatePostfix(expression);
		System.out.println("Result: " + result);
		input.close();
	}
}
