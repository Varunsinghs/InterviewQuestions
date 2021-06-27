package javapractise.com;

public class Reversestring {
	
	public static void main(String[] args) {
		
		String str = "I have the java's books";
		String rev="";
		
		String[] word  =str.split("");
		
		for(int i=str.length()-1;i>0;i--)
		{
			
			rev = rev + word[i];
		}
		
		System.out.println(rev);
	}

}
