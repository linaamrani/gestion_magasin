package shop;
/**
 * Cette classe énumère les tailles qu'un ArticleHaut peut prendre 
 * @author Lina Amrani & Farah Ellouze 
 *
 */
public enum TailleH {
	/** Taille S
	 */
	S("S", "S"), 
	/** Taille M
	 */
	M("M", "M"), 
	/** Taille L
	 */
	L("L", "L"), 
	/** Taille XL
	 */
	XL("XL", "XL"), 
	/** Taille XXL
	 */
	XXL("XXL", "XXL");

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
	TailleH(String code, String libelle) {
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

		if (S.getCode().toUpperCase().equals(code)) {
			libelle = S.getLibelle();
		} else if (M.getCode().toUpperCase().equals(code)) {
			libelle = M.getLibelle();
		} else if (L.getCode().toUpperCase().equals(code)) {
			libelle = L.getLibelle();
		} else if (L.getCode().toUpperCase().equals(code)) {
			libelle = L.getLibelle();
		} else if (XL.getCode().toUpperCase().equals(code)) {
			libelle = XL.getLibelle();
		} else if (XXL.getCode().toUpperCase().equals(code)) {
			libelle = XXL.getLibelle();
		}

		return libelle;
	}
}
