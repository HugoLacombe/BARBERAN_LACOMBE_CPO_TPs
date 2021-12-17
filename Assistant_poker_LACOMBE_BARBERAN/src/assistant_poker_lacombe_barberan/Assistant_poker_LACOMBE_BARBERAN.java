/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assistant_poker_lacombe_barberan;

import java.util.ArrayList;

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

        Carte Pioche[] = new Carte[52];

        int k = 2;
        for (int j = 0; j <13; j++) {
            String sym = "Coeur";

            Pioche[j] = new Carte(sym, k);
            k += 1;

        }
        k=2;
        for (int j = 13; j < 26; j++) {
            String sym = "Pique";

            Pioche[j] = new Carte(sym, k);
            k+=1;

        }

        k=2;
        for (int j = 26; j <  39; j++) {
            String sym = "Trèfle";

            Pioche[j] = new Carte(sym, k);
            k+= 1;

        }
        k=2;
        for (int j =39; j <52; j++) {
            String sym = "Carreaux";

            Pioche[j] = new Carte(sym, k);
            k += 1;

        }
        System.out.println(Pioche[25]);
        
        
        Carte combiC[] = new Carte[7];
        ArrayList<Carte[]> liste_combi = new ArrayList<Carte[]>() ;
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


