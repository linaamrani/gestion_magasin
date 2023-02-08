package shop;
/**
 * Un objet Pull est un ArticleHaut dont la catégorie est Pull 
 * @author Lina Amrani & Farah Ellouze 
 *
 */
public class Pull extends ArticleHaut {

	private Categorie categorie = Categorie.Pull;

	public Pull(String couleur, int stock, double prix, String reference, String matiere, String taille) {
		super(couleur, stock, prix, reference, matiere, taille);
	}

	public String toString() {
		return categorie+ " " + super.toString() + afficheDispo();
	}

}