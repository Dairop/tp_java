import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Calculatrice {
    

    public double saisieNombre(){
        while(true){
            try {
                System.out.println("Saisissez une valeur");
                double n = Test.Sn.nextDouble();
                return n;
            } catch (java.util.InputMismatchException ex) {
                System.out.println("Erreur de saisie");
                Test.Sn.nextLine();
            }
        }
    }

    public double lancementCalcul() throws IOException{
        double v1 = saisieNombre();
        String op = saisieOperation();
        double v2 = saisieNombre();

        FileWriter w = new FileWriter("log.txt", true);

        System.out.println(v1 + op + v2);
        switch(op){
            case "+": 
                w.write("\r"+v1+"+"+v2+"="+(v1+v2));
                w.close();
                return v1+v2; 

            case "-": 
                w.write("\r"+v1+"-"+v2+"="+(v1-v2));
                w.close();
                return v1-v2; 

            case "*": 
                w.write("\r"+v1+"*"+v2+"="+(v1*v2));
                w.close();
                return v1*v2; 

            case "/": 
                w.write("\r"+v1+"/"+v2+"="+(v1/v2));
                w.close();
                return v1/v2; 
        }

        return 0;

    }






    public String saisieOperation(){
        System.out.println("Saisissez une opération");
        String[] operateurs = {"+","-","*","/"};

        while(true){
            try {
                String op = Test.Sn.next();
                for (int i = 0; i < operateurs.length; i++){
                    if (op.equals(operateurs[i])){
                        return op;
                    }
                }
                
                throw new OperationException("L'opération n'est pas valide");

            } catch (Exception E) {
                    System.out.println(E.getMessage());
            }

            System.out.println("Saisissez une opération");
        }
    }
}
