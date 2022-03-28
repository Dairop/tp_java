import java.util.Comparator; 

public class TriParDensite implements Comparator<Region> {

        public TriParDensite(){}
        
        public int compare (Region R1, Region R2){

            return Long.signum((long) (R1.getSuperficie()/R1.getPOP() - R2.getPIB()/R2.getPOP()));
        }
}   