package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsDemo {

	
		@Test
		public void demoAseertion() {
			System.out.println("Starting");
			int i =10;
			Assert.assertEquals(i, 10,"Mismatch");
			System.out.println("Ending");
			

	}

}
