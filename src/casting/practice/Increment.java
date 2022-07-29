package practice;

public class Increment {
	
public static void main(String[] args) {
	int s=10;
	
	int a=--s;
	
	System.out.println(a);//  if s++ than  10 =>if ++s than 11 => if --s than 9 => if s-- than 10
	System.out.println(s);//  if s++ than  11 =>if ++s than 11 => if --s than 9 => if s-- than 9
	
}}
