package com.example.hrtest;

import java.util.*;
import java.util.Map;
import java.util.TreeMap;

public class Qu3Task12 {
	
	public static void main(String[] args)
	{
		TreeMap<Integer, String> map = new TreeMap<>();
		
		//Adding items to the list
		map.put(1, "Jack");
		map.put(2, "Oliva");
		map.put(3, "Daniel");
		map.put(4, "Tinku");
		
		SortedSet<Map.Entry<Integer, String>> sortedSet = new TreeSet<>(new Comparator<Map.Entry<Integer, String>>() 
		{  
            public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) 
            {  
                return o1.getValue().compareTo(o2.getValue());  
            }  
        });  
		
        // Add all entries from the TreeMap to the SortedSet  
        sortedSet.addAll(map.entrySet());  
        
        // Print the sorted TreeMap by value  
        for (Map.Entry<Integer, String> entry : sortedSet) {  
            System.out.println(entry.getKey() + ": " + entry.getValue());  
        }  
	}

}
