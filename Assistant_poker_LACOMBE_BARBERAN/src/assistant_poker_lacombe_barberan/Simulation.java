/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assistant_poker_lacombe_barberan;

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
}
