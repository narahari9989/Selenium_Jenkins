package Programs_Java;

public class Child extends Parent{
	void m2() {
		System.out.println("Child class method");
	}

	public static void main(String[] args) {
		Child c=new Child();
		c.m1();//called parent class method
		c.m2();//called child class method
		
		

	}

}
