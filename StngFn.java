//package Suharsh;

public class StngFn {

	public static void main(String[] args) {
		//String
		String s1="Snehal";
		String s2="Suharsh";
		System.out.println("Strings..");
		System.out.println(s1+" "+s2);
		
		System.out.println("==================================");
		
		//Length fn
		int len1=s1.length();
		System.out.println("Length function");
		System.out.println(s1+"="+len1);
		
		int len2=s2.length();
		System.out.println(s2+"="+len2);
		
		System.out.println("==================================");
		
		//charAt fn
		System.out.println("charAt function");
		System.out.println("0th index : "+s1.charAt(0));
		System.out.println("1th index : "+s1.charAt(1));
		System.out.println("2th index : "+s1.charAt(2));
		System.out.println("3th index : "+s1.charAt(3));
		System.out.println("4th index : "+s1.charAt(4));
		System.out.println("5th index : "+s1.charAt(5));
		
		System.out.println("------------------------------------");
		
		System.out.println("0th index : "+s2.charAt(0));
		System.out.println("1th index : "+s2.charAt(1));
		System.out.println("2th index : "+s2.charAt(2));
		System.out.println("3th index : "+s2.charAt(3));
		System.out.println("4th index : "+s2.charAt(4));
		System.out.println("5th index : "+s2.charAt(5));
		System.out.println("6th index : "+s2.charAt(6));
		
		System.out.println("==================================");
		
		System.out.println("Equals function");
		String S1="Snehal";
		String S2="SNeHal";
		System.out.println("S1="+S1+" "+"S2="+S2);
		
		//Checks Case sensitivity
		if(S1.equals(S2))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
			
		System.out.println("------------------------------------");
		
		//Ignoring Case sensitivity
		if(S1.equalsIgnoreCase(S2))	
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		

	}

}
