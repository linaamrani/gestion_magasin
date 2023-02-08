package shop;
/**
 * Un objet Sac est un Article dont la catégorie est Sac 
 * @author Lina Amrani & Farah Ellouze 
 *
 */
public class Sac extends Article {
	private Categorie categorie = Categorie.Sac;

	public Sac(String couleur, int stock, double prix, String reference, String matiere) {
		super(couleur, stock, prix, reference, matiere);
	}

	public String toString() {
		return super.toString() + ", categorie=" + categorie + afficheDispo();
	}

}
