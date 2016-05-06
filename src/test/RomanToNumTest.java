package test;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.RomanToNum;
public class RomanToNumTest {

		
		RomanToNum rtn= new RomanToNum();
		int r;
		
		
		//Convertir 'I' a 1
		@Test
		public void convertirI() {
			r = rtn.convert("I");
			assertEquals(1,r);
		}

}
