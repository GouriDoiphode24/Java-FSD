package com.simplilearn.encapsulation;

public class TestEncapsulation 
	{     
	    public static void main (String[] args)  
	    { 
	        Encapsulate obj = new Encapsulate(); 
	        obj.setName("Nita"); 
	        obj.setAge(24); 
	        obj.setRoll(6); 
	        System.out.println("My name: " + obj.getName()); 
	        System.out.println("My age: " + obj.getAge()); 
	        System.out.println("My roll: " + obj.getRoll());      
	    } 
	}

