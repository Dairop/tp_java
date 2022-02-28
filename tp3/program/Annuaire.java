package program;
import java.util.ArrayList;


public class Annuaire {
    private ArrayList <Client> clients;

    public Annuaire() {
        this.clients = new ArrayList<Client>();
    }

    public ArrayList<Client> getClients() {
        return this.clients;
    }

    public void addClient(Client C) {
        this.clients.add(C);
    }

    public Client getClient (int index) {
        return this.clients.get(index);
    }

    public int getNbClients(){
        return this.clients.size();
    }

    public Client getClientByID(int id){
        for (int i = 0; i < getNbClients(); i++){
            if (this.clients.get(i).getNumeroClient() == id){
                return this.clients.get(i);
            }
        }
        return null;
    }


    public void remClientByID(int idClient){
        for (int i = 0; i < getNbClients(); i++){
            if (this.clients.get(i).getNumeroClient() == idClient){
                this.clients.remove(i);
                return;
            }
        }
    }

    
    public void creditClientByID(int idClient, double cred){
        for (int i = 0; i < getNbClients(); i++){
            if (this.clients.get(i).getNumeroClient() == idClient){
                this.clients.get(i).addSolde(cred);
                return;
            }
        }
    }

    public boolean contient(Client C){
        for (int i = 0; i < getNbClients(); i++){
            if (this.clients.get(i).toString() == C.toString()){
                return true;
            }
        }

        return false;
    }


    public String toString() {
        return "{" +
            " clients='" + getClients() + "'" +
            "}";
    }
	
}
