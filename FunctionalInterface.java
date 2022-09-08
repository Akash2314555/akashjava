package com.java.java8features.methodrefernces;

import java.util.function.IntBinaryOperator;
//default interface
interface Myinterface{
	default void newMethod() {
		System.out.println(""ne added default method");
	}
	//Abstract method
	public void existingMethod(String str) {
		
	}
}

//Creating our own functional interface
interface MyFunctionalInterface{
	//single abstract method.
	public int addMethod(int a, int b);
}

public class FunctionalInterface {
	

	public static void main(String[] args) {
		//lambda operation
		MyFunctionalInterface sum=(a,b)->a+b;
		System.out.println("result=" +sum.addMethod(12,120));
		//predefined function interface
		//lambda expression
		System.out.println("---printed by the predefined interface");
		IntBinaryOperator add=(a,b)->a+b;
		System.out.println("result="+add.applyAsInt(12, 120));
				
		

	}

}
