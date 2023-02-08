package test;
import shop.*;


import org.junit.jupiter.api.Test;

class FemmeCoTest {

	@Test
	void test(){
		Chemise chemise1 = new Chemise("Vert" , 10, 39.95,  "Ref9", "Coton","S" );
		Chemise chemise2 = new Chemise("Bleu" , 10, 39.95,  "Ref10", "Coton","S" );
		Chemise chemise3 = new Chemise("Vert" , 10, 39.95,  "Ref11", "Coton","M" );
		Chemise chemise4 = new Chemise("Bleu" , 10, 39.95,  "Ref12", "Coton","M" );
		

		FemmeCo femmeco = new FemmeCo();
		
		femmeco.ajouterChemise(chemise1.getReference(), chemise1);
		femmeco.ajouterChemise(chemise2.getReference(), chemise2);
		femmeco.ajouterChemise(chemise3.getReference(), chemise3);
		femmeco.ajouterChemise(chemise4.getReference(), chemise4);
		femmeco.initiliserFemmeCo();
		System.out.println(femmeco.toString());
		femmeco.afficheFemmeCo();
	}
}
