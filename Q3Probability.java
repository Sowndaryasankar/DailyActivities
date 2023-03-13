package org.zoho;

import java.util.Random;
import java.util.Scanner;

public class Q3Probability {
	public static int getRandomElement(int[] nums, int[] probability) {
		int sum = 0;
		for (int p : probability) {
			sum += p;
		}

		Random rand = new Random();
		int randNum = rand.nextInt(sum) + 1;

		int index = 0;
		int currSum = 0;
		while (currSum < randNum) {
			currSum += probability[index];
			index++;
		}

		return nums[index - 1];
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of elements in the array: ");
		int n = scanner.nextInt();

		int[] nums = new int[n];
		int[] probability = new int[n];

		System.out.println("Enter the elements of the array: ");
		for (int i = 0; i < n; i++) {
			nums[i] = scanner.nextInt();
		}

		System.out.println("Enter the probabilities: ");
		for (int i = 0; i < n; i++) {
			probability[i] = scanner.nextInt();
		}

		int randNum = getRandomElement(nums, probability);
		String output = "The solution should return ";
		for (int i = 0; i < n; i++) {
			output += nums[i] + " with " + probability[i] + "% probability";
			if (i != n - 1) {
				output += ", ";
			}
		}
		output += ".";

		System.out.println(output);

		scanner.close();
	}
}
