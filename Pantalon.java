package shop;
/**
 * Un objet Pantalon est un ArticleBas dont la catégorie est Pantalon 
 * @author Lina Amrani & Farah Ellouze 
 *
 */
public class Pantalon extends ArticleBas {
	private Categorie categorie = Categorie.Pantalon;

	public Pantalon(String couleur, int stock, double prix, String reference, String matiere, String taille) {
		super(couleur, stock, prix, reference, matiere, taille);
	}

	@Override
	public String toString() {
		return categorie+ " " + super.toString() + afficheDispo();
	}

}