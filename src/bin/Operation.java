package bin;

import java.util.LinkedList;

public class Operation {
	private int montant;
	private String description;
	
	public Operation() {
		
	}

	public Operation(int montant, String description) {
		this.montant = montant;
		this.description = description;
	}
	
	//Creation de la premiere Operation
	public static Operation operation1() {
		return new Operation(200, "paiment facture internet");
	}
	
	//Creation de la deuxieme Operation
	public static Operation operation2() {
		return new Operation(400, "paiment facture électricité");
	}

	public int getMontant() {
		return montant;
	}

	public void setMontant(int montant) {
		this.montant = montant;
	}

/*	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}*/

	@Override
	public String toString() {
		return "<< montant " + montant + "dh>> << " + description + " >>";
	}
	
	
	
}
