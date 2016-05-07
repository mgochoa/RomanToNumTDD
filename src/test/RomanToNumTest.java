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
		//Convertir 'II' a 2
		@Test
		public void convertirII() {
			r = rtn.convert("II");
			assertEquals(2,r);
		}
		//Convertir 'III'
		@Test
		public void convertirIII(){
			r= rtn.convert("III");
			assertEquals(3, r);
		}
		//COnvertir 'IV'
		@Test
		public void convertirIV(){
			r= rtn.convert("IV");
			assertEquals(4, r);
		}
		@Test
		public void convertirV(){
			r= rtn.convert("V");
			assertEquals(5, r);
		}
		@Test
		public void convertirVI(){
			r= rtn.convert("VI");
			assertEquals(6, r);
		}
		
		@Test
		public void convertirVII(){
			r= rtn.convert("VII");
			assertEquals(7, r);
		}
		@Test
		public void convertirVIII(){
			r= rtn.convert("VIII");
			assertEquals(8, r);
		}
		@Test
		public void convertirIX(){
			r= rtn.convert("IX");
			assertEquals(9, r);
		}
		@Test
		public void convertirX(){
			r= rtn.convert("X");
			assertEquals(10, r);
		}
		
		@Test
		public void convertirXIX(){
			r= rtn.convert("XIX");
			assertEquals(19, r);
		}
		@Test
		public void convertirXXIX(){
			r= rtn.convert("XXIX");
			assertEquals(29, r);
		}
		@Test
		public void convertirXXX(){
			r= rtn.convert("XXX");
			assertEquals(30, r);
		}
		@Test
		public void convertirXL(){
			r= rtn.convert("XL");
			assertEquals(40, r);
		}
		@Test
		public void convertirXLIX(){
			r= rtn.convert("XLIX");
			assertEquals(49, r);
		}
		@Test
		public void convertirL(){
			r= rtn.convert("L");
			assertEquals(50, r);
		}
		@Test
		public void convertirLXXVII(){
			r= rtn.convert("LXXVII");
			assertEquals(77, r);
		}
		@Test
		public void convertirXC(){
			r= rtn.convert("XC");
			assertEquals(90, r);
		}
		@Test
		public void convertirXCIX(){
			r= rtn.convert("XCIX");
			assertEquals(99, r);
		}
		@Test
		public void convertirC(){
			r= rtn.convert("C");
			assertEquals(100, r);
		}
		
		



}
