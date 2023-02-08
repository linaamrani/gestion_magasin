package test;
import shop.*;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class JeanTest {

	@Test
	void testAffiche() {
		Jean jean = new Jean("Bleu", 15, 25.95, "Ref8", "Coton", "T42", "Flare");
		System.out.println(jean.toString());
	}

	@Test
	void testGetCoupe() {
		Jean jean = new Jean("Bleu", 15, 25.95, "Ref8", "Coton", "T42", "Flare");
		assertEquals("Erreur getRef",jean.getReference(),"Ref8");

	}


	

}
