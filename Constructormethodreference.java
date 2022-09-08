package com.java.java8features.methodrefernces;
interface interface1{
	hello display(String say);
}
class hello{
	hello(String say) {
		System.out.println("VANAKM GUYS..!!"+say);
	}
}

public class Constructormethodreference {

	public static void main(String[] args) {
		//method reference to a constructor
		interface1 ref=hello :: new;
		
		ref.display("Epdi irrukinga");
		

	}

}
