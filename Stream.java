package com.java.java8features.stremAPI;

import java.util.ArrayList;
import java.util.List;

public class Stream {

	public static void main(String[] args) {
	//create a collection
		List<String>names=new ArrayList<String>();
		//add the elements to the list
		names.add("sachin");
		names.add("anil");
		names.add("surya");
		names.add("shankar");
		names.add("bangalorheh");
		// i would like to count the number of elements present in the list
		//without stream implementation
		int count=0;
		for(String element:names) {
			if(element.length()<6)
				count++;
				
		}
		System.out.println("where are:"+count+"Strings with length less than 6");
		int number=(int) names.stream().filter(element->element.length()<6).count();
		//lets apply stream now!-using lambda expression.
		System.out.println("the are:"+number+"String with lenght less than 6");

	}

}
