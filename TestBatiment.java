public class TestBatiment {
    public static void main(String[] args){
        System.out.println("\n\n\n\n");
        Batiment B = new Batiment("Adresse du Batiment", 54);
        Maison M = new Maison(3, 84, "18 place des maisons", 42);
        Immeuble I = new Immeuble(16, "387 avenue des immeubles", 78);
        Quartier Q = new Quartier();


        /*
        System.out.println(B.toString());
        System.out.println(M.toString());
        System.out.println(I.toString());
        */

        //créer le tableau
        Batiment[] tabBat = new Batiment[3];
        for (int i = 0; i < tabBat.length; i++){
            Batiment B2 = new Batiment("Adresse du Batiment", 54);
            tabBat[i] = B2;
        }

        
        //afficher tableau
        /*
        for (int i = 0; i < tabBat.length; i++){
            System.out.println(tabBat[i].toString());
        }*/



        Q.ajoutBatiment(new Batiment("387 avenue des immeubles", 68)); 
        Q.ajoutBatiment(new Batiment("Adresse du Batiment", 54));

        Q.afficherBatiments();


        System.out.println("\n"+Q.plusGrandBatiments().toString());

    }


}
