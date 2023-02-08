package shop;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Cette classe lit le fichier Collection.txt qui contient le stock du magasin
 * @author linamrani
 *
 */
public class Stock {

	private File collection = new File("collection.txt");
	private FileReader fileReader;
	private BufferedReader bufferedReader;
	private String tailleH = "";
	private String tailleB = "";
	private String coupe = "";
	private String genre;
	private String categorie;
	private String couleur;
	private int stock;
	private double prix;
	private String reference;
	private String matiere;

	public Stock() {

	}
	
	/**
	 * Methode qui initialise le Stock du magasin à partir des artciles présents dans le 
	 * fichier Collection.txt
	 * @param femmeCo Collection FemmeCo dans laquelle on va mettre l'article si le genre est Femme:F
	 * @param hommeCo Collection HpmmeCo dans laquelle on va mettre l'article si le genre est Homme:H
	 * @throws IOException Erreur en cas de problème de lecture du fichier
	 */
	public void initialiserStock(FemmeCo femmeCo, HommeCo hommeCo) throws IOException {
		try {
			fileReader = new FileReader(collection);
			bufferedReader = new BufferedReader(fileReader);
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				String[] arrOfStr = line.split("-");
				genre = arrOfStr[0];
				categorie = arrOfStr[1].toUpperCase();
				couleur = Couleur.getLibelleByCode(arrOfStr[2].toUpperCase());
				stock = Integer.parseInt(arrOfStr[3]);
				prix = Double.parseDouble(arrOfStr[4]);
				reference = arrOfStr[5];
				matiere = Matiere.getLibelleByCode(arrOfStr[6].toUpperCase());
				if (arrOfStr.length > 7) {
					tailleH = TailleH.getLibelleByCode(arrOfStr[7].toUpperCase());
					tailleB = TailleB.getLibelleByCode(arrOfStr[7]);
				}

				if (arrOfStr.length > 8) {
					coupe = Coupe.getLibelleByCode(arrOfStr[0].toUpperCase());
				}

				if ("F".equals(genre.toUpperCase())) {
					if (Categorie.Robe.toString().toUpperCase().equals(categorie)) {
						Robe robe = new Robe(couleur, stock, prix, reference, matiere, tailleH);
						femmeCo.ajouterRobe(reference,robe);
					} else if (Categorie.Sac.toString().toUpperCase().equals(categorie)) {
						Sac sac = new Sac(couleur, stock, prix, reference, matiere);
						femmeCo.ajouterSac(reference,sac);
					} else {
						chargerCollection(categorie, femmeCo);
					}
				} else if ("H".equals(genre.toUpperCase())) {
					chargerCollection(categorie, hommeCo);
				}

			}
			fileReader.close();

		} catch (IOException e) {
			System.out.println("Le fichier n'a pas pu être ouvert");
			throw e;
		}
	}

	/**
	 * Methode qui rempli les Collections avec les articles selon le genre et la categorie
	 * @param categorie Categorie de l'Article à charger dans la collection
	 * @param collection Collection dans laquelle on va charger l'Article
	 */
	private void chargerCollection(String categorie, Collection collection) {
		if (Categorie.Pantalon.toString().toUpperCase().equals(categorie)) {
			Pantalon Pantalon = new Pantalon(couleur, stock, prix, reference, matiere, tailleB);
			collection.ajouterPantalon(reference,Pantalon);
		} else if (Categorie.Tshirt.toString().toUpperCase().equals(categorie)) {
			Tshirt tshirt = new Tshirt(couleur, stock, prix, reference, matiere, tailleH);
			collection.ajouterTshirt(reference,tshirt);
		} else if (Categorie.Pull.toString().toUpperCase().equals(categorie)) {
			Pull pull = new Pull(couleur, stock, prix, reference, matiere, tailleH);
			collection.ajouterPull(reference,pull);
		} else if (Categorie.Chemise.toString().toUpperCase().equals(categorie)) {
			Chemise chemise = new Chemise(couleur, stock, prix, reference, matiere, tailleH);
			collection.ajouterChemise(reference,chemise);
		} else if (Categorie.Jean.toString().toUpperCase().equals(categorie)) {
			Jean jean = new Jean(couleur, stock, prix, reference, matiere, tailleB, coupe);
			collection.ajouterJean(reference,jean);
		} else if (Categorie.Lunettes.toString().toUpperCase().equals(categorie)) {
			Lunettes lunettes = new Lunettes(couleur, stock, prix, reference, matiere);
			collection.ajouterLunettes(reference,lunettes);
		}
	}
	
	/**
	 * Methode qui décremente le Stock dans le programme en diminuant d'une unité le stock
	 * des articles du Panier qui a été commandé par un CLient 
	 * @param panier
	 */
	public void decrementeStock (Panier panier){
		for (Article a : panier.getPanier()) {
			a.modifStock(1);
		}
	}
	
	public void mettreAjourStock(FemmeCo femmeCo, HommeCo hommeCo) throws FileNotFoundException {
		PrintWriter writer;
		try {
			writer = new PrintWriter(collection);
			mettreAjourCollection(femmeCo, writer, "F");
			mettreAjourCollection(hommeCo, writer, "H");
			for (Robe robe : femmeCo.getRobes().values()) {
				writer.println("F-" + Categorie.Robe.getLibelle() + "-" + Couleur.getCodeByLibelle(robe.getCouleur())
						+ "-" + robe.getStock() + "-" + robe.getPrix() + "-" + robe.getReference() + "-"
						+ Matiere.getCodeByLibelle(robe.getMatiere()) + "-" + robe.getTaille());
			}
			for (Sac sac : femmeCo.getSacs().values()) {
				writer.println("F-" + Categorie.Sac.getLibelle() + "-" + Couleur.getCodeByLibelle(sac.getCouleur())
						+ "-" + sac.getStock() + "-" + sac.getPrix() + "-" + sac.getReference() + "-"
						+ Matiere.getCodeByLibelle(sac.getMatiere()));
			}
			writer.close();
		} catch (FileNotFoundException e) {
			System.out.println("Un probléme est survenu lors de la mise à jour du fichier");
			throw e;
		}

	}

	/**
	 * Methode qui  le Stock dans le fichier collection.txt en diminuant d'une unité le stock
	 * des articles du Panier qui a été commandé par un CLient 
	 * @param panier
	 */
	private void mettreAjourCollection(Collection collection, PrintWriter writer, String genre)
			throws FileNotFoundException {
		for (Tshirt tshirt : collection.getTshirts().values()) {
			writer.println(
					genre + "-" + Categorie.Tshirt.getLibelle() + "-" + Couleur.getCodeByLibelle(tshirt.getCouleur())
							+ "-" + tshirt.getStock() + "-" + tshirt.getPrix() + "-" + tshirt.getReference() + "-"
							+ Matiere.getCodeByLibelle(tshirt.getMatiere()) + "-" + tshirt.getTaille());
		}

		for (Pull pull : collection.getPulls().values()) {
			writer.println(genre + "-" + Categorie.Pull.getLibelle() + "-" + Couleur.getCodeByLibelle(pull.getCouleur())
					+ "-" + pull.getStock() + "-" + pull.getPrix() + "-" + pull.getReference() + "-"
					+ Matiere.getCodeByLibelle(pull.getMatiere()) + "-" + pull.getTaille());
		}

		for (Chemise chemise : collection.getChemises().values()) {
			writer.println(
					genre + "-" + Categorie.Chemise.getLibelle() + "-" + Couleur.getCodeByLibelle(chemise.getCouleur())
							+ "-" + chemise.getStock() + "-" + chemise.getPrix() + "-" + chemise.getReference() + "-"
							+ Matiere.getCodeByLibelle(chemise.getMatiere()) + "-" + chemise.getTaille());
		}

		for (Pantalon pantalon : collection.getPantalons().values()) {
			writer.println(genre + "-" + Categorie.Pantalon.getLibelle() + "-"
					+ Couleur.getCodeByLibelle(pantalon.getCouleur()) + "-" + pantalon.getStock() + "-"
					+ pantalon.getPrix() + "-" + pantalon.getReference() + "-"
					+ Matiere.getCodeByLibelle(pantalon.getMatiere()) + "-"
					+ TailleB.getCodeByLibelle(pantalon.getTaille()));
		}

		for (Jean jean : collection.getJeans().values()) {
			writer.println(genre + "-" + Categorie.Jean.getLibelle() + "-" + Couleur.getCodeByLibelle(jean.getCouleur())
					+ "-" + jean.getStock() + "-" + jean.getPrix() + "-" + jean.getReference() + "-"
					+ Matiere.getCodeByLibelle(jean.getMatiere()) + "-" + TailleB.getCodeByLibelle(jean.getTaille())
					+ "-" + Coupe.getCodeByLibelle(jean.getCoupe()));
		}

		for (Lunettes lunettes : collection.getDesLunettes().values()) {
			writer.println(genre + "-" + Categorie.Lunettes.getLibelle() + "-"
					+ Couleur.getCodeByLibelle(lunettes.getCouleur()) + "-" + lunettes.getStock() + "-"
					+ lunettes.getPrix() + "-" + lunettes.getReference() + "-"
					+ Matiere.getCodeByLibelle(lunettes.getMatiere()));
		}

	}
	
}
