package bin;
import bin.SimpleUser;

import java.util.LinkedList;
import java.util.Scanner;

//solde+liste des oprations
//specificite: on a construit la fct createAccount non pas pour chaque utilisateur mais une fct globale
public class Account {
	public double solde;
	public LinkedList<Operation> listeOperation = new LinkedList<Operation>();

	public static Scanner scN = new Scanner(System.in);
	public static Scanner scS = new Scanner(System.in);
	
	public Account(double solde) {
		this.solde = solde;
	}

	//Creation du Compte
	//creer un compte a un utilisateur
	public static Account createAccount() {
		System.out.println("Entrez votre solde : ");
		double solde = scN.nextDouble();
		System.out.println("votre compte a été créé avec succès");
		return new Account(solde);
	}
	
	//Consultation du solde
	public void viewBalance(){
		System.out.println("Votre solde est : " + solde);
	}
	
	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	//Ajout d'un  nouveau Paiment
	public void addPayment() {
		System.out.println("Veuillez chosir votre paiment : ");
		System.out.println("Pour payer la facture d'internet (200 DH) entrez 1");
		System.out.println("Pour payer la facture de l'électricité (400 DH) entrez 2");
		int typeOfOperation = scN.nextInt();
		switch(typeOfOperation) {
		case 1 :
			if(solde >= 200) {
				listeOperation.add(Operation.operation1());
				setSolde(solde - 200);
				System.out.printf("Paiment effectué avec Succes, ");
				viewBalance();
			}
			else
				System.out.println("Votre solde est insuffisant");
			break;
		case 2 :
			if(solde >= 400) {
				listeOperation.add(Operation.operation2());
				setSolde(solde - 400);
				System.out.printf("Paiment effectué avec Succes, ");
				viewBalance();
			}
			else
				System.out.println("Votre solde est insuffisant");
				break;
		default : 
			System.out.println("bye bye");
			break;
	}
}
	
	//Consultation des operations de paiement réalisées
	public void viewPaiment() {
		for(Operation op : listeOperation)
			System.out.println(op);
	}
	
	public static void addUser(SimpleUser[] tabUser) {
		for(int i=0; i<tabUser.length; i++) {
			if(tabUser[i] == null) {
		SimpleUser.tabUser[i] = new SimpleUser().createUser();
			break;
			}
		}
	}
	
	public static void deleteUser(SimpleUser[] tabUser) {
		System.out.println("Entrez l'ID du compte que vous voulez supprimer : ");
		int id = scN.nextInt();
		for(int i=0; i<tabUser.length; i++) {
			  if(tabUser[i] != null)
				  	if(tabUser[i].getId() == id) {
						  if(tabUser[i].getProfil().equals("admin"))
							  System.out.println("Vous n'avez pas le droit de supprimer un compte d'administrateur");
						  else
						  {
							tabUser[i].setCompte(null);
							tabUser[i] = null;
						  	System.out.println("Compte supprimez avec Succes");
						  	break;
						  }
				  }	
		}
	}
	
	public static void AffichTabUser(SimpleUser[] tabUser) {
		for(int i=0; i<tabUser.length; i++) {
			if(tabUser[i] != null)
			System.out.println(tabUser[i]);
	}
	}
}

