package test;
import shop.*;

import org.junit.jupiter.api.Test;

/*Teste Tshirt et la classe article*/

class TshirtTest {

	@Test
	void testAffiche() {

		Tshirt tshirt = new Tshirt("Rouge", 40, 25.95, "Ref1", "Coton", "S");
		System.out.println(tshirt.toString());
	}


}
