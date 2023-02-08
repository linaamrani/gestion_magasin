package shop;
/**
 * Un objet Jean un ArticleBas dont la catégorie est Jean
 * @author Lina Amrani & Farah Ellouze 
 *
 */
public class Jean extends ArticleBas {

	private Categorie categorie = Categorie.Jean;
	private String coupe;
	
	public Jean(String couleur, int stock, double prix, String reference, String matiere, String taille, String coupe) {
		super(couleur, stock, prix, reference, matiere, taille);
		this.coupe = coupe;
	}

	public String getCoupe() {
		return coupe;
	}

	public void setCoupe(String coupe) {
		this.coupe = coupe;
	}

	@Override
	public String toString() {
		return categorie + " " + super.toString()  + ", coupe=" + coupe + afficheDispo();
	}

}
