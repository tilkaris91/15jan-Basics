package practice;

public class Beak {
public static void main(String[] args) {
	for(char i='a';i<='z';i++) {
		if(i=='y') {
			System.out.println("break statment executing");
			break;
		}
		System.out.println("small letters  "+i);
	}
}
}
