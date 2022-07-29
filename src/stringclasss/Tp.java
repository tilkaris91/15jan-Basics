package stringclasss;

public class Tp {
	 
	public static void main(String[] args) {
		String s="my my best friend Best";
	
		s=s.toLowerCase();
		String[] s2 = s.split(" ");
		int size = s2.length;
		for(int i=0;i<size;i++) {
		int	count =1;
		for(int j=i+1;j<size;j++) {
			if(s2[i].equals(s2[j])) {
				count++;
				s2[j]="0";
			}
			
		}
		  //Displays the duplicate word if count is greater than 1  
        if(count > 1 && s2[i] != "0")  
            System.out.println(s2[i]);  
		}
	}
}
