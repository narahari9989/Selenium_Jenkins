package Programs_Java;

public class Reverse_String {

	public static void main(String[] args) {
		String name="Hari";
		String rev="";
		for(int i=name.length()-1;i>=0;i--){
		    rev=rev+name.charAt(i);
		    
		}
		System.out.println("Reverse string:"+rev);

	}

}
