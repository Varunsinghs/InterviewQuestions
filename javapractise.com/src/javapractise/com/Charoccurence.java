package javapractise.com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Charoccurence {

	public static void main(String[] args) {
		
		String str = "Ajit";
		HashMap<Character, Integer> hashd = new HashMap<>();
		char[] word=str.toCharArray();
		
		for(char letter : word)
		{
			
			if(hashd.containsKey(letter))
			{
				
				hashd.put(letter, hashd.get(letter)+1);
			}
			
			else
			{
				
				hashd.put(letter, 1);
			}
		}
		
		for(Map.Entry entry: hashd.entrySet())
		{
			System.out.println(entry.getKey()  +"    "+ entry.getValue());
			
		}
		
		
		
		
		
	}

}
