package shop;

/**
 * Cette classe énumère les tailles qu'un ArticleBas peut prendre
 * @author Lina Amrani & Farah Ellouze 
 *
 */
public enum TailleB {
	/** Taille 34
	 */
	T34("34", "T34"), 
	/** Taille 36
	 */
	T36("36", "T36"), 
	/** Taille 38
	 */
	T38("38", "T38"), 
	/** Taille 40
	 */
	T40("40", "T40"), 
	/** Taille 42
	 */
	T42("42", "T42"), 
	/** Taille 44
	 */
	T44("44", "T44"),
	/** Taille 46
	 */
	T46("46", "T46"), 
	/** Taille 48
	 */
	T48("48", "T48");

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
	 * @param code Code faisant référence à la taille 
	 * @param libelle Libellé de la taille 
	 */
	TailleB(String code, String libelle) {
		this.code = code;
		this.libelle = libelle;
	}
	
	/**
	 * Methode qui permet de récupérer le libellé d'une taille étant 
	 * donné un code de taille 
	 * @param code Code de la taille dont on veut récupérer le libellé
	 * @return La chaine de caractères du libellé correspondant au code 
	 */
	public static String getLibelleByCode(String code) {

		String libelle = "";

		if (T34.getCode().equals(code)) {
			libelle = T34.getLibelle();
		} else if (T36.getCode().equals(code)) {
			libelle = T36.getLibelle();
		} else if (T38.getCode().equals(code)) {
			libelle = T38.getLibelle();
		} else if (T40.getCode().equals(code)) {
			libelle = T40.getLibelle();
		} else if (T42.getCode().equals(code)) {
			libelle = T42.getLibelle();
		} else if (T44.getCode().equals(code)) {
			libelle = T44.getLibelle();
		} else if (T46.getCode().equals(code)) {
			libelle = T46.getLibelle();
		} else if (T48.getCode().equals(code)) {
			libelle = T48.getLibelle();
		}

		return libelle;
	}
	
	/**
	 * Methode qui permet de récupérer le code d'une taille étant 
	 * donné le libellé de la taille 
	 * @param code Code de la taille dont on veut récupérer le libellé
	 * @return La chaine de caractères du libellé correspondant au code 
	 */
	
	
	public static String getCodeByLibelle(String libelle) {

		String code = "";

		if (T34.getLibelle().equals(libelle)) {
			code = T34.getCode();
		} else if (T36.getLibelle().equals(libelle)) {
			code = T36.getCode();
		} else if (T38.getLibelle().equals(libelle)) {
			code = T38.getCode();
		} else if (T40.getLibelle().equals(libelle)) {
			code = T40.getCode();
		} else if (T42.getLibelle().equals(libelle)) {
			code = T42.getCode();
		} else if (T44.getLibelle().equals(libelle)) {
			code = T44.getCode();
		} else if (T46.getLibelle().equals(libelle)) {
			code = T46.getCode();
		} else if (T48.getLibelle().equals(libelle)) {
			code = T48.getCode();
		}

		return code;
	}
}
