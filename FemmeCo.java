package shop;

import java.util.HashMap;
/**
 * Un objet FemmeCo est une Collection contenant des Articles pour femme
 * @author Lina Amrani & Farah Ellouze
 *
 */

public class FemmeCo extends Collection {

	private HashMap<String, Sac> sacs = new HashMap<String, Sac>();

	private HashMap<String, Robe> robes = new HashMap<String, Robe>();

	private HashMap<String, Article> femmeCo = new HashMap<String, Article>();

	public HashMap<String, Sac> getSacs() {
		return sacs;
	}

	public HashMap<String, Robe> getRobes() {
		return robes;
	}

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

	public HashMap<String, Article> getFemmeCo() {
		return femmeCo;
	}

	public void setFemmeCo(HashMap<String, Article> femmeCo) {
		this.femmeCo = femmeCo;
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

	public void ajouterRobe(String reference, Robe robe) {
		robes.put(reference, robe);
	}

	public void ajouterSac(String reference, Sac sac) {
		sacs.put(reference, sac);
	}
	
	/**
	 * Methode qui permet d'initialiser la collection pour femmes FemmeCo
	 * en ajoutant dans la liste femmeco tous les articles disponibles 
	 * appartenant a cette collection
	 */
	public void initiliserFemmeCo() {
		femmeCo.putAll(tshirts);
		femmeCo.putAll(pulls);
		femmeCo.putAll(chemises);
		femmeCo.putAll(pantalons);
		femmeCo.putAll(jeans);
		femmeCo.putAll(desLunettes);
		femmeCo.putAll(sacs);
		femmeCo.putAll(robes);
	}
	
	/**
	 * Methode qui affiche la Collection FemmeCo en faisant appel à la 
	 * fonction toString pour chaque Article de la collection
	 */
	public void afficheFemmeCo() {
		for (Article a : femmeCo.values()) {
			System.out.println(a.toString());
		}
	}

	public String toString() {
		return "FemmeCollection : " + femmeCo;
	}

}
