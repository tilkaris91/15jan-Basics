package practice;

public class A {
public static void main(String[] args) {
	for (char i='A';i<='Z';i++) {
		if(i=='D') {
			System.out.println("sorry could not execute all values becouse of break key word");
			break;
		}
		System.out.println("upper case "+i);
	}
}
}
