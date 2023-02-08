package shop;

/**
 * Cette classe énumère les catégories auxquelles un Article peut appartenir
 * @author Lina Amrani & Farah Ellouze 
 *
 */
public enum Categorie {
	/** Tshirt
	 */
	Tshirt("Tshirt","Tshirt"), 
	/** Chemise
	 */
	Chemise("Chemise","Chemise"), 
	/** Pull
	 */
	Pull("Pull","Pull"), 
	/** Pantalon
	 */
	Pantalon("Pantalon","Pantalon"), 
	/** Jean
	 */
	Jean("Jean","Jean"), 
	/** Robe
	 */
	Robe("Robe","Robe"), 
	/** Sac
	 */
	Sac("Sac","Sac"), 
	/** Lunettes
	 */
	Lunettes("Lunettes","Lunettes");
	private final String code;

	private final String libelle;

	public String getCode() {
		return this.code;
	}

	public String getLibelle() {
		return this.libelle;
	}
	/**
	 * Methode constructeur 
	 * @param code Code faisant référence à la catégorie 
	 * @param libelle Libellé de la catégorie 
	 */
	Categorie(String code, String libelle) {
		this.code = code;
		this.libelle = libelle;
	}

	/**
	 * Methode qui permet de récupérer le libellé d'une catégorie étant 
	 * donné un code de catégorie 
	 * @param code Code de la catégorie dont on veut récupérer le libellé
	 * @return La chaine de caractères du libellé correspondant au code 
	 */
	public static String getLibelleByCode(String code) {

		String libelle = "";

		if (Tshirt.getCode().equals(code)) {
			libelle = Tshirt.getLibelle();
		} else if (Chemise.getCode().equals(code)) {
			libelle = Chemise.getLibelle();
		} else if (Pull.getCode().equals(code)) {
			libelle = Pull.getLibelle();
		} else if (Pantalon.getCode().equals(code)) {
			libelle = Pantalon.getLibelle();
		} else if (Jean.getCode().equals(code)) {
			libelle = Jean.getLibelle();
		} else if (Robe.getCode().equals(code)) {
			libelle = Robe.getLibelle();
		} else if (Sac.getCode().equals(code)) {
			libelle = Sac.getLibelle();
		} else if (Lunettes.getCode().equals(code)) {
			libelle = Lunettes.getLibelle();
		}

		return libelle;
	}
}

