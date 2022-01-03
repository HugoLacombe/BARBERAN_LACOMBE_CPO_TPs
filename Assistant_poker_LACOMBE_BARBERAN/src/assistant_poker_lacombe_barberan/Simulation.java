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
            String sym = "Trefle";

            Pioche.add (new Carte(sym, k));
            k += 1;

        }
        k = 2;
        for (int j = 39;
                j
                < 52; j++) {
            String sym = "Carreau";

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
        double mejor = 0.0;
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
                               
                               // System.out.println("Le meilleur score atteint : " + mejor);
                                mejor = combi_C.Score();

                            }

                        }
                    }
                }
            }

        }
        //System.out.println(cpt);
        return mejor;
    }
    
    public Carte carteduJoueur1(){
        int indice1=0;
       
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Saissisez la couleur de votre première carte : ");
        String Couleurc1= sc.nextLine();
        System.out.println("Saissisez le rang de votre première carte : ");
        int Rangc1 = sc.nextInt();
        
        
        for(int i = 0 ; i<Pioche.size();i++){
            if(Couleurc1 == Pioche.get(i).Couleur && Rangc1 == Pioche.get(i).Rang){
                indice1=i; 
            }
            
            
        }
        Carte Carte1 = new Carte(Couleurc1,Rangc1) ;

       
 
        Pioche.remove(indice1); 
        return Carte1;
    }

     
    public void AvantFlop() {
        Vict = 0.0;
        Egal = 0.0;
        Def = 0.0;
        double cpt=0.00;
        ArrayList<Carte> combic_ad = new ArrayList<Carte>();
        ArrayList<Carte> combic_jo = new ArrayList<Carte>();
        
        for(int i=0; i<7;i++){
            combic_ad.add(null); 
            combic_jo.add(null);
        }
         Carte Carte1J = new Carte(null,0);
         Carte1J=  carteduJoueur1();
         Carte Carte2J = new Carte(null,0); 
         Carte2J = carteduJoueur1();
         combic_jo.set(0,Carte1J);
         combic_jo.set(1,Carte2J);
         
         
        for (int i = 0; i < 50; i++) {

            for (int j = i+1; j < 50; j++) {

                for (int k = 0; k < 50; k++) {

                    for (int l = k + 1; l < 50; l++) {

                        for (int m = l + 1; m < 50; m++) {
                        
                            for (int n = m + 1; n < 50; n++) {
                                
                                for (int o = n + 1; o < 50; o++) {
                                    
                                    combic_ad.set(0,Pioche.get(i));
                                    combic_ad.set(1,Pioche.get(j));
                                    combic_ad.set(2,Pioche.get(k));
                                    combic_ad.set(3,Pioche.get(l));
                                    combic_ad.set(4,Pioche.get(m));
                                    combic_ad.set(5,Pioche.get(n));
                                    combic_ad.set(6,Pioche.get(o));
                                    
                                    combic_jo.set(2,Pioche.get(k));
                                    combic_jo.set(3,Pioche.get(l));
                                    combic_jo.set(4,Pioche.get(m));
                                    combic_jo.set(5,Pioche.get(n));
                                    combic_jo.set(6,Pioche.get(o));
                                    
                                    double scorec_jo=parmi7(combic_jo); 
                                    double scorec_ad=parmi7(combic_ad);
                                    
                                    if(scorec_jo>scorec_ad){
                                        Vict+=1.0; 
                                    }
                                    if(scorec_jo<scorec_ad){
                                        Def+=1.0;
                                    }
                                    if(scorec_jo==scorec_ad){
                                        Egal+=1.0; 
                                    }
                                    cpt+=1.0;
                                    System.out.println(cpt);
                                }

                            }
                        }
                    }
                }
            }
        }
        Vict=(Vict/cpt)*100;
        Egal=(Egal/cpt)*100; 
        Def=(Def/cpt)*100; 
        
        
    }

}
