package test;
import shop.*;

import org.junit.jupiter.api.Test;

class RobeTest {


	@Test
	void testAffiche() {

		Robe robe = new Robe("A Motifs", 13, 49.99, "Ref4", "Soie", "L");
		System.out.println(robe.toString());
	}


}
