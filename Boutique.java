package shop;
/**
 * Un objet Boutique est l'endroit où sont les articles du shop
 * où sont effectuées les commandes 
 * @author Lina Amrani & Farah Ellouze 
 *
 */
public class Boutique {

	private String nom;
	private String adresse;
	/**
	 * Methode constructeur qui fabrique l'objet Boutique en mémoire 
	 * @param nom Nom de la boutique 
	 * @param adresse Adresse de la boutique 
	 */
	public Boutique(String nom, String adresse) {
		this.nom = nom;
		this.adresse = adresse;
	}

	public String toString() {
		return ("Boutique : " + nom + " Adresse : "+ adresse );
	}
}