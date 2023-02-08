package test;
import shop.*;

import org.junit.jupiter.api.Test;

class ChemiseTest {

	@Test
	void testAffiche() {
		Chemise chemise = new Chemise("Vert" , 10, 39.95,  "Ref9", "Coton","S" );
		System.out.println(chemise.toString());

	}

}
