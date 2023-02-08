package shop;

import java.util.Scanner;
import java.io.IOException;
import java.util.List;

/**
 * La classe commande permet d'effectuer les actions liées à une Commande
 * 
 * @author Lina Amrani & Farah Ellouze
 *
 */
public class Commande {

	private static int numCommande = 1000;

	public Commande() {

	}

	public void incrCommande() {
		numCommande++;
	}

	public int getNumCommande() {
		return numCommande;
	}

	/***
	 * Methode qui permet d'afficher les Articles d'une Collection en fonction de
	 * leur Categorie, de leur Taille, et de leur Couleur
	 * 
	 * @param collection Collection de laquelle vont provenir les Articles (FemmeCo
	 *                   ou HommeCo)
	 * @param categ      Categorie des Articles qui vont etre affichés
	 * @param taille     Taille des Articles qui vont etre affichés
	 * @param couleur    Couleur des Articles qui vont etre affichés
	 * @param dispo      Disponibilité des Articles dans le stocks du shop
	 * @return true si l'Article est dispo false sinon
	 */
	public boolean afficheCategorie(Collection collection, String categ, String taille, String couleur, boolean dispo) {
		if ("TSHIRT".equals(categ.toUpperCase())) {
			for (Tshirt t : collection.getTshirts().values()) {
				if (" ".equals(couleur)) {
					if (taille.equals(t.taille)) {
						dispo = true;
						System.out.println(t.toString());
					}
				} else {
					if (taille.equals(t.taille) && couleur.equals(t.couleur.toUpperCase())) {
						dispo = true;
						System.out.println(t.toString());
					}
				}
			}
		}
		if ("CHEMISE".equals(categ.toUpperCase())) {
			for (Chemise t : collection.getChemises().values()) {
				if (" ".equals(couleur)) {
					if (taille.equals(t.taille)) {
						dispo = true;
						System.out.println(t.toString());
					}
				} else {
					if (taille.equals(t.taille) && couleur.equals(t.couleur.toUpperCase())) {
						dispo = true;
						System.out.println(t.toString());
					}
				}
			}
		}
		if ("PULL".equals(categ.toUpperCase())) {
			for (Pull t : collection.getPulls().values()) {
				if (" ".equals(couleur)) {
					if (taille.equals(t.taille)) {
						dispo = true;
						System.out.println(t.toString());
					}
				} else {
					if (taille.equals(t.taille) && couleur.equals(t.couleur.toUpperCase())) {
						dispo = true;
						System.out.println(t.toString());
					}
				}
			}
		}
		if ("PANTALON".equals(categ.toUpperCase())) {
			for (Pantalon t : collection.getPantalons().values()) {
				if (" ".equals(couleur)) {
					if (taille.equals(t.taille)) {
						dispo = true;
						System.out.println(t.toString());
					}
				} else {
					if (taille.equals(t.taille) && couleur.equals(t.couleur.toUpperCase())) {
						dispo = true;
						System.out.println(t.toString());
					}
				}
			}
		}
		if ("JEAN".equals(categ.toUpperCase())) {
			for (Jean t : collection.getJeans().values()) {
				if (" ".equals(couleur)) {
					if (taille.equals(t.taille)) {
						dispo = true;
						System.out.println(t.toString());
					}
				} else {
					if (taille.equals(t.taille) && couleur.equals(t.couleur.toUpperCase())) {
						dispo = true;
						System.out.println(t.toString());
					}
				}
			}
		}
		return dispo;
	}

