package shop;

/**
 * Un objet Lunettes est un Article dont la catégorie est Lunettes
 * @author Lina Amrani & Farah Ellouze 
 *
 */
public class Lunettes extends Article {
	private Categorie categorie = Categorie.Lunettes;

	public Lunettes(String couleur, int stock, double prix, String reference, String matiere) {
		super(couleur, stock, prix, reference, matiere);
	}

	@Override
	public String toString() {
		return super.toString() + ", categorie=" + categorie + afficheDispo();
	}
}
