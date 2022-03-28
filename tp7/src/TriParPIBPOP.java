import java.util.Comparator; 

public class TriParPIBPOP implements Comparator<Region> {

        public TriParPIBPOP(){}
        
        public int compare (Region R1, Region R2){
            return Long.signum((long) (R1.getPIB()/R1.getPOP() - R2.getPIB()/R2.getPOP()));
        }
}
