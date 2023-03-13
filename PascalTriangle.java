package org.zoho;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalTriangle {
	public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();
        if (numRows == 0) {
            return triangle;
        }
        List<Integer> firstRow = new ArrayList<Integer>();
        firstRow.add(1);
        triangle.add(firstRow);
        for (int i = 1; i < numRows; i++) {
            List<Integer> row = new ArrayList<Integer>();
            row.add(1);
            for (int j = 1; j < i; j++) {
                List<Integer> prevRow = triangle.get(i-1);
                int sum = prevRow.get(j-1) + prevRow.get(j);
                row.add(sum);
            }
            row.add(1);
            triangle.add(row);
        }
        return triangle;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int numRows = sc.nextInt();
        List<List<Integer>> triangle = generate(numRows);
        System.out.println("Pascal's triangle for "+ numRows + " rows is: ");
        for (List<Integer> row : triangle) {
            System.out.println(row);
        }
    }
}

