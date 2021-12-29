/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assistant_poker_lacombe_barberan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author 33695
 */
public class Simulation {

    double Vict;
    double Def;
    double Egal;

    ArrayList<Carte> Pioche = new ArrayList<Carte>();

    public void InitPioche() {
        int k = 2;
        for (int j = 0; j < 13; j++) {
            String sym = "Coeur";

            Pioche.add(new Carte(sym, k)); 
            k += 1;
        }

        k = 2;

        for (int j = 13; j < 26; j++) {
            String sym = "Pique";

            Pioche.add(new Carte(sym, k));
            k += 1;

        }

        k = 2;
        for (int j = 26;
                j < 39; j++) {
            String sym = "Trèfle";

            Pioche.add (new Carte(sym, k));
            k += 1;

        }
        k = 2;
        for (int j = 39;
                j
                < 52; j++) {
            String sym = "Carreaux";

            Pioche.add(new Carte(sym, k));
            k += 1;

        }
    }

    public double parmi7(ArrayList<Carte> tab) {
        ArrayList<Carte> tab1 = new ArrayList<Carte>();

        tab1.add(null);
        tab1.add(null);
        tab1.add(null);
        tab1.add(null);
        tab1.add(null);
        Combinaison combi_C = new Combinaison(tab1);
        // faut modifier ça doit un truc de combinaionson
        double mejor = 0;
        int cpt = 0;
        for (int i = 0; i < 7; i++) {

            for (int j = i + 1; j < 7; j++) {

                for (int k = j + 1; k < 7; k++) {

                    for (int l = k + 1; l < 7; l++) {

                        for (int m = l + 1; m < 7; m++) {

                            combi_C.tab.set(0, tab.get(i));
                            combi_C.tab.set(1, tab.get(j));
                            combi_C.tab.set(2, tab.get(k));
                            combi_C.tab.set(3, tab.get(l));
                            combi_C.tab.set(4, tab.get(m));
                            Collections.sort(combi_C.tab);
                            cpt += 1;
                            if (mejor < combi_C.Score()) {
                                for (int z = 0; z < combi_C.tab.size(); z++) {
                                    System.out.println(combi_C.tab.get(z));
                                }
                                System.out.println("Le meilleur score atteint : " + mejor);
                                mejor = combi_C.Score();

                            }

                        }
                    }
                }
            }

        }
        System.out.println(cpt);
        return mejor;
    }
    
    public void carteduJoeur(){
        int indice1=0;
        int indice2=0; 
        
        Scanner sc = new Scanner(System.in);
          Scanner sc2 = new Scanner(System.in);
        System.out.println("Saissisez la couleur de votre première carte : ");
        String Couleurc1= sc.nextLine();
        System.out.println("Saissisez le rang de votre première carte : ");
        int Rangc1 = sc.nextInt();
        
        System.out.println("Saissisez la couleur de votre deuxième carte : ");
         String Couleurc2= sc2.nextLine();
          System.out.println("Saissisez le rang de votre deuxième carte : ");
         int Rangc2 = sc2.nextInt();
        for(int i = 0 ; i<52;i++){
            if(Couleurc1 == Pioche.get(i).Couleur && Rangc1 == Pioche.get(i).Rang){
                indice1=i; 
            }
            if(Couleurc2 == Pioche.get(i).Couleur && Rangc2 == Pioche.get(i).Rang){
                indice2=i; 
            }
            
        }
        Carte Carte1 = new Carte(Couleurc1,Rangc1) ;
        Carte Carte2 = new Carte(Couleurc2,  Rangc2); 
       
        Pioche.remove(indice2); 
        Pioche.remove(indice1); 
        return Carte 1 ;  Carte2 ; 
    }

    public void AvantFlop(ArrayList<Carte> cartes_j) {
        Vict = 0.0;
        Egal = 0.0;
        Def = 0.0;
        for (int i = 0; i < 7; i++) {

            for (int j = i+1; j < 52; j++) {

                for (int k = 0; k < 52; k++) {

                    for (int l = k + 1; l < 52; l++) {

                        for (int m = l + 1; m < 52; m++) {
                        
                            for (int n = m + 1; n < 52; n++) {
                                
                                for (int o = n + 1; o < 52; o++) {

                                }

                            }
                        }
                    }
                }
            }
        }

    }

}
