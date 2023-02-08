package shop;


/**
 * Un objet ArticleBas est un Article qui se porte en bas 
 * tel que les pantalons, jupes, shorts , etc
 * @author Lina Amrani & Farah Ellouze 
 *
 */
public class ArticleBas extends Article {
	protected String taille;
	
	/**
	 * Methode constructeur qui fabrique l'objet ArticleBas en mémoire 
	 * @param couleur Couleur de l'artcile bas
	 * @param stock Niveau de stock de l'article bas
	 * @param prix Prix de l'article bas
	 * @param reference Reference de l'article bas 
	 * @param matiere Matière de l'article bas
	 * @param taille Taille de l'article bas 
	 */
	public ArticleBas(String couleur, int stock, double prix, String reference, String matiere, String taille) {
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
		return super.toString() + ", Taille : " + taille;
	}

}
