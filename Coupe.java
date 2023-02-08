package shop;
/**
 * Cette classe énumère les coupes que peut prendre un Jean 
 * @author Lina Amrani & Farah Ellouze 
 *
 */
public enum Coupe {
	/** Oversize
	 */
	Oversize("O", "Oversize"), 
	/** Slim
	 */
	Slim("S", "Slim"), 
	/** Taille haute
	 */
	Taille_Haute("H", "Taille_Haute"), 
	/** Large
	 */
	Large("L", "Large"),
	/** Flare
	 */
	Flare("F", "Flare");

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
	 * @param code Code faisant référence à la coupe 
	 * @param libelle Libellé de la coupe 
	 */
	Coupe(String code, String libelle) {
		this.code = code;
		this.libelle = libelle;
	}
	
	/**
	 * Methode qui permet de récupérer le libellé d'une coupe étant 
	 * donné un code de coupe 
	 * @param code code de la coupe dont on veut récupérer le libellé
	 * @return La chaine de caractères du libellé correspondant au code 
	 */
	public static String getLibelleByCode(String code) {

		String libelle = "";

		if (Oversize.getCode().toUpperCase().equals(code)) {
			libelle = Oversize.getLibelle();
		} else if (Slim.getCode().toUpperCase().equals(code)) {
			libelle = Slim.getLibelle();
		} else if (Taille_Haute.getCode().toUpperCase().equals(code)) {
			libelle = Taille_Haute.getLibelle();
		} else if (Large.getCode().toUpperCase().equals(code)) {
			libelle = Large.getLibelle();
		} else if (Flare.getCode().toUpperCase().equals(code)) {
			libelle = Flare.getLibelle();
		}

		return libelle;
	}
	
	/**
	 * Methode qui permet de récupérer le code d'une coupe étant 
	 * donné le libellé de la coupe 
	 * @param code Code de la coupe dont on veut récupérer le libellé
	 * @return La chaine de caractères du libellé correspondant au code 
	 */
	
	
	public static String getCodeByLibelle(String libelle) {

		String code = "";

		if (Oversize.getLibelle().equals(libelle)) {
			code = Oversize.getCode();
		} else if (Slim.getLibelle().equals(libelle)) {
			code = Slim.getCode();
		} else if (Taille_Haute.getLibelle().equals(libelle)) {
			code = Taille_Haute.getCode();
		} else if (Large.getLibelle().equals(libelle)) {
			code = Large.getCode();
		} else if (Flare.getLibelle().equals(libelle)) {
			code = Flare.getCode();
		}

		return code;
	}
}
