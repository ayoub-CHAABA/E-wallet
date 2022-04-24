package bin;

public class AdminUser extends SimpleUser{

	public AdminUser(String login, int password, String profil, Account compte) {
		super(login, password, profil, compte);
	}

	public static void viewAccount(Account cmt) {
		System.out.println("Les operations du comptes : ");
		System.out.println("1) Pour consulter votre solde entrez 1  \n2) Pour ajouter un nouveau paiment entrez 2  \n3) Pour afficher l'historique de vos paiment entrez 3");
		System.out.println("Les operations pour admin : ");
		System.out.println("1) Pour creer un utilsateur entrez 4  \n2) Pour supprimer un utilisateur entrez 5  \n3) Pour afficher tous les utilisateurs entrez 6  \n4) Pour sortir entrez 7");
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
			Account.addUser(tabUser);
			System.out.println("Pour retourner au menu principal entrez 1   ^^   Pour sortir entrez 2 : ");
			int fifthChoice = scN.nextInt();
			switch(fifthChoice) {
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
		case 5 :
			Account.deleteUser(tabUser);
			System.out.println("Pour retourner au menu principal entrez 1   ^^   Pour sortir entrez 2 : ");
			int sixthChoice = scN.nextInt();
			switch(sixthChoice) {
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
		case 6 :
			Account.AffichTabUser(tabUser);
			System.out.println("Pour retourner au menu principal entrez 1   ^^   Pour sortir entrez 2 : ");
			int seventhChoice = scN.nextInt();
			switch(seventhChoice) {
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
		case 7 :
			System.out.println("Thank you for using E-wallet");
			break;
		default : 
			System.out.println("Wrong button");
		}
	}
	
	
	public String toString() {
		return "AdminUser Login = " + getLogin() + " Password = " + getPassword();
	}	
}
