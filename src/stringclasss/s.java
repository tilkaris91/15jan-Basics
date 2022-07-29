package stringclasss;



public class s {
public static void main (String[] args) {
//String s="sanket kundan chandu  mayur  akash  umesh  shivku";
//String[] s1 = s.split(" ");
//
//
//for(int i=0;i<s1.length;i++) {
//	if(i%2==0)
//	System.out.print(s1[i]+" ");
//}
String s2="sanket";
String re="";
int s3 = s2.length();
int s4 = s3-1;
for(int i=s4;i>=0;i--) {
	
	char s6 = s2.charAt(i);
	re=re+s6;
	
}
System.out.println(re);

}
}