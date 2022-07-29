package stringclasss;

public class Assignments {
public static void main(String[] args) {
	String s="sanket sudhakar tilkari";
	String[] s1=s.split(" ");
	for(int j=0;j<s1.length;j++){
	String s2=s1[j].substring(0, 1);
	String s3=s2.toUpperCase();
	String s4=s1[j].substring(1);
	System.out.print((s3+s4)+" ");
}
	String b="good morning everyone wish you great day";
	String[] b1=b.split(" ");
	for(int k=0;k<b1.length;k++){
	String b2=b1[k].substring(0,1);
	String b3=b1[k].substring(1);
	String b4=b2.toUpperCase();
	System.out.print((b4+b3)+" ");
}
	String c="sanket sudhakar tilkari";
	String[] c1 = c.split(" ");
	for(String c2:c1) {
		System.out.println(c2);
	}
	
	String n="sanket";
	for(int i=0;i<n.length();i++) {
		char n2 = n.charAt(i);
		System.out.println(n2);
	}
	
	String f="sssssssssssffffffffffffffffjjjjjj";
	
	int count =0;
	
	for(int l=0;l<f.length();l++) {
		
		char f2 = f.charAt(l);
		if(f2=='j') {
			count++;        
		}
		
	}
	System.out.println(count);
	
	
	String r="sanket";
	String rev="";
	int size = r.length();
	int lastindex = size-1;
	for(int t=lastindex;t>=0;t--) {
		
		rev=rev+r.charAt(t);
					
	}
	System.out.println(rev);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
