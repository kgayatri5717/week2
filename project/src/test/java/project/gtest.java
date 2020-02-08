package project;

import static org.junit.Assert.*;

import org.junit.Test;

public class gtest {

	@Test
	public void test() {
		gayatri t=new gayatri();
		chocolates c[]=new chocolates[5];
		c[0].get("toffee",3);
		 c[1].get("kitkat",6);
		c[2].get("dairymilk",8);
		c[3].get("melody",4);
		c[4].get("lotte",3);
		
		String output=t.display(c,3,5);
		assertEquals("toffee melody lotte ",output);
	}

}
