/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assistant_poker_lacombe_barberan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author 33695
 */
public class Assistant_poker_LACOMBE_BARBERAN {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // TODO code application logic here
        Double result=0.0;
Carte carte1 = new Carte("Coeur",8); 
Carte carte2 = new Carte("Pique",8); 
Carte carte3 = new Carte("Pique",9); 
Carte carte4 = new Carte("Carreaux",2); 
Carte carte5 = new Carte("Tèfle",9);
ArrayList<Carte> tab =new ArrayList<Carte>();
tab.add(carte1); 
      tab.add( carte2);
      tab.add( carte3);
      tab.add( carte4);
      tab.add( carte5); 

Collections.sort(tab);
for(Carte carte : tab){
    //System.out.println(carte); 
    Combinaison Cobi = new Combinaison(tab);
   result=Cobi.DoublePaire();
} 

    System.out.println(result);
/*/
        for (int i = 0; i < 30; i++) {
            
            for (int j = 0; j < 30; j++) {
                 
                for (k = 0; k < 30; k++) {
                    
                    for (int l = 0; l < 30; l++) {
                         
                        for (m = 0; m < 30; m++) {
                           
                            for (int n = 0; n < 30; n++) {
                                 
                                for (p = 0; p < 30; p++) {
                                     
                                    if (i != j && j != k && k != l && l != m && m != n && n != p && i!=k && i!= l && i!=m && i!=n && i!=p && j!=l && j!= m && j!=n &&j!=p && l!=m && l!=n && l!=p && m!= p) {
                                        System.out.println("i="+i+" j= "+j+" k = " + k+" l = "+l+ " m = "+m + " n = "+ n+ " p = "+p);
                                        
                                        combiC[0] = Pioche[i];
                                        combiC[1] = Pioche[j];
                                        combiC[2] = Pioche[k];
                                        combiC[3] = Pioche[l];
                                        combiC[4] = Pioche[m];
                                        combiC[5] = Pioche[n];
                                        combiC[6] = Pioche[p];
                                        for(int c=0; c<liste_combi.size(); c++){
                                   
                                        liste_combi.add(combiC); 
 System.out.println(liste_combi.size());
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(liste_combi.size());
       
    }
        /*/ 


}
}


