package com.simplilearn.assistedpracticeproject;

import java.util.Scanner;

public class InnerClass {

		void check(int age)
		{
			if(age>=18)
			{
				class Inner{
					
					void validate()
					{
						System.out.println("Validated");
					}
				}
				
				Inner inner=new Inner();
				inner.validate();
			}
			else
			{
				System.out.println("Not valid");
			}
		}
		
		public static void main(String[] args) {
			InnerClass outer=new InnerClass();
			outer.check(22);
		}
	}

