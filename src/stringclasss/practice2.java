package stringclasss;

public class practice2 {
public static void main(String[] args) {
	String s="my name is sanket";
	String[] s1 = s.split(" ");
	 int size = s1.length;
	 int lastindex = size-1;
	 for(int i=lastindex;i>=0;i--) {
		 System.out.print(s1[i]+" ");
	 }
	
	String b="my name is sanket";
	String[] b1 = b.split(" ");
	for(int j=0;j<b1.length;j++) {
		String b2 = b1[j].substring(0, 1);
		String b3 = b2.toUpperCase();
		String b4 = b1[j].substring(1);
		System.out.print((b3+b4)+" ");
	}
	
	String g="sa834283ghghagh#$$%&^7";
	 String g1 = g.replaceAll("[a-z]", "");
	 System.out.println(g1);
}
}
