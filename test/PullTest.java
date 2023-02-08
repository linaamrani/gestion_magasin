package test;
import shop.*;


import org.junit.jupiter.api.Test;

class PullTest {

	@Test
	void testAffiche() {

		Pull pull = new Pull("Gris", 15, 37.95, "Ref3", "Laine", "XL");
		System.out.println(pull.toString());
	}



}
