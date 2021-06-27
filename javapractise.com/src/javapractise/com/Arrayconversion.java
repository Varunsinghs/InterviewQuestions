package javapractise.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class Arrayconversion {
	public static void main(String[] args) {
		
		int[] arry = {21,04,87,99,101,12};
		
		Integer[]  numeric = {19,21,97,23,76};
		
		int maxuimum = Collections.max(Arrays.asList(numeric));
		int minimum = Collections.min(Arrays.asList(numeric));
		
		System.out.println("Maximum " + maxuimum);
		System.out.println("Minimum " + minimum);
		
		
		ArrayList<Integer> al = new ArrayList<Integer>(arry.length);
		
		//int max = Collections.max(Arrays.asList(al));
		
		//int min 
		
		System.out.println(al);
		
		for(int i : arry)
		{
			
			al.add(i);
		}
		
		System.out.println(al);
		
		
		ArrayList<Integer> az = new ArrayList<>(Arrays.asList(21,21,12,45,12,42,32,12,90));
		
		Set<Integer> st = new LinkedHashSet<>(az);
		
		System.out.println(st);
		
		
		//Finding Max and Min Number 
		
		Integer[] number = {21,121,89,122};
		
		int max = Collections.max(Arrays.asList(number));
		int min = Collections.min(Arrays.asList(number));
		
		System.out.println("Maximum Number " +  max);
		System.out.println("Minimum Number " +  min);
		
		
		
		
		
		
		
	}

}
