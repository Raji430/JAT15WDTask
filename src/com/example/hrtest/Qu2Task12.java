package com.example.hrtest;

import java.util.ArrayList;

public class Qu2Task12 {
	
	public static void main(String[] args)
	{
		ArrayList<String> list = new ArrayList<>();
		
		//Adding strings to the arraylist
		list.add("Test1");
		list.add("Test2");
		list.add("Test3");
		list.add("Test4");
		list.add("Test5");
		
		System.out.println("Newly added Array List: " + list);
		
		list.removeAll(list);
		
		System.out.println("After removing the list is empty: " + list);		
		
	}

}
