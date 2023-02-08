package shop;

/**
 * Cette classe énumère les matières que peut prendre un Article 
 * @author Lina Amrani & Farah Ellouze 
 *
 */
public enum Matiere {
	/** Coton
	 */
	Coton("Co", "Coton"),
	/** Polyester
	 */
	Polyester("P", "Polyester"), 
	/** Lin
	 */
	Lin("Li", "Lin"),
	/** Soie
	 */
	Soie("S", "Soie"), 
	/** Lycra
	 */
	Lycra("Ly", "Lycra"),
	/** Laine
	 */
	Laine("La", "Laine"), 
	/** Cuir
	 */
	Cuir("Cu", "Cuir"), 
	/** Acetate
	 */
	Acetate("Ac", "Acetate");

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
	 * @param code Code faisant référence à la matière 
	 * @param libelle Libellé de la matière 
	 */
	Matiere(String code, String libelle) {
		this.code = code;
		this.libelle = libelle;
	}
	
	/**
	 * Methode qui permet de récupérer le libellé d'une matière étant 
	 * donné un code de matière 
	 * @param code Code de la matière dont on veut récupérer le libellé
	 * @return La chaine de caractères du libellé correspondant au code 
	 */
	public static String getLibelleByCode(String code) {

		String libelle = "";

		if (Coton.getCode().toUpperCase().equals(code)) {
			libelle = Coton.getLibelle();
		} else if (Polyester.getCode().toUpperCase().equals(code)) {
			libelle = Polyester.getLibelle();
		} else if (Lin.getCode().toUpperCase().equals(code)) {
			libelle = Lin.getLibelle();
		} else if (Soie.getCode().toUpperCase().equals(code)) {
			libelle = Soie.getLibelle();
		} else if (Lycra.getCode().toUpperCase().equals(code)) {
			libelle = Lycra.getLibelle();
		} else if (Laine.getCode().toUpperCase().equals(code)) {
			libelle = Laine.getLibelle();
		} else if (Cuir.getCode().toUpperCase().equals(code)) {
			libelle = Cuir.getLibelle();
		} else if (Acetate.getCode().toUpperCase().equals(code)) {
			libelle = Acetate.getLibelle();
		}

		return libelle;
	}
	
	/**
	 * Methode qui permet de récupérer le code d'une matière étant 
	 * donné le libellé de matière 
	 * @param code Code de la matière dont on veut récupérer le libellé
	 * @return La chaine de caractères du libellé correspondant au code 
	 */
	
	public static String getCodeByLibelle(String libelle) {

		String code = "";

		if (Coton.getLibelle().equals(libelle)) {
			code = Coton.getCode();
		} else if (Polyester.getLibelle().equals(libelle)) {
			code = Polyester.getCode();
		} else if (Lin.getLibelle().equals(libelle)) {
			code = Lin.getCode();
		} else if (Soie.getLibelle().equals(libelle)) {
			code = Soie.getCode();
		} else if (Lycra.getLibelle().equals(libelle)) {
			code = Lycra.getCode();
		} else if (Laine.getLibelle().equals(libelle)) {
			code = Laine.getCode();
		} else if (Cuir.getLibelle().equals(libelle)) {
			code = Cuir.getCode();
		} else if (Acetate.getLibelle().equals(libelle)) {
			code = Acetate.getCode();
		}

		return code;
	}
}