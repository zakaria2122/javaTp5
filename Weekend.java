import java.util.ArrayList;
import java.util.List;

public class  Weekend{
    private String dateDuWeekend;
    private List<Personne>  particiPersonne = new ArrayList<>();
    private List<Depense>  participeDepenses = new ArrayList<>();
    private Personne personne;

        public Weekend(String date){
                     this.dateDuWeekend = date;
                    
                }
        public void ajouteParticipant(String prenom, int age){

        }
        public void ajouteDepense(double monatnt, String produit, String prenom){
           


        }

        public double totalDepense(Personne personne){
            double res = 0;
            for(Depense depense : participeDepenses){
                
            }
                        return res;
        }

        public double totalDepense(){
        return 0;
        }
        public double totalDepense(String produit){
            int res =0;
            for(Depense depense :  participeDepenses){
                res += depense.getMonatnt();
            }
            return res;

        }

        public double avoirPersonne(Personne personne){
                    return 0;
            
        }
        public Personne getPersonne(String prenom){
        for( int i =0; i< particiPersonne.size(); i++ ){
        if(particiPersonne.get(i).getPrenom().equals(prenom)){
            return  particiPersonne.get(i);
        }
        } return null;
        }
        
        @Override
        public String toString() {
            return "Weekend [dateDuWeekend=" + dateDuWeekend + ", totalDepense()=" + totalDepense() + ", getClass()="
                    + getClass() + "]";
        }
        public String getDateDuWeekend() {
            return dateDuWeekend;
        }
        
}

