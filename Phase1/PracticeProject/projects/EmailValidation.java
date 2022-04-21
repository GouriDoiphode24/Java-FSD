package com.simplilearn.projects;

import java.util.Scanner;

public class EmailValidation 

{
		public static void main(String[] args) 
		{
			Boolean flag = false;
			String emailID[] = new String[5];
			emailID[0] = "gouridoiphode01@gmail.com";
			emailID[1] = "shraddhadoiphode11@gmail.com";
			emailID[2] = "rohanpatil12@gmail.com";
			emailID[3] = "miraraut13@gmail.com";
			emailID[4] = "priyajadhav123@gmail.com";
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your Email: ");
			String userEmail = sc.next();
			
			for(String email:emailID)
			{
				if(userEmail.matches(email))
				{
					System.out.println("Welcome back "+userEmail);
					flag=true;
					break;
				}
			}
			if(flag==false)
			{
				System.out.println("Invalid User");
			}

		}

}


