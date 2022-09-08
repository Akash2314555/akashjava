package com.java.java8features.methodrefernces;

import java.util.function.BiFunction;

interface MyInterface{
	//a method ---abstract method
	public void display();
}
class Addition{
	static int add(int numberOne,int numberTwo) {
		return numberOne+numberTwo;
	}
}
public class student {
	//method reference is the short notation of lambd expression to call  a method.
	
	public void myMethod() {
		System.out.println("instance method");
		System.out.println("---i have been refrenced a abstraction---");
	}

	public static void main(String[] args) {
		//create a object to a class student
		student obj=new student();
		
		MyInterface ref=obj::myMethod;
		//calling the method of functional interface
		ref.display();
		//create an object to class addition
		BiFunction<Integer,Integer,Integer>addition=Addition::add;
	int sum=addition.apply(23, 56);
	System.out.println("addition of the two numbers is ");

	}

}
