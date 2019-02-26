package javainterviewprograms;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) 
	{
		Scanner ui=new Scanner(System.in);
		System.out.println("Please enter a number");
		int n=ui.nextInt();
		int f=1;
		for(int i=1; i<=n; i++)
		{
			f=f*i;
		}System.out.print("The Factorial value of => "+n);
		System.out.println(" is => " +f);
	}
}