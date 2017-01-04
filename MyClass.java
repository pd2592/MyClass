package assignment.acadgild32;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		String S1, S2;
		Boolean same;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value for S1:  ");
		S1 = s.next();
		System.out.println("Enter value for S2:  ");
		S2 = s.next();
		if(S1.equals(S2))
		{
			same = true;
		}
		else
		{
			same = false;
		}
		System.out.println(same);
		
	}
}
