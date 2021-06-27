package javapractise.com;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Wordoccurence {
	
	public static void main(String[] args) {
		
		String str ="I have the java worst skill in the progrsm in Java";
		HashMap<String, Integer> hu = new HashMap<String, Integer>();
		String[] szr = str.split(" ");
		
		for(String words : szr)
		{
			
			if(hu.containsKey(words))
			{
				hu.put(words, hu.get(words)+1);
			}
			
			else
			{
				hu.put(words, 1);
			}
		}
		
	Set<String> st = hu.keySet();
	for(String words : st)
	{
		
		System.out.println( words + " " +hu.get(words));
	}
	
		
		
	}

}
