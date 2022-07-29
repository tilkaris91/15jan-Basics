package practice;

public class Continue {
public static void main(String[] args) {
	public static void main(String[] args) {
		char i='a';
		while(i<='z') {
			if(i>'f') {
				System.out.println(i);
				i++;
				continue;
			}
			System.out.println("sorry a,b,c,d,e and f are already used please use following charecter");
			i++;
		}
	}
}
