package stringclasss;

import java.nio.ShortBuffer;

public class PracticeString {
	 static String b="sanket";
public static void main(String[] args) {
//	20 replaceAll(String str):
//	19. isAlphabetic(char ch);
//	18. isDigit(char c)
//	17. parseXxx()
//	16. valueOf(primitive data type)
//	15. toCharArray():
//  14. split(String s)
//	13. trim()
//	WAP to count a character in a String
//	12. indexOf(char ch)
//	11. toUpperCase()
//	10. toLowerCase()
//	9. contains(String value)
//	8. substring(int beginindex, int endindex)
//	7. substring(int index):
//	6. replace(String old, String new)
//	5. replace(char old, char new)
//	WAP to print the horizontal String to the vertical individual character
//	4. charAt(int index);
//	3. length();
//	2. equalsIgnoreCase(String s)
//	1. equals(String s)
	//String f=new String("sanket");
	
	//String s1="sanket";
	//boolean s3=s.equals(s1);
	//System.out.println(s3);
	
	//boolean e=(f==s);
	// boolean s4 = (s==s1);
	//System.out.println(e);
	//System.out.println(s4);
	
	String s="sanket";//immutable
	s.concat(" tilkari");
	System.out.println(s);
	StringBuffer n=new StringBuffer("oom");//mutable
	n.append(" shanti");
	System.out.println(n);
	
	//douse not affect static string
	String bc="sanket";
	boolean b1 = b.equalsIgnoreCase(bc);
	System.out.println(b1);
	
	String b2="sanket tilkari";
	char b3 = b2.charAt(5);
	System.out.println(b3);
	
	String b4="tilkari";
	String b5 = b4.replace('i', 's');
	System.out.println(b5);
	
	
	String b6="shambho";
	for(int i=0;i<b6.length();i++) {
		
		char b7 = b6.charAt(i);
		System.out.println(b7);
	}
	
	String b8="sanket tilkari";
	String b9 = b8.replace("sanket", "shital");
	System.out.println(b9);
	
	String b10="sanket tilkari";
	String b11 = b10.substring(7);
	System.out.println(b11);
	
	String b12="sanket tilkari";
	CharSequence b13 = b12.subSequence(2, 7);
	//String b13 = b12.substring(2, 7);
	System.out.println(b13);
	
	
	
	String b14="sanket tilkari";
	boolean b15 = b14.contains("kari");
	System.out.println(b15);
	
	String b16="snanketn";
	int b17 = b16.indexOf('n');
	System.out.println(b17);
	
	
	String b18="ssakketttuuuuuu";
	
	int count=0;
	
	for(int i = 0;i<b18.length();i++) {
		char b19 = b18.charAt(i);
		
		if(b19=='u') {
			count++;
		}
		
	}
	System.out.println(count);
	
	String b20="sanket tilkari";
	String[] b21 = b20.split(" ");
	
	for(String b22:b21) {
		System.out.println(b22);
	}
	

	String s34 = "String Value #123";
	
	char[] chararray = s34.toCharArray();
	
	int sizee = chararray.length;
	for(int ii= 0; ii<sizee; ii++)
	{
		System.out.println(chararray[ii]);
	}
	
	//WAP to print to take out of the number & alphabeat from a string
	
			
		
		String g1 = "30shr09eenath1993";
		
	     String g2	= g1.replaceAll("[^a-z]", "");
	     
	     System.out.println(g2);//shreenath
	     
	   String g3 = g1.replaceAll("[^0-9]", "");
	   
	   System.out.println(g3);// 30091993
	   
	   //WAP ro print the initial letter of complete String in Uppercase

	    String ss = "hello sanket bhai when will you come in kolhapur";
	    
	    String[] ss1 = ss.split(" ");
	    for(int nt=0;nt<ss1.length;nt++)
	    {
	    	String ss2 = ss1[nt].substring(0,1);
	    	
	    	String ss3 = ss1[nt].substring(1);
	    	
	    	String ss4 = ss2.toUpperCase();
	    	
	    	System.out.print((ss4+ss3)+" ");//Hello Sanket Bhai When Will You Come In Kolhapur 
	    	
	    }


	    String s1="pleasure to meet you ";
		String[] s2 = s1.split(" ");
		for(int i=0;i<s2.length;i++) {
			String s3 = s2[i].substring(0, 1);
			String s4 = s2[i].substring(1);
			String s5 = s3.toUpperCase();
			System.out.print((s5+s4)+" ");
			
		}

		
	
	

	
	
	
	
	
}
}
