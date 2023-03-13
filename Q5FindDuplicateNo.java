package org.zoho;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Q5FindDuplicateNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of elements you want to store:");
		int n=sc.nextInt();
		int[]arr=new int[n ];
		System.out.println("Enter the elements of the array(1 to 100):");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}System.out.println("Duplicate elements in the array:");
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j])
					System.out.println(arr[j]);
				
			}
		}
	}
}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
		/*Scanner input = new Scanner(System.in);

		System.out.print("Enter the size of the array: ");
		int size = input.nextInt();

		int[] arr = new int[size];

		System.out.println("Enter the array elements (1 to 100):");
		for (int i = 0; i < size; i++) {
			arr[i] = input.nextInt();
		}

		Set<Integer> set = new HashSet<>();
		int duplicate = -1;

		for (int i = 0; i < size; i++) {
			if (set.contains(arr[i])) {
				duplicate = arr[i];
				break;
			} else {
				set.add(arr[i]);
			}
		}

		if (duplicate == -1) {
			System.out.println("No duplicate number found.");
		} else {
			System.out.println("Duplicate number is: " + duplicate);
		}

		input.close();*/
