package Programs_Java;

public class Test {
	
	String name;
	int id;
	//mutator method we are able to access and the data
	
	void setName(String name) {
		this.name=name;
	}
	void setId(int id) {
		this.id=id;
	}
	//accessor methods are used to read the data
	
	String getName() {
		return name;
	}
	int getId() {
		return id;
	}
	public static void main(String[] args) {
		Test t=new Test();
		
		t.setName("Yuvansh");
		t.setId(99);
		
		String name=t.getName();
		System.out.println(name);
		int id=t.getId();
		System.out.println(id);
	}

}
