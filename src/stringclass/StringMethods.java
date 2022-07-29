package stringclass;

public class StringMethods {
private static final Object String = null;

public static void main(String[] args) {
	//equals
	
	String s1="sanket";
	String s2="sanket";
	boolean s3 = s1.equals(s2);
	System.out.println(s3);
	//length
	
	String s4="omshantiom";
	int s5 = s4.length();
	System.out.println(s5);
	//equalsignorcase                          
	
	String s6="shmbho";
	String s7="Shmbho";
	boolean s8 = s6.equalsIgnoreCase(s7);
	System.out.println(s8);
	
	//charAt
	
	String s9 = "sanket";
	char s10 = s9.charAt(2);
	System.out.println(s10);
	//reverse
	
    String s11 = "This is String";
	String rev = "";
	int size = s11.length();
	int lastindex = size-1;
	for (int i=lastindex; i>=0; i--)
	{
		rev = rev + s11.charAt(i);
	}
	System.out.println(rev);
	
    //varticle 
	

	
	String s12 = "sanket tilkari";
	for(int i=7; i<s12.length();i++)
	{
		char letter = s12.charAt(i);
		System.out.println(letter);
		}


	////	5. replace(char old, char new)
	String s13 ="sanket";
	String s14 = s13.replace('n', 'k');
	System.out.println(s14);
	
	////	6. replace(String old, String new)
	String s15="gaurav chendake";
	String s16 = s15.replace("gaurav","chendake");
	System.out.println(s16);
	
	//	7. substring(int index):
	String s17="harharmahadev";
	String s18 = s17.substring(6);
	System.out.println(s18);
	
//	8. substring(int beginindex, int endindex)
	String s19="vishakha rasika";
	String s20 = s19.substring(4, 11);
	System.out.println(s20);
	
	////	9. contains(String value)
	
	String s21="sanket";
	boolean s22 = s21.contains("sa");
	System.out.println(s22);
	
//	10. toLowerCase()
	String s23="sankET";
	String s24 = s23.toLowerCase();
	System.out.println(s24);
	
//	11. toUpperCase()
	String s25 = "saNkET";
	java.lang.String s26 = s25.toUpperCase();
System.out.println(s26);

////	12. indexOf(char ch)
String s27="TeraTeraTeraSuror";
int s28 = s27.indexOf('u');
System.out.println(s28);

//wap to count char in a program
String s29 = "aabbaaccd";
int count =0;

for(int i=0; i<s29.length(); i++)
{
	char c = s29.charAt(i);
	
	if(c=='a')
	{
		count++;
	}
	
}

System.out.println("Character a is present for "+count+" times");


// 13 trim
String s30="                 shiv                ";
String s31 = s30.trim();
System.out.println(s31);


//14 split
String s32="one two three";
String[] s33 = s32.split(" ");
for(String ss:s33) {
	System.out.println(ss);
}

//15 ToCharArray
String s34="sanket DOB is 29/08/1997";
char[] s35 = s34.toCharArray();
int sizee =s35.length;
for (int i=0;i<sizee;i++) {
	System.out.println(s35[i]);
}

// 16 valueOf
String s47 = "sdfdsf234sd@#$%lkfj3fn%&*dslk3e3fnc";

String s54 = s47.replaceAll("[a-z@#$%^&*!0-9]", "                   ");
System.out.println(s54);

//WAP to print  the reverse string without reversing the letters but the words
//ex. This is String ----> String is This 


String w="Sanket Tilkari";
String rev1="";
int size1=w.length();
int lastindex1=size1-1;
for(int k = lastindex1;k>=0;k--){
rev1=rev1+w.charAt(k);
}
System.out.println(rev1);
}
}
