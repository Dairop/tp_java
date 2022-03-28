import java.util.ArrayList;
import java.util.Collections;


public class App {
    public static void main(String[] args) throws Exception {
        IOComparable IOC = new IOComparable();
        Region R1 = new Region("Soulaines", 1100, 1, 1, 200);
        Region R2 = new Region("Bruneï", 437483, 12, 8, 200);

        System.out.println(R1.toString());
        System.out.println(IOC.compareTo(R1, R2));

        IORegionTexte IOR = new IORegionTexte();
        ArrayList<Region> Arr = new ArrayList<Region>();
        Arr.add(R1); Arr.add(R2);
        //IOR.sauver("regions.csv", Arr);
        Arr = IOR.lire("regions.csv");
        System.out.println(Arr);
        
        TriParDensite tri1 = new TriParDensite();
        TriParPIBPOP tri2 = new TriParPIBPOP();

        Collections.sort(Arr, tri2);
        
        System.out.println("Qprès le tri: "+Arr.toString());
    }
}