package dae2;

import java.util.Scanner;

public class ConditionalStatment {

	public static void main(String args[])
	{
		Object system;
		Scanner t = new Scanner(systeM.in);
		System.out.println("enter age and salary");
		int age=t.nextInt();
		int salary=t.nextInt();
		if(age>25 && salary>35000)
		{
			System.out.println("you can apply for loan");
		}
		else
		{
			System.out.println("you can't apply");
		}
	}
}
