package shop;

import java.util.ArrayList;

/**
 * Un objet Panier est une liste d'objets Article qui regroupe les articles
 * qu'un client va commander
 * 
 * @author Lina Amrani & Farah Ellouze
 *
 */
public class Panier {

	private static double prix;
	private static int nbArticle = 0;
	ArrayList<Article> panier = new ArrayList<Article>();

	public double getPrix() {
		return prix;
	}

	public void setPrix() {
		prix = 0;
	}

	public int getNbArticle() {
		return nbArticle;
	}

	public void setNbArticle(int i) {
		nbArticle += i;
	}

	public ArrayList<Article> getPanier() {
		return panier;
	}

	/**
	 * Methode d'ajout d'un Article dans le Panier en fontion du genre selectionné
	 * qui va déterminer à quelle collection il appartient
	 * 
	 * @param ref     Reference de l'Article à ajouter
	 * @param g       Genre correspondant à l'article (Homme:H ou Femme:F)
	 * @param femmeCo Liste d'articles de la collection FemmeCo
	 * @param hommeCo Liste d'articles de la collection HommeCo
	 */
	public void ajoutArticle(String ref, String g, FemmeCo femmeCo, HommeCo hommeCo) {
		if (g.equals("F")) {
			Article a = (femmeCo.getFemmeCo().get(ref));
			panier.add(a);
			prix += a.prix;
		} else if (g.equals("H")) {
			Article a = (hommeCo.getHommeCo().get(ref));
			panier.add(a);
			prix += a.prix;
		}

		setNbArticle(1);
	}

	/**
	 * Methode de suppression d'un Article du Panier en fonction du genre qui va
	 * determiner à quelle Collection appartient l'Article 
	 * 
	 * @param ref     Reference de l'Article à ajouter
	 * @param g       Genre correspondant à l'article (Homme:H ou Femme:F)
	 * @param femmeCo Liste d'articles de la collection FemmeCo
	 * @param hommeCo Liste d'articles de la collection HommeCo
	 * 
	 * @return retourne vrai lorsque
	 * la référence de l'article donnée par l'utilisateur est valide
	 */
	public boolean supprArticle(String ref, String g, FemmeCo femmeCo, HommeCo hommeCo) {
		boolean supprime = false;
		if (g.equals("F")) {
			Article a = (femmeCo.getFemmeCo().get(ref));
			if (a != null) {
				panier.remove(a);
				prix -= a.getPrix();
				supprime = true;
				setNbArticle(-1);
			}
		} else if (g.equals("H")) {
			Article a = (hommeCo.getHommeCo().get(ref));
			if (a != null) {
				panier.remove(a);
				prix -= a.getPrix();
				supprime = true;
				setNbArticle(-1);
			}
		}
		return supprime;
	}

	/**
	 * Methode qui va vider le Panier à la fin d'une commande
	 */
	public void videPanier() {
		panier.clear();
	}

	/**
	 * Methode d'affichage du Panier
	 */
	public void affichePanier() {
		if (panier.size() == 0)
			System.out.println("Votre Panier est vide");
		else {
			System.out.println("Nombre d'articles: " + panier.size() + "\n");
			for (Article a : panier) {
				System.out.println(a.toString());
			}
			System.out.println("Prix total: " + prix + "€");
		}
	}

}