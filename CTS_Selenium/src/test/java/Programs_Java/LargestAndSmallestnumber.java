package Programs_Java;

public class LargestAndSmallestnumber {

	public static void main(String[] args) {
		int a[]={10,20,30,40,9};
		int smallest=a[0];
		for(int i=0;i<a.length;i++){
		    if(a[i]<smallest){
		        //System.out.println((largest));
		        //System.out.println(a[i]);
		        smallest=a[i];
		   }
		}
System.out.println("smallest"+smallest);

	}

}
