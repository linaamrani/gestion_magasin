package shop;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {

		System.out.println("Bienvenue sur notre site.\n \tNous vous souhaitons un agréable shopping\n");
		// création des boutiques existantes et ajout à la liste des Boutiques
		// disponibles
		Boutique boutique = new Boutique("BoutiqueNum : 1", "40 Rue de Longchamp, 75116 Paris");
		Boutique boutique1 = new Boutique("BoutiqueNum : 2", "30 Rue de l'Armorique, 75015 Paris");
		Boutique boutique2 = new Boutique("BoutiqueNum : 3", "34 Rue de Pessac, 33000 Bordeaux");
		List<Boutique> boutiques = new ArrayList<Boutique>();
		boutiques.add(boutique);
		boutiques.add(boutique1);
		boutiques.add(boutique2);

//	genre-categorie-couleur-stock-prix-reference-matiere-taille
//	F-Tshirt-Bl-10-10,5-Tshirt100-Co-S
//	F-Pantalon-Bl-10-10,5-Pantalon100-Co-34
//
//	genre-categorie-couleur-stock-prix-reference-matiere-taille-coupe
//	F-Jean-Bl-10-10,5-Jean100-Co-34-O
//
//	genre-categorie-couleur-stock-prix-reference-matiere
//	F-Sac-Bl-10-10,5-Sac100-Co
//	F-Lunettes-Bl-10-10,5-Lunettes100-Co

		// creation des Collections homme HommeCo et femme FemmeCo et du Stock
		// initialisation du stock par les collections
		// initialisation des collections
		FemmeCo femmeCo = new FemmeCo();
		HommeCo hommeCo = new HommeCo();
		Stock stock = new Stock();
		stock.initialiserStock(femmeCo, hommeCo);
		femmeCo.initiliserFemmeCo();
		hommeCo.initiliserHommeCo();
		// creation et déroulement d'une commande
		Commande commande = new Commande();
		commande.passerCommande(femmeCo, hommeCo, stock, boutiques);
		//Mise à jour du stock
		stock.mettreAjourStock(femmeCo,hommeCo);
	}
}
