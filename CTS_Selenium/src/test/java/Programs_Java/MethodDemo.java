package Programs_Java;

public class MethodDemo {
	void m1() {
		System.out.println("m1 is instance method");
	}
	static void m2() {
		System.out.println("m2 is static method");
	}

	public static void main(String[] args) {
		MethodDemo demo=new MethodDemo();
		demo.m1();
		MethodDemo.m2();
		
		

	}

}
