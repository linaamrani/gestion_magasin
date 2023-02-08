package shop;

import java.util.Scanner;
/**
 * Un objet Client est une personne qui va effectuer une commande sur le shop
 * à travers la plateforme de commande en ligne qui est la console
 * @author Lina Amrani & Farah Ellouze 
 *
 */
public class Client {

	private String nom;
	private String prenom;
	private String adresse;
	private String email;

	public Client() {

	}
	
	/**
	 * Methode constructeur qui fabrique l'objet Client en mémoire 
	 * @param nom Nom du client
	 * @param prenom Prenom du client
	 * @param adresse Adresse du client
	 * @param email Email du client
	 */
	public Client(String nom, String prenom, String adresse, String email) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.email = email;

	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * Methode qui permet de Creer un Client en récuperant ses informations 
	 * personnelles qu'il va entrer lorsqu'elles lui seront demandées
	 * @param client Objet Client qui va etre initialisé avec les données entrées
	 * @param scanner Scanner qui recupère les données entrées 
	 * @param rep Variable dans laquelle est stockée la donnée entrée 
	 */
	public void creerClient(Client client, Scanner scanner, String rep) {
		System.out.println("Donner votre nom");
		rep = scanner.next();
		client.setNom(rep);
		System.out.println("Donner votre prénom");
		rep = scanner.next();
		client.setPrenom(rep);
		System.out.println("Donner votre Adresse");
		rep = scanner.nextLine();
		rep = scanner.nextLine();
		client.setAdresse(rep);
		System.out.println("Donner votre Email");
		rep = scanner.next();
		client.setEmail(rep);
	}

	public String toString() {
		return "Coordonnées client : \n nom: " + nom + ", prenom: " + prenom + ", adresse: " + adresse + ", email: "
				+ email;
	}

}
