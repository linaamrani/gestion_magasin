package shop;
/**
 * Cette classe énumère les couleurs qu'un Article peut prendre
 * @author Lina Amrani & Farah Ellouze 
 *
 */
public enum Couleur {
	/** Rouge
	 */
	Rouge("R", "Rouge"),
	/** Bleu
	 */
	Bleu("Bl", "Bleu"),
	/** Noir
	 */
	Noir("N", "Noir"), 
	/** Vert
	 */
	Vert("V", "Vert"),
	/** Gris
	 */
	Gris("G", "Gris"),
	/** Beige
	 */
	Beige("Be", "Beige"), 
	/** A motifs
	 */
	A_Motifs("M", "A_Motifs");

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
	 * @param code Code faisant référence à la couleur 
	 * @param libelle Libellé de la couleur
	 */
	Couleur(String code, String libelle) {
		this.code = code;
		this.libelle = libelle;
	}
	/**
	 * Methode qui permet de récupérer le libellé d'une couleur étant 
	 * donnée un code de couleur 
	 * @param code Code de la couleur dont on veut récupérer le libellé
	 * @return La chaine de caractères du libellé correspondant au code 
	 */
	public static String getLibelleByCode(String code) {

		String libelle = "";

		if (Rouge.getCode().toUpperCase().equals(code)) {
			libelle = Rouge.getLibelle();
		} else if (Bleu.getCode().toUpperCase().equals(code)) {
			libelle = Bleu.getLibelle();
		} else if (Noir.getCode().toUpperCase().equals(code)) {
			libelle = Noir.getLibelle();
		} else if (Vert.getCode().toUpperCase().equals(code)) {
			libelle = Vert.getLibelle();
		} else if (Gris.getCode().toUpperCase().equals(code)) {
			libelle = Gris.getLibelle();
		} else if (Beige.getCode().toUpperCase().equals(code)) {
			libelle = Beige.getLibelle();
		} else if (A_Motifs.getCode().toUpperCase().equals(code)) {
			libelle = A_Motifs.getLibelle();
		}

		return libelle;
	}
	
	/**
	 * Methode qui permet de récupérer le code d'une couleur étant 
	 * donné le libellé d'une couleur 
	 * @param code Code de la couleur dont on veut récupérer le libellé
	 * @return La chaine de caractères du libellé correspondant au code 
	 */
	
	
	public static String getCodeByLibelle(String libelle) {

		String code = "";

		if (Rouge.getLibelle().equals(libelle)) {
			code = Rouge.getCode();
		} else if (Bleu.getLibelle().equals(libelle)) {
			code = Bleu.getCode();
		} else if (Noir.getLibelle().equals(libelle)) {
			code = Noir.getCode();
		} else if (Vert.getLibelle().equals(libelle)) {
			code = Vert.getCode();
		} else if (Gris.getLibelle().equals(libelle)) {
			code = Gris.getCode();
		} else if (Beige.getLibelle().equals(libelle)) {
			code = Beige.getCode();
		} else if (A_Motifs.getLibelle().equals(libelle)) {
			code = A_Motifs.getCode();
		}

		return code;
	}
}
