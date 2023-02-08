package shop;

import java.util.HashMap;
/**
 * Un objet HommeCo est une Collection contenant des Articles pour homme
 * @author Lina Amrani & Farah Ellouze
 *
 */

public class HommeCo extends Collection {

	private HashMap<String, Article> hommeCo = new HashMap<String, Article>();

	
	public HashMap<String, Article> getHommeCo() {
		return hommeCo;
	}

	public void setHommeCo(HashMap<String, Article> hommeCo) {
		this.hommeCo = hommeCo;
	}


	public void ajouterTshirt(String reference, Tshirt tshirt) {
		tshirts.put(reference, tshirt);
	}

	public void ajouterPull(String reference, Pull pull) {
		pulls.put(reference, pull);
	}

	public void ajouterChemise(String reference, Chemise chemise) {
		chemises.put(reference, chemise);
	}

	public void ajouterPantalon(String reference, Pantalon pantalon) {
		pantalons.put(reference, pantalon);
	}

	public void ajouterJean(String reference, Jean jean) {
		jeans.put(reference, jean);
	}

	public void ajouterLunettes(String reference, Lunettes lunettes) {
		desLunettes.put(reference, lunettes);
	}
	
	/**
	 * Methode qui permet d'initialiser la collection pour hommes HommeCo
	 * en ajoutant dans la liste hommeco tous les articles disponibles 
	 * appartenant a cette collection
	 */
	public void initiliserHommeCo() {
		hommeCo.putAll(tshirts);
		hommeCo.putAll(pulls);
		hommeCo.putAll(chemises);
		hommeCo.putAll(pantalons);
		hommeCo.putAll(jeans);
		hommeCo.putAll(desLunettes);
	}
	
	/**
	 * Methode qui affiche la Collection HommeCo en faisant appel à la 
	 * fonction toString pour chaque Article de la collection
	 */
	public void afficheHommeCo() {
		for (Article a : hommeCo.values()) {
			System.out.println(a.toString());
		}
	}

	@Override
	public String toString() {
		return "HommeCollection : " + hommeCo;
	}
}