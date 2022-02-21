package Test;

import program.Annuaire;
import program.Client;
import util.Saisie;

public class Test {

	public static void main(String[] args) {
	
		Annuaire annuaire = new Annuaire();	
		
		
		int rep =0; 
		while(rep!=-1){              
			System.out.println("1 ===>  Ajouter un nouveau client"); 
			System.out.println("2 ===>  Afficher la taille de l'annuaire"); 
			System.out.println("3 ===>  Afficher l'annuaire complet"); 
			System.out.println("4 ===>  Rechercher un client par son identifiant"); 
			System.out.println("5 ===>  Supprimer un client par son identifiant"); 
			System.out.println("6 ===>  Crediter le solde d'un client"); 
			System.out.println("7 ===>  Afficher le total des soldes des clients de l'annuaire"); 
			System.out.println("-1 ===>  Quitter"); 
			rep = Saisie.lireEntier("Votre choix ?"); 
			
			if(rep == 1){              
				String n = Saisie.lireString("	Nom du nouveau client: "); 
				Client C = new Client(n);
				annuaire.addClient(C);
				
			} else if (rep ==2){ 
				
				System.out.println("Nb of clients: "+annuaire.getNbClients());
		
			} else if (rep ==3){ 
				
				System.out.println(annuaire.toString());
				
			} else if (rep ==4){ 
				
				int id = Saisie.lireEntier("	Numero du client: "); 
				System.out.println(annuaire.getClientByID(id).toString());
				
			} else if (rep ==5){ 
				
				int id = Saisie.lireEntier("	Numero du client: "); 
				annuaire.remClientByID(id);
				
			} else if (rep ==6){ 
				
				int idClient = Saisie.lireEntier("	Numero du client: "); 
				double creditClient = Saisie.lireReel("	Credit a realiser: "); 
				annuaire.creditClientByID(idClient, creditClient);

				
			} else if (rep ==7){ 
				
				double total = 0;
				for (int c=0; c<annuaire.getNbClients(); c++){
					total += annuaire.getClients().get(c).getSolde();
				}
				System.out.println(total);

			}
		}
		
		
	}
}
