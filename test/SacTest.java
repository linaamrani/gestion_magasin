package test;
import shop.*;



import org.junit.jupiter.api.Test;

class SacTest {


	@Test
	void testAffiche() {

		Sac sac = new Sac("Beige", 30, 40.95, "Ref2", "Cuir");
		System.out.println(sac.toString());
	}

	
}
