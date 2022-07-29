package array;

;

public class pr {
	 
	public static void main(String[] args) {
		String s = "abcdefabcdef";
		int count = 0;
	int	count1=0;
	int	count2=0;
	int	count3=0;
		for (int i=0; i<s.length(); i++)
		{
			if (s.charAt(i)=='a')// to count the occurrance of character 'a' in the string
			{
				count = count +1;
			}
			
		}
		
		System.out.println("The character a is available for "+count+ " times");
		System.out.println("The character a is available for "+count1+ " times");
		System.out.println("The character a is available for "+count2+ " times");
		System.out.println("The character a is available for "+count3+ " times");
}}
