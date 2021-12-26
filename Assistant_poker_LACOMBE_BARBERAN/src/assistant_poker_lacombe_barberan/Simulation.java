/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assistant_poker_lacombe_barberan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author 33695
 */
public class Simulation {

    Carte Pioche[] = new Carte[52];
    
public void InitPioche(){
    int k = 2;
    for(int j=0; j <13;j++){
            String sym = "Coeur";

        Pioche[j] = new Carte(sym, k);
        k += 1;
}
    
    k  = 2;
    
    for (int j = 13;    j< 26; j ++) {
            String sym = "Pique";

        Pioche[j] = new Carte(sym, k);
        k += 1;

    }

    k  = 2;
    for (int j = 26;
    j<  39; j

    
        ++) {
            String sym = "Trèfle";

        Pioche[j] = new Carte(sym, k);
        k += 1;

    }
    k  = 2;
    for (int j = 39;
    j<
    52; j

    
        ++) {
            String sym = "Carreaux";

        Pioche[j] = new Carte(sym, k);
        k += 1;

    }
}

    public double parmi7(ArrayList<Carte> tab){
        ArrayList<Carte> tab1 = new ArrayList<Carte>();
        
      tab1.add(null); 
      tab1.add( null);
      tab1.add( null);
      tab1.add(null);
      tab1.add( null); 
      Combinaison combi_C = new Combinaison(tab1);
        // faut modifier ça doit un truc de combinaionson
        double mejor=0; 
        int cpt=0;
         for (int i = 0; i < 5; i++) {
            
            for (int j = 0; j < 5; j++) {
                 
                for (int k = 0; k < 5; k++) {
                    
                    for (int l = 0; l < 5; l++) {
                         
                        for (int m = l+1; m < 5; m++) {
                            System.out.println(cpt);
                         combi_C.tab.set(0, tab.get(i)); 
                             combi_C.tab.set(1, tab.get(j)); 
                              combi_C.tab.set(2, tab.get(k)); 
                               combi_C.tab.set(3, tab.get(l)); 
                                combi_C.tab.set(4, tab.get(m)); 
                        Collections.sort(combi_C.tab);
                           if(mejor<combi_C.Score()){
                               for(int z=0; z<combi_C.tab.size();z++ ){
                                   System.out.println(combi_C.tab.get(z));
                               }
                               System.out.println("Le meilleur score atteint : " + mejor);
                               mejor=combi_C.Score();
                           
                        }
                           cpt+=1;
                    }
                }
            }
         }
         
        
      
}
          return mejor; 
    }
                    
static void débutPartie(){
    
}

 

}
