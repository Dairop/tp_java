package Test;
import program.Annuaire;
import program.Client;

public class Test2 {
	public static void main(String[] args) {
	
		Client C1 = new Client("Dorian");
		Client C2 = new Client("Dorian");

		Annuaire A = new Annuaire();
		A.addClient(C1);

		System.out.println(A.contient(C2));
		System.out.println(C1.equals(C2));


	}
}
