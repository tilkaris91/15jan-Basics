package practice;

public class ConstructorVi {
	  public  ConstructorVi(){
		
			System.out.println("sanket");
		}
	
	public ConstructorVi(int a,int b) {
		this();
		int k=a-b;
		System.out.println(k);
		
	}
	public ConstructorVi(int a,String b) {
		
		
		
		System.out.println("vishakha");
	}
	public ConstructorVi(String s,int d) {
		System.out.println("gaurav");  //g=>v=>s=>value of k
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		ConstructorVi var=new ConstructorVi("ss",4);
		
		
		
		
	}
	
}
