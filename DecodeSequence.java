package org.zoho;

import java.util.Scanner;
import java.util.Stack;

public class DecodeSequence {
	public static String decode(String Sequence)
    {
        if (Sequence == null || Sequence.length() == 0) return Sequence;
        StringBuilder result = new StringBuilder();
        Stack stack = new Stack ( );
        for (int i = 0; i <= Sequence.length(); i++)
        {
            stack.push(i + 1);
            if (i == Sequence.length() || Sequence.charAt(i) == 'I')
                while (!stack.empty ( )) {
                    result.append (stack.pop ( ));
                }
        }
        return result.toString();
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner (System.in);
        String s = in.next (  );
        System.out.println("The minimum number is " + decode(s));
    }
}