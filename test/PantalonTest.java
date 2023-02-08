package test;
import shop.*;

import org.junit.jupiter.api.Test;

class PantalonTest {

	@Test
	void testAffiche() {
		Pantalon pant = new Pantalon("Noir", 15, 39.95, "Ref6", "Polyester", "T38");
		System.out.println(pant.toString());
	}

}
