package shop;

import java.util.HashMap;

/**
 * Un objet Collection est une liste d'Articles
 * @author Lina Amrani & Farah Ellouze 
 *
 */
public abstract class Collection {
	
	
	protected HashMap<String, Tshirt> tshirts = new HashMap<String, Tshirt>();

	protected HashMap<String, Pull> pulls = new HashMap<String, Pull>();

	protected HashMap<String, Chemise> chemises = new HashMap<String, Chemise>();

	protected HashMap<String, Pantalon> pantalons = new HashMap<String, Pantalon>();

	protected HashMap<String, Jean> jeans = new HashMap<String, Jean>();

	protected HashMap<String, Lunettes> desLunettes = new HashMap<String, Lunettes>();
	
	public HashMap<String, Tshirt> getTshirts() {
		return tshirts;
	}

	public HashMap<String, Pull> getPulls() {
		return pulls;
	}

	public HashMap<String, Chemise> getChemises() {
		return chemises;
	}

	public HashMap<String, Pantalon> getPantalons() {
		return pantalons;
	}

	public HashMap<String, Jean> getJeans() {
		return jeans;
	}

	public HashMap<String, Lunettes> getDesLunettes() {
		return desLunettes;
	}

	public abstract void ajouterTshirt(String reference, Tshirt tshirt);

	public abstract void ajouterPull(String reference, Pull pull);

	public abstract void ajouterChemise(String reference, Chemise chemise);

	public abstract void ajouterPantalon(String reference, Pantalon pantalon);

	public abstract void ajouterJean(String reference, Jean jean);

	public abstract void ajouterLunettes(String reference, Lunettes lunettes);

}
