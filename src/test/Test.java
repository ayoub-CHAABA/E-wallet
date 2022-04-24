package test;

import java.util.Scanner;
import bin.SimpleUser;
import bin.Account;
import bin.AdminUser;
import bin.Operation;
import bin.SimpleUser;

public class Test {
	public static void main(String[] args) {		
		Scanner scN = new Scanner(System.in);
		Scanner scS = new Scanner(System.in);
		
	//SimpleUser[] tabUser = new SimpleUser[100];
		
	//Creation des comptes
	Account compte_simo = new Account(500);
	Account compte_ayoub = new Account(1000);
	Account compte_ahmed = new Account(300);
	Account compte_farouk = new Account(10000);
		
	//Ajout d'Utlisateur au tableau des Utilisateurs
	SimpleUser.tabUser[0] = new SimpleUser("simo", 5555, "admin", compte_simo);
				
	SimpleUser.tabUser[1] = new SimpleUser("ayoub", 3333, "normal", compte_ayoub);
					
	SimpleUser.tabUser[2] = new SimpleUser("ahmed", 2222, "normal", compte_ahmed);
	
	SimpleUser.tabUser[3] = new SimpleUser("farouk", 109, "admin", compte_farouk);
		/*System.out.println(tabUser[0]);
		System.out.println(tabUser[1]);	
		System.out.println(tabUser[2]);	*/
		
		System.out.println("=====================================================================|");
		System.out.println("                        Bienvenu dans E-wallet");
		System.out.println("=====================================================================|");
		System.out.println("Pour se connecter entrez 1        ^^         Pour s'inscrire entrez 2");
		
		
		int choix = scN.nextInt();
		switch(choix) {
		case 1 :
			//Authentification
			System.out.printf("Login : ");
			String login = scS.nextLine();
			System.out.printf("Password : ");
			int password = scN.nextInt();
			//Parcour du tableau a la recherche d'utilisateur
			for(int i=0; i<SimpleUser.tabUser.length; i++) {
				if(SimpleUser.tabUser[i]!= null) {
					if(login.equals(SimpleUser.tabUser[i].getLogin())) { 
						if(password == SimpleUser.tabUser[i].getPassword()) {
								if(SimpleUser.tabUser[i].getProfil().equals("normal")) {
									System.out.println("Welcome again " + login + " you're a normal user");
									SimpleUser.viewAccount(SimpleUser.tabUser[i].getCompte());
									break;
								}
								else if(SimpleUser.tabUser[i].getProfil().equals("admin"))
									System.out.println("Welcome again " + login + " you're an admin user");
									AdminUser.viewAccount(SimpleUser.tabUser[i].getCompte());
									break;
						}	
						else
							System.out.println("Invalid Account");
							break;
					}
				}
				else {
					System.out.println("Invalid Account");
					break; 
				}
			}
			break;
		case 2 :
			// Creation d'un Utilisateurs
			SimpleUser z = new SimpleUser().createUser();
			// Ajout d'Utlisateur au tableau des Utilisateurs
			SimpleUser.tabUser[SimpleUser.cmp] = z;
			SimpleUser.viewAccount(z.getCompte());
			break;
		default :
			System.out.println("Can't do it");
			break;
			
		}

	}	
}


