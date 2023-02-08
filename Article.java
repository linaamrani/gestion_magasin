package shop;

/**
 * Un Article est un objet qui peut etre acheté lors d'une commande dans le shop
 * 
 * @author Lina Amrani & Farah Ellouze
 *
 */
abstract public class Article {

	protected String couleur;
	protected int stock = 0;
	protected double prix;
	protected String reference;
	protected String matiere;

	/**
	 * Methode constructeur qui fabrique l'objet Article en mémoire
	 * 
	 * @param couleur   Couleur de l'article
	 * @param stock     Niveau de stock de l'article dans le shop
	 * @param prix      Prix de l'article
	 * @param reference Reference de l'article
	 * @param matiere   Matiere de l'article
	 */
	public Article(String couleur, int stock, double prix, String reference, String matiere) {
		this.couleur = couleur;
		this.stock = stock;
		this.prix = prix;
		this.reference = reference;
		this.matiere = matiere;
	}

	/**
	 * Getters and setters
	 */

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public void modifStock(int i) {
		this.stock -= i;
	}

	public int enStock() {
		if (stock > 0 && stock < 15)
			return 1;
		else if (stock >= 15)
			return 0;
		else
			return -1;
	}

	/**
	 * Permet d'afficher la disponibilité d'un article en fonction du stock
	 * disponible en magasin
	 * 
	 * @return une chaine de caractère indiquant la disponibilite en stock lorsque
	 *         le stock est supérieur à 15 stock limité lorsque le stock est
	 *         inférieur à 15 sera bientot de retour lorsque l'article n'est pas en
	 *         stock
	 * 
	 */
	public String afficheDispo() {
		if (enStock() == 0)
			return ": en stock.\n";
		if (enStock() == 1)
			return ": stock limité.\n";
		else
			return ": sera bientôt de retour.\n";
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getMatiere() {
		return matiere;
	}

	public void setMatiere(String matiere) {
		this.matiere = matiere;
	}

	public String toString() {
		return couleur + ", Prix:" + prix + ", Ref:" + reference + ", Matière:" + matiere;
	}

}
