package test;
import shop.*;


import org.junit.jupiter.api.Test;

class LunettesTest {

	@Test
	void testAffiche() {
		Lunettes lunettes= new Lunettes("Noir", 20, 40.95, "Ref7", "Acetate");
		System.out.println(lunettes.toString());
	}


}
