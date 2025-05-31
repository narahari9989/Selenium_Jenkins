package Programs_Java;

public class MethodOverloadingDemo {
	
	void add() {
		System.out.println("method with no args");
		
	}
	void add(int a) {
		System.out.println("method with one argument"+a);
	}
	void add(int a,int b) {
		int c=a+b;
		System.out.println("method with 2 argument:"+c);
	}

	public static void main(String[] args) {
		MethodOverloadingDemo demo=new MethodOverloadingDemo();
		demo.add();
		demo.add(10);
		demo.add(10, 20);
	}
}
