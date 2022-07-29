package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileNotFoundException {
public static void main(String[] args)   {
	try {
	FileInputStream wer =new FileInputStream("C:\\Users\\hp\\Desssktop\\screenshot\\AWANS.PNG");
	}
	catch(FileNotFoundException m) {
		System.out.println("sanket");
	}
}
}