	/**
	 * Methode pour passer une Commande demande au client de choisir une Collection
	 * dans laquelle shopper puis de choisir une catégorie de vetements puis de
	 * choisir une taille pour l'Article à commander propose au client de choisir
	 * une couleur à appliquer en filtre sur les articles (facultatif) affichage les
	 * articles correspondant aux critères sélectionnés ajoute l'Article selectionné
	 * au Panier propose au client de voir son Panier (facultatif) met à jour le
	 * Panier enregistre le Client avec les données correspondantes definit le mode
	 * de livraison selon le choix du Client procède au paiement crée et affiche le
	 * recu de la commande met à jour le stock et vide le panier apres commande
	 * 
	 * @param femmeCo   Collection FemmeCo avec les Articles pour femme
	 * @param hommeCo   Collection HommeCo avec les Articles pour homme
	 * @param stock     Stock de la boutique shop
	 * @param boutiques Liste des Boutiques dans lesquelles la commande peut etre
	 *                  passée
	 */
	public void passerCommande(FemmeCo femmeCo, HommeCo hommeCo, Stock stock, List<Boutique> boutiques) {
		Panier panier = new Panier();
		String rep = "";
		Scanner scanner = null;
		String genre = "";
		
		//permet de mémoriser la catégorie choisie par le client
		String categ = "";
		
		//permet de mémoriser la taille choisie par le client
		String taille = "";
		
		//permet de mémoriser la couleur choisie par le client
		String couleur = " ";
		String livraison = "";
		double prixliv = 0.0;
		
		// vrai si l'article sélectionné par le client est disponible
		boolean dispo = false;
		
		// vrai si la référence donnée par le client existe dans la collection
		boolean trouve = false;
		
		// vrai si la référence de l'article à supprimer du panier est valide

		Boolean supprime = false;
		
		 //vrai si l'article que le client veut supprimer de son panier existe dans le panier
		boolean existe = false;
		while (true) {
			if (panier.getNbArticle() >= 1) {
				// Consultation du panier
				System.out.println("Voulez vous voir votre panier? O/N");
				rep = scanner.next();
				if (rep.equals("N")) {
					System.out.println("Voulez vous continuer votre Shopping? O/N");
					rep = scanner.next();
					if ("N".equals(rep.toUpperCase())) {
						System.out.println("Nous souhaitons vous revoir bientôt dans notre boutique.");
						break;
					}
				} else if (rep.toUpperCase().equals("O")) {
					panier.affichePanier();
					if (panier.getNbArticle() > 0) {
						System.out.println("Voulez vous conserver tous les articles? O/N");
						rep = scanner.next();
						// mise à jour du panier
						if (rep.toUpperCase().equals("N")) {
							while (true) {
								System.out.println("Donner la référence de l'article que vous souhaiter supprimer");
								rep = scanner.next().toUpperCase();
								// Vérifier que l'article en cours de suppression se trouve dans le panier pour
								// ne pas avoir un total négatif
								existe = false;
								for (Article a : panier.getPanier()) {
									if (a.getReference().toUpperCase().equals(rep)) {
										existe = true;
										break;
									}
								}
								if (existe == false) {
									System.out.println("Cet article ne se trouve pas dans voter panier.");
									continue;
								}
								supprime = panier.supprArticle(rep, genre, femmeCo, hommeCo);
								if (supprime) {
									panier.affichePanier();
									if (panier.getNbArticle() == 0)
										break;
									System.out.println("Voulez vous conserver tous les articles? O/N");
									rep = scanner.next();
									if (rep.equals("O")) {
										break;
									}
								}

							}
						}

						if (panier.getNbArticle() > 0) {
							System.out.println("Voulez vous procéder au paiement? O/N");
							rep = scanner.next();
							if (rep.toUpperCase().equals("N")) {
								System.out.println("Voulez vous continuer votre Shopping? O/N");
								rep = scanner.next();
								if ("O".equals(rep.toUpperCase()))
									continue;
								else {
									System.out.println("Nous souhaitons vous revoir bientôt dans notre boutique");
									break;
								}
							}

							else {
								// Enregistrer le client
								Client client = new Client();
								client.creerClient(client, scanner, rep);
								System.out.println(client.toString());

								// Demander le moyen de livraison
								System.out.println(
										"Choisir votre moyen de livraison :  En boutique \"B\" , A domicile \"D\"");
								rep = scanner.next();
								if ("B".equals(rep.toUpperCase())) {
									prixliv = 0.95;
									for (Boutique b : boutiques)
										System.out.println(b.toString());
									while (livraison == "") {
										System.out.println("Donner le numéro de la boutique souhaitée");
										rep = scanner.next();
										if (Integer.parseInt(rep) < boutiques.size()) {
											livraison = boutiques.get(Integer.parseInt(rep) - 1).toString();
										} else {
											System.out.println("Boutique introuvable. Veuillez rééssayer.\n");
										}
									}
								} else {
									livraison = client.getAdresse();
									prixliv = 3.95;
								}
								System.out.println("Livraison à :" + livraison + "\n");
								// Creation et affichage du recu
								Recu recu = new Recu();
								double prixt = panier.getPrix() + prixliv;
								recu.creerRecu(client.getNom(), client.getPrenom(), client.getAdresse(),
										client.getEmail(), panier, livraison, panier.getPrix(), prixliv, prixt,
										getNumCommande());
								try {
									recu.afficherRecu();
								} catch (IOException e) {
									e.printStackTrace();
								}
								System.out.println("Merci pour votre commande.");
								// mise à jour du stock et du panier apres commande
								stock.decrementeStock(panier);
								incrCommande();
								panier.videPanier();
								panier.setPrix();
								prixliv = 0;
								System.out.println("Voulez vous passer une nouvelle commande?");
								rep = scanner.next();
								if ("O".equals(rep.toUpperCase())) {
									continue;
								} else {
									System.out.println("Au revoir " + client.getPrenom() + ".");
									break;
								}
							}
						}
					}
					System.out.println("Voulez vous continuer votre Shopping? O/N");
					rep = scanner.next();
					if ("N".equals(rep.toUpperCase())) {
						break;
					}
				}
			}

			// Choisir une collection Femme ou Homme
			System.out.println("Quelle collection voulez-vous shopper ?");
			System.out.println("Homme : H     Femme : F");
			scanner = new Scanner(System.in);
			genre = scanner.nextLine();
			while (!("F".equals(genre.toUpperCase()) || "H".equals(genre.toUpperCase()))) {
				System.out.println("Quelle collection voulez-vous shopper ?");
				System.out.println("Homme : H     Femme : F");
				scanner = new Scanner(System.in);
				genre = scanner.nextLine();
			}
			// Choisir une catégorie de vêtement
			if ("F".equals(genre.toUpperCase())) {
				System.out.println("Choisissez une catégorie");
				System.out.println("Tshirt - Chemise - Pull - Robe - Pantalon - Jean - Sac ");
				categ = scanner.next();
				while (!(categ.toUpperCase().equals("TSHIRT") || categ.toUpperCase().equals("CHEMISE")
						|| categ.toUpperCase().equals("PULL") || categ.toUpperCase().equals("ROBE")
						|| categ.toUpperCase().equals("PANTALON") || categ.toUpperCase().equals("JEAN")
						|| categ.toUpperCase().equals("SAC"))) {
					System.out.println("Choisissez une catégorie");
					System.out.println("Tshirt - Chemise - Pull - Robe - Pantalon - Jean - Sac ");
					categ = scanner.next();
				}
			} else {
				System.out.println("Choisissez une catégorie");
				System.out.println("Tshirt - Chemise - Pull - Pantalon - Jean");
				categ = scanner.next();
				while (!(categ.toUpperCase().equals("TSHIRT") || categ.toUpperCase().equals("CHEMISE")
						|| categ.toUpperCase().equals("PULL") || categ.toUpperCase().equals("PANTALON")
						|| categ.toUpperCase().equals("JEAN"))) {
					System.out.println("Choisissez une catégorie");
					System.out.println("Tshirt - Chemise - Pull - Pantalon - Jean ");
					categ = scanner.next();
				}
			}
			// Choisir une taille
			System.out.println("Choisissez une taille. Haut : S-M-L-XL-XXL  Bas : T34-T36-T38-T40-T42-T44-t46-T48\n");
			taille = scanner.next().toUpperCase();
			// Choisir une couleur
			// remettre la couleur à la chaine vide après l'affichage pour la prochaine
			// itération
			couleur = " ";
			System.out.println("Voulez vous choisir une couleur? O/N");
			rep = scanner.next();
			if ("O".equals(rep.toUpperCase())) {
				System.out.println("Donner la couleur souhaitée- Rouge/Bleu/Noir/Vert/Gris/Beige/A_Motifs");
				couleur = scanner.next().toUpperCase();
			} else
				System.out.println("Aucun filtre sur la couleur n'est appliqué\n");

			// Affichage des articles correspondant aux critères sélectionnés
			// Remettre la disponiblité à false pour la recherche d'articles
			dispo = false;
			if ("F".equals(genre.toUpperCase())) {

				if ("ROBE".equals(categ.toUpperCase())) {
					for (Robe t : femmeCo.getRobes().values()) {
						if (" ".equals(couleur)) {
							if (taille.equals(t.taille)) {
								dispo = true;
								System.out.println(t.toString());
							}
						} else {
							if (taille.equals(t.taille) && couleur.equals(t.couleur.toUpperCase())) {
								dispo = true;
								System.out.println(t.toString());
							}
						}
					}
				}
				if (categ.toUpperCase().equals("SAC")) {
					for (Sac s : femmeCo.getSacs().values()) {
						if (" ".equals(couleur)) {
							System.out.println(s.toString());
							if (femmeCo.getSacs().size() > 0)
								dispo = true;
						} else {
							if (couleur.equals(s.couleur.toUpperCase())) {
								dispo = true;
								System.out.println(s.toString());
							}
						}
					}

				}
				dispo = afficheCategorie(femmeCo, categ, taille, couleur, dispo);
			}
			if ("H".equals(genre.toUpperCase())) {
				dispo = afficheCategorie(hommeCo, categ, taille, couleur, dispo);
			}
			if (dispo == false) {
				System.out.println("Aucun article trouvé.\n");
				System.out.println("Voulez vous continuer votre Shopping? O/N");
				rep = scanner.next();
				if ("O".equals(rep.toUpperCase()))
					continue;
				else {
					if (panier.getNbArticle() >= 1) {
						continue;
					} else {
						System.out.println("Nous souhaitons vous revoir bientôt dans notre boutique");
						break;
					}
				}
			}

			System.out.println("Donner la référence de l'article à ajouter\n Entrez N sinon.");
			rep = scanner.next().toUpperCase();
			if (rep.toUpperCase().equals("N")) {
				System.out.println("Voulez vous continuer votre Shopping? O/N");
				rep = scanner.next();
				if ("O".equals(rep.toUpperCase()))
					continue;
				else {
					if (panier.getNbArticle() >= 1) {
						continue;
					} else {
						System.out.println("Nous souhaitons vous revoir bientôt dans notre boutique");
						break;
					}
				}
			}

			else {
				// Vérifie que la référence existe

				if ("F".equals(genre.toUpperCase())) {
					trouve = false;
					for (String r : femmeCo.getFemmeCo().keySet()) {
						if (r.equals(rep)) {
							trouve = true;
							break;
						}

					}
					if (trouve == false) {
						System.out.println("La référence n'existe pas.Veuillez choisir un article existant.");
						continue;
					}

				}
				if ("H".equals(genre.toUpperCase())) {
					trouve = false;
					for (String r : hommeCo.getHommeCo().keySet()) {
						if (r.equals(rep)) {
							trouve = true;
							break;
						}

					}
					if (trouve == false) {
						System.out.println("La référence n'existe pas.Veuillez choisir un article existant.");
						continue;
					}

				}
				// Vérifier que l'article n'est pas en rupture de stock
				if ("F".equals(genre.toUpperCase())) {
					if (femmeCo.getFemmeCo().get(rep).getStock() == 0) {
						System.out.println(
								"L'article choisi est en rupture de stock. Il sera bientôt de retour.\n Veuillez sélectionner un autre article\n");
						continue;
					}

				}

				if ("H".equals(genre.toUpperCase())) {
					if (hommeCo.getHommeCo().get(rep).getStock() == 0) {
						System.out.println(
								"L'article choisi est en rupture de stock. Il sera bientôt de retour.\n Veuillez sélectionner un autre article\n");
						continue;
					}
				}
				// Ajouter l'article au panier
				panier.ajoutArticle(rep, genre, femmeCo, hommeCo);
				continue;
			}

		}
		scanner.close();
	}

	public String toString() {
		return "Commande : numCommande=" + numCommande;
	}

}