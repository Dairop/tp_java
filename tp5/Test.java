import java.io.IOException;
import java.util.Scanner;


public class Test {
    static Scanner Sn = new Scanner(System.in);

    public static void main(String[] args) throws IOException{
        Calculatrice C = new Calculatrice();

        System.out.println("Le résultat est " + C.lancementCalcul());

        Sn.close();
    }
}
