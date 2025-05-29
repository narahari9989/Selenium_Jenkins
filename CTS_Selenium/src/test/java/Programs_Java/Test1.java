package Programs_Java;

public class Test1 {
	
	Test1(){
		System.out.println("Default constructor");
		
	}
	Test1(int a,int b){
		this();
		System.out.println("Parameterised constructor");
		int c=a+b;
		System.out.println("a+b value is "+c);
		
		
	}
	public static void main(String[] args) {
		Test1 t=new Test1(10,20);
		
	}

}
