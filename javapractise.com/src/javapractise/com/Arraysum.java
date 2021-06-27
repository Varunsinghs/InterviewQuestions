package javapractise.com;

public class Arraysum {
	
	public static void main(String[] args) {
		int[] array = {3,4,5,1,4,2};
		int n=6;
		
		
		
		for(int i=0;i<array.length-1;i++)  
		{  
		    if(array[i]+array[i+1]==n)  
		        System.out.println("{"+array[i]+","+array[i+1]+"}");  
		}  
	}

}
