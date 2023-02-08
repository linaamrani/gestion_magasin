package shop;
/**
 * Un objet Tshirt est un ArticleHaut dont la catégorie est Tshirt 
 * @author Lina Amrani & Farah Ellouze 
 *
 */
public class Tshirt extends ArticleHaut {

	private Categorie categorie = Categorie.Tshirt;

	public Tshirt(String couleur, int stock, double prix, String reference, String matiere, String taille) {
		super(couleur, stock, prix, reference, matiere, taille);
	}


	public String toString() {
		return   categorie+ " " + super.toString() + afficheDispo();
	}

}
