package shop;

import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/**
 * Un objet Recu est un fichier 
 * qui récapitule une commande en affichant les informations liées à celle-ci
 * @author Lina Amrani & Farah Ellouze
 */
public class Recu {
	private static int numRecu = 0;
	
	public Recu() {
		numRecu ++; 
	}
	
	public int getNumRecu() {
		return numRecu;
	}
	
	/**
	 * Génère un fichier texte (.txt) contenant le recu
	 * c'est-à-dire toutes les données relatives à la commande
	 * @param nom Nom du client
	 * @param prenom Prenom du client
	 * @param adresse Adresse du client 
	 * @param email Email du client 
	 * @param panier Panier contenant les articles commandés par le client
	 * @param modeliv Mode de livraison selectionné par le client
	 * @param prixp Prix du panier 
	 * @param prixl Prix de la livraison
	 * @param prixt Prix total = Prix du panier + Prix de la livraison
	 * @param commande Numéro de la commande 
	 */
	public void creerRecu(String nom, String prenom, String adresse, String email,Panier panier , String modeliv, double prixp, double prixl, double prixt, int commande) {
		PrintWriter writer;
		try {
			writer = new PrintWriter("recu"+ getNumRecu()+".txt","UTF-8");
			writer.println("\t\tNuméro de la commande" + commande+"\n");
			writer.println("Infos client : \n" + nom + " " + prenom + "\n" + adresse + "\n" + email);
			writer.println("----------------------------------------------");
			writer.println("Infos commande : \n" + "Livraison: "+ modeliv + "\nArticles commandés :");
			for (Article a : panier.getPanier()) {
				writer.println(a.toString());
			}
			writer.println("----------------------------------------------");
			writer.println("Prix de la commande : " + prixp + "€");
			writer.println("Prix de la livraison : " + prixl + "€");
			writer.println("TOTAL : " + prixt + "€");
			writer.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		
		
	}
	
	/**
	 * Affiche le recu dans la console à la fin d'une commande 
	 * pour que le client puisse voir le recu de sa commande 
	 * @throws IOException en cas d'erreur sur l'ouverture du fichier correspondant 
	 * au recu qui va etre affiché pour le client 
	 */
	public void afficherRecu() throws IOException{
		try {
			File recu = new File("recu"+ getNumRecu()+".txt");
			FileReader fileReader = new FileReader(recu);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			StringBuffer stringBuffer = new StringBuffer();
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				stringBuffer.append(line);      
		        stringBuffer.append("\n");
			}
			fileReader.close();
		    System.out.println("RECU: \n");
		    System.out.println(stringBuffer.toString());  
		}
		catch (IOException e){
			System.out.println("Le fichier n'a pas pu être ouvert");
			throw e;
		}
		
	}

	
	
}
