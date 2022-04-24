package bin;

import java.util.LinkedList;
import java.util.Scanner;
	
public class SimpleUser {
	private int id;
	public static int cmp;
	private String login;
	private int password;
	private String profil;
	private Account compte;
	public static SimpleUser[] tabUser = new SimpleUser[100];
	
	 static Scanner scN = new Scanner(System.in); // scanner pour INTEGER
	 static Scanner scS = new Scanner(System.in); //scanner pour STRING
	
	public SimpleUser() {}
	
	public SimpleUser(String login, int password, String profil, Account compte) {
		this.id = cmp++;
		this.login = login;
		this.password = password;
		this.profil = profil;
		this.compte = compte;			
	}
		
	//Creation d'un Utilisateur(LOGIN+MDP+COMPTE+PROFIL)
	//TOUT COMPTE CREE EST NORMAL
	//un utilisateur a un compte est un compte a un solde
	public SimpleUser createUser() {
		int id = cmp;
		System.out.println("Veuillez saisir votre login : ");
		String login = scS.nextLine();
		System.out.println("Veuillez saisir votre password : ");
		int password = scN.nextInt();
		compte = Account.createAccount();
		profil = "normal";
		return new SimpleUser(login, password, profil, compte);
	}
	
	//Manipulation du compte
	public static void viewAccount(Account cmt) {
		System.out.println("1) Pour consulter votre solde entrez 1  \n2) Pour ajouter un nouveau paiment entrez 2  \n3) Pour afficher l'historique de vos paiment entrez 3  \n4) Pour sortir entrez 4");
		int choice = scN.nextInt();
		switch(choice) {
		case 1 :
			cmt.viewBalance();
			System.out.println("Pour retourner au menu principal entrez 1   ^^   Pour sortir entrez 2 : ");
			int secondChoice = scN.nextInt();
			switch(secondChoice) {
			case 1 :
				//loop
				viewAccount(cmt);
				break;
			case 2 :
				break;
			default :
				System.out.println("Oops, Misclick");
			}
			break;
		case 2 :
			cmt.addPayment();
			System.out.println("Pour retourner au menu principal entrez 1   ^^   Pour sortir entrez 2 : ");
			int thirdChoice = scN.nextInt();
			switch(thirdChoice) {
			case 1 :
				//Loop
				viewAccount(cmt);
				break;
			case 2 :
				break;
			default :
				System.out.println("Oops, Misclick");
			}
			break;
		case 3 :
			cmt.viewPaiment();
			System.out.println("Pour retourner au menu principal entrez 1   ^^   Pour sortir entrez 2 : ");
			int fourthChoice = scN.nextInt();
			switch(fourthChoice) {
			case 1 :
				//Loop
				viewAccount(cmt);
				break;
			case 2 :
				break;
			default :
				System.out.println("Oops, Misclick");
			}
			break;
		case 4 :
			System.out.println("Thank you for using E-wallet");
			break;
		default : 
			System.out.println("Wrong button");
		}
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	
	public String getProfil() {
		return profil;
	}

	public void setProfil(String profil) {
		this.profil = profil;
	}

	public Account getCompte() {
		return compte;
	}

	public void setCompte(Account compte) {
		this.compte = compte;
	}

	public String toString() {
		return "[id:" + id + ", login:" + login + ", password:" + password + ", profil:" + profil + "]";
	}
	
	
}
