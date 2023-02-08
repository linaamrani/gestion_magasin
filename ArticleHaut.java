package shop;
/**
 * Un objet ArticleBas est un Article qui se porte en haut 
 * tel que les pulls, t-shirts, chemises, etc
 * @author Lina Amrani & Farah Ellouze
 *
 */
public class ArticleHaut extends Article {
	protected String taille;
	
	/**
	 * Methode constructeur qui fabrique l'objet ArticleHaut en mémoire 
	 * @param couleur Couleur de l'article haut
	 * @param stock	Niveau de stock de l'article haut dans le shop 
	 * @param prix Prix de l'article haut
	 * @param reference Reference de l'article haut
	 * @param matiere Matiere de l'article haut 
	 * @param taille Taille de l'article haut 
	 */
	public ArticleHaut(String couleur, int stock, double prix, String reference, String matiere, String taille) {
		super(couleur, stock, prix, reference, matiere);
		this.taille = taille;
	}

	public String getTaille() {
		return taille;
	}

	public void setTaille(String taille) {
		this.taille = taille;
	}

	public String toString() {
		return super.toString() + ", Taille :" + taille;
	}

}
