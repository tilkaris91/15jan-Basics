package loop;

public class practice {
public static void main(String[] args) {
	for(int i=1;i<=5;i++){
		
		for (int j=1;j<=9;j++){
		if(j<=i){
		System.out.print("*");

		}
		else{
		System.out.print(" ");

		}






		}

		System.out.println();
		}
for(int i=6;i<=9;i++){
		
		for (int j=1;j<=9;j++){
		if(j<=(10-i)){
		System.out.print("*");

		}
		else{
		System.out.print(" ");

		}






		}

		System.out.println();
		}

}
}