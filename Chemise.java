package shop;

/**
 * Un objet Chemise est un ArticleHaut dont la catégorie est Chemise
 * @author Lina Amrani & Farah Ellouze 
 *
 */
public class Chemise extends ArticleHaut {
	private Categorie categorie = Categorie.Chemise;
	
	public Chemise(String couleur, int stock, double prix, String reference, String matiere, String taille) {
		super(couleur, stock, prix, reference, matiere, taille);
	}

	public String toString() {
		return categorie + " " + super.toString() + afficheDispo();
	}

}
