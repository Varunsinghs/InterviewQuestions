package javapractise.com;

public class Impliment extends Overriding {
	
	
	public void XBOX()
	{
		
		System.out.println("XBOX from Child Class");
		
	}
	
	public void PS4()
	{
		
		System.out.println("PS4 from Child Class");
	}

	
	public static void main(String[] args) {
		
		/*Impliment il = new Impliment();
		il.XBOX();
		il.PS4();
		
		Overriding ovr = new Overriding();
		ovr.XBOX();
		ovr.PS4(); */
		
		Overriding ozr = new Impliment();
		ozr.XBOX();
		ozr.PS4();
		
		
		
		
	}

}
