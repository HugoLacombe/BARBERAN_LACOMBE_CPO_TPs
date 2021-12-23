/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assistant_poker_lacombe_barberan;

import java.util.Arrays;

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

    public int parmi7(Carte tab[]){
        Carte []combi_C = new Carte[5];
        int mejor=0; 
         for (int i = 0; i < 5; i++) {
            
            for (int j = i+1; j < 5; j++) {
                 
                for (int k = j+1; k < 5; k++) {
                    
                    for (int l = k+1; l < 5; l++) {
                         
                        for (int m = l+1; m < 5; m++) {
                            
                           combi_C[0]=tab[i]; 
                           combi_C[1]=tab[j]; 
                           combi_C[2]=tab[k]; 
                           combi_C[3]=tab[l]; 
                           combi_C[4]=tab[m]; 
                           
                           //if(mejor<Score(combi_C)){
                           //mejorScore(combi_C)
                           
                        }
                    }
                }
            }
         }
         
        
        
    return 1 ; 
}
                    
static void débutPartie(){
    
}

 

}
