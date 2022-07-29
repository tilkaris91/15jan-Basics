
public class pr {
	public static void main(String[] args){
		for(int i=1;i<=5;i++){
		for(int j=1;j<=5;j++){
		if(j>=i){                                                             
		System.out.print("*");}                                      //j>=1 && j<=4  
		else{                                                        //3
		System.out.print(" ");                                       //2
		}                                                            //1

		}
		System.out.println();

		}
		for(int i=6;i<=9;i++){
			for(int j=1;j<=5;j++){
			if(j>=(10-i)){                                                             
			System.out.print("*");}                                      //j>=1 && j<=4  
			else{                                                        //3
			System.out.print(" ");                                       //2
			}                                                            //1

			}
			System.out.println();

			}
	}
	
}
