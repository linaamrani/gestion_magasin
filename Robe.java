package shop;
/**
 * Un objet Robe est un ArticleHaut dont la catégorie est Robe 
 * @author Lina Amrani & Farah Ellouze 
 *
 */
public class Robe extends ArticleHaut {

	private Categorie categorie = Categorie.Robe;

	public Robe(String couleur, int stock, double prix, String reference, String matiere, String taille) {
		super(couleur, stock, prix, reference, matiere, taille);
	}


	public String toString() {
		return categorie+ " " + super.toString() + afficheDispo();
	}

}
