package com.simplilearn.projects;

import java.util.Scanner;

public class CalculatorElseIf {

	public int addition(int number1, int number2)
	{
		return number1 + number2;
	}
	
	public int substraction(int number1, int number2)
	{
		return number1 - number2;
	}
	
	public int multiplication(int number1, int number2)
	{
		return number1 * number2;
	}
	
	public int division(int number1, int number2)
	{
		return number1 / number2;
	}
	
	public int modulo(int number1, int number2)
	{
		return number1 % number2;
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter First Number: ");
			int number1 = sc.nextInt();
			System.out.println("Enter Second Number: ");
			int number2 = sc.nextInt();
			System.out.println("Which operation would you like to perform(1/2/3/4/5):");
			System.out.println("1.Addition(+)");
			System.out.println("2.Substraction(-)");
			System.out.println("3.Multiplication(*)");
			System.out.println("4.Division(/)");
			System.out.println("5.Modulo(%)");
			int op = sc.nextInt();
			CalculatorElseIf cal = new CalculatorElseIf();
			if(op == 1)
			{
				System.out.println("Addition is: "+cal.addition(number1, number2));
			}
			else if(op == 2)
			{
				System.out.println("Substraction is: "+cal.substraction(number1, number2));
			}
			else if(op == 3)
			{
				System.out.println("Multiplication is: "+cal.multiplication(number1, number2));
			}
			else if(op == 4)
			{
				System.out.println("Division is: "+cal.division(number1, number2));
			}
			else if(op == 5)
			{
				System.out.println("Modulo is: "+cal.modulo(number1, number2));
			}
			else
			{
				System.out.println("Invalid Input");
			}
			System.out.println("Would you like to continue?(1 for YES, 2 for NO): ") ;
			int cont = sc.nextInt();
			if(cont == 2)
			{
				break;
			}
		}	
	}
}

