package com.simplilearn.accessspecifier;

public class CheckAccessSpecifier {
	
	public static void main(String[] args) {
		
		System.out.println(".....Same Package Different Class.....");
		
		AccessSpecifier obj = new AccessSpecifier();
		
		obj.DefaultMethod();
		obj.PublicMethod();
		obj.Protected();
		
		//Private Method Not Accessible
		//obj.PrivateMethod
		
	}

}
