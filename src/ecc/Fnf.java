package ecc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class Fnf extends FileNotFoundException {
	public static void main(String[] args) {
		try {
			System.out.println("lahu");
			FileInputStream b=new FileInputStream("C:\\Users\\hp\\Desktop\\NotePad\\Book1.xlsx");
		}
		catch(FileNotFoundException v){
			System.out.println("sanket");
		}
		
	}

}
