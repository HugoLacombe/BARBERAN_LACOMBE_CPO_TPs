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

    double Vict; // poucentage de chance de victoire du joueur
    double Def; // " " défaite " "
    double Egal; // " " égalité 

    ArrayList<Carte> Pioche = new ArrayList<Carte>();

    public void InitPioche() {
        // cette méthode permet de créer la pioche avec les 52 cartes 
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

            Pioche.add(new Carte(sym, k));
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
        // Cette fonction permet de faire toutes les combinaisons possibles 
        // de 5 cartes à partir de 7 
        // elle prend en argument un liste de 7 cartes et renvoie le score de la meilleure combinaisons de 5 cartes
        ArrayList<Carte> tab1 = new ArrayList<Carte>();
// initialisation d'une arraylist
        tab1.add(null);
        tab1.add(null);
        tab1.add(null);
        tab1.add(null);
        tab1.add(null);
        Combinaison combi_C = new Combinaison(tab1); // création d'une combinaison à partir de l'arrayList
        // faut modifier ça doit un truc de combinaionson
        double mejor = 0.0; // meilleur score courant 
        // 5 boucles qui permettent de générer les combinaisons 
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
                            Collections.sort(combi_C.tab); // on trie la liste
                           
                            // test pour savoir le score de la meilleure combinaison
                            if (mejor < combi_C.Score()) {

                               
                                mejor = combi_C.Score();

                            }

                        }
                    }
                }
            }

        }
        
        return mejor;
    }

    public Carte retirer_cartePioche(int Rang, String Couleur) { // crée une carte l'enleve de la pioche  
        int indice1 = 0;

        for (int i = 0; i < Pioche.size(); i++) {
            if (Couleur == Pioche.get(i).Couleur && Rang == Pioche.get(i).Rang) { // cherhche la carte qui correspond aux attributs données
                indice1 = i;
            }

        }
        Carte Carte1 = new Carte(Couleur, Rang);

        Pioche.remove(indice1); // retire la carte de la pioche
        return Carte1; // renvoie une nouvelle carte qui possède les m^mes attibuts la précédente
    }

    public void AvantFlop(int rg1, int rg2, String couleur1, String couleur2) { // simulation avant le flop
        Vict = 0.0;
        Egal = 0.0;
        Def = 0.0;
        double cpt = 0.00;
        ArrayList<Carte> combic_ad = new ArrayList<Carte>();
        ArrayList<Carte> combic_jo = new ArrayList<Carte>();

        for (int i = 0; i < 7; i++) {
            combic_ad.add(null);
            combic_jo.add(null);
        }
        Carte Carte1J = new Carte(null, 0);
        Carte1J = retirer_cartePioche(rg1, couleur1);
        Carte Carte2J = new Carte(null, 0);
        Carte2J = retirer_cartePioche(rg2, couleur2);
        combic_jo.set(0, Carte1J);
        combic_jo.set(1, Carte2J);
// on cherhce l'ensemble des combinaisons de 7 parmi 50 cartes soient 99 884 400 combinaisons 
        for (int i = 0; i < 50; i++) {

            for (int j = i + 1; j < 50; j++) {

                for (int k = 0; k < 50; k++) {

                    for (int l = k + 1; l < 50; l++) {

                        for (int m = l + 1; m < 50; m++) {

                            for (int n = m + 1; n < 50; n++) {

                                for (int o = n + 1; o < 50; o++) {
                                    
                                    // ici on utilisie les objets combic_ad et combic_jo pour leur affecter les différentes cartes pour faire les combinaisosns de 7 cartes
                                    combic_ad.set(0, Pioche.get(i));
                                    combic_ad.set(1, Pioche.get(j));
                                    combic_ad.set(2, Pioche.get(k));
                                    combic_ad.set(3, Pioche.get(l));
                                    combic_ad.set(4, Pioche.get(m));
                                    combic_ad.set(5, Pioche.get(n));
                                    combic_ad.set(6, Pioche.get(o));

                                    combic_jo.set(2, Pioche.get(k));
                                    combic_jo.set(3, Pioche.get(l));
                                    combic_jo.set(4, Pioche.get(m));
                                    combic_jo.set(5, Pioche.get(n));
                                    combic_jo.set(6, Pioche.get(o));
                                    
                                    
                                    //cherche parm la combinaison de 7 cartes la meilleur combinaison de 5 cartes 
                                    double scorec_jo = parmi7(combic_jo);
                                    double scorec_ad = parmi7(combic_ad); 

                                    if (scorec_jo > scorec_ad) { // compare les scores des deux meilleurs combinaisons 
                                        Vict += 1.0;
                                    }
                                    if (scorec_jo < scorec_ad) {
                                        Def += 1.0;
                                    }
                                    if (scorec_jo == scorec_ad) {
                                        Egal += 1.0;
                                    }
                                    cpt += 1.0;

                                }

                            }
                        }
                    }
                }
            }
        }
        Vict = (Vict / cpt) * 100; // modifie les attributs de la simulation 
        Egal = (Egal / cpt) * 100;
        Def = (Def / cpt) * 100;

    }

    public void AvantTurn(int rg1, int rg2, String couleur1, String couleur2, int rg3, int rg4, String couleur3, String couleur4, int rg5, String couleur5) {
     // Meme principe que AvantFlop, juste à ce stade nous connaissons 5 cartes, 3 cartes supplémentaires sur la table ainsi nous prenons leur rang et leur couleur en argument
        Vict = 0.0;
        Egal = 0.0;
        Def = 0.0;
        double cpt = 0.00;
        ArrayList<Carte> combic_ad = new ArrayList<Carte>();
        ArrayList<Carte> combic_jo = new ArrayList<Carte>();

        for (int i = 0; i < 7; i++) {
            combic_ad.add(null);
            combic_jo.add(null);
        }
        Carte Carte1T = new Carte(null, 0);
        Carte Carte2T = new Carte(null, 0);
        Carte Carte3T = new Carte(null, 0);
        // on retire les cartes connues de la pioche 
        Carte1T = retirer_cartePioche(rg3, couleur3);
        Carte2T = retirer_cartePioche(rg4, couleur4);
        Carte3T = retirer_cartePioche(rg5, couleur5);
        Carte Carte1J = new Carte(null, 0);
        Carte1J = retirer_cartePioche(rg1, couleur1);
        Carte Carte2J = new Carte(null, 0);
        Carte2J = retirer_cartePioche(rg2, couleur2);
        // on connait déjà les 3 cartes sur la table et les cartes du joueurs !
        combic_jo.set(0, Carte1J);
        combic_jo.set(1, Carte2J);
        combic_jo.set(2, Carte1T);
        combic_jo.set(3, Carte2T);
        combic_jo.set(4, Carte3T);

        combic_ad.set(2, Carte1T);
        combic_ad.set(3, Carte2T);
        combic_ad.set(4, Carte3T);
        // 4 boucles pour les 4 cartes encore inconnues 2 cartes du joeurs adverses et 2 cartes sur la table 
        for (int i = 0; i < Pioche.size(); i++) {

            for (int j = i + 1; j < Pioche.size(); j++) {

                for (int k = 0; k < Pioche.size(); k++) {

                    for (int l = k + 1; l < Pioche.size(); l++) {

                        combic_ad.set(0, Pioche.get(i));
                        combic_ad.set(1, Pioche.get(j));
                        combic_ad.set(5, Pioche.get(k));
                        combic_ad.set(6, Pioche.get(l));

                        combic_jo.set(5, Pioche.get(k));
                        combic_jo.set(6, Pioche.get(l));

                        double scorec_jo = parmi7(combic_jo);
                        double scorec_ad = parmi7(combic_ad);

                        if (scorec_jo > scorec_ad) {
                            Vict += 1.0;
                        }
                        if (scorec_jo < scorec_ad) {
                            Def += 1.0;
                        }
                        if (scorec_jo == scorec_ad) {
                            Egal += 1.0;
                        }
                        cpt += 1.0;

                    }
                }
            }
        }
        Vict = (Vict / cpt) * 100;
        Egal = (Egal / cpt) * 100;
        Def = (Def / cpt) * 100;

    }

    public void AvantRiver(int rg1, int rg2, String couleur1, String couleur2, int rg3, int rg4, String couleur3, String couleur4, int rg5, String couleur5, int rg6, String couleur6) {
       // Meme principe que AvantTurn, juste à ce stade nous connaissons  6 cartes, 1  supplémentaires sur la table ainsi nous prenons leur rang et leur couleur en argument
        Vict = 0.0;
        Egal = 0.0;
        Def = 0.0;
        double cpt = 0.00;
        ArrayList<Carte> combic_ad = new ArrayList<Carte>();
        ArrayList<Carte> combic_jo = new ArrayList<Carte>();

        for (int i = 0; i < 7; i++) {
            combic_ad.add(null);
            combic_jo.add(null);
        }
        Carte Carte1T = new Carte(null, 0);
        Carte Carte2T = new Carte(null, 0);
        Carte Carte3T = new Carte(null, 0);
        Carte Carte4T = new Carte(null, 0);
        Carte1T = retirer_cartePioche(rg3, couleur3);
        Carte2T = retirer_cartePioche(rg4, couleur4);
        Carte3T = retirer_cartePioche(rg5, couleur5);
        Carte4T = retirer_cartePioche(rg6, couleur6);
        Carte Carte1J = new Carte(null, 0);
        Carte1J = retirer_cartePioche(rg1, couleur1);
        Carte Carte2J = new Carte(null, 0);
        Carte2J = retirer_cartePioche(rg2, couleur2);
        combic_jo.set(0, Carte1J);
        combic_jo.set(1, Carte2J);
        combic_jo.set(2, Carte1T);
        combic_jo.set(3, Carte2T);
        combic_jo.set(4, Carte3T);
        combic_jo.set(5, Carte4T);

        combic_ad.set(2, Carte1T);
        combic_ad.set(3, Carte2T);
        combic_ad.set(4, Carte3T);
        combic_ad.set(5, Carte4T);

        for (int i = 0; i < Pioche.size(); i++) {

            for (int j = i + 1; j < Pioche.size(); j++) {

                for (int k = 0; k < Pioche.size(); k++) {

                    combic_ad.set(0, Pioche.get(i));
                    combic_ad.set(1, Pioche.get(j));
                    combic_ad.set(6, Pioche.get(k));

                    combic_jo.set(6, Pioche.get(k));

                    double scorec_jo = parmi7(combic_jo);
                    double scorec_ad = parmi7(combic_ad);

                    if (scorec_jo > scorec_ad) {
                        Vict += 1.0;
                    }
                    if (scorec_jo < scorec_ad) {
                        Def += 1.0;
                    }
                    if (scorec_jo == scorec_ad) {
                        Egal += 1.0;
                    }
                    cpt += 1.0;

                }
            }
        }
        Vict = (Vict / cpt) * 100;
        Egal = (Egal / cpt) * 100;
        Def = (Def / cpt) * 100;

    }

    public void ApresRiver(int rg1, int rg2, String couleur1, String couleur2, int rg3, int rg4, String couleur3, String couleur4, int rg5, String couleur5, int rg6, String couleur6, int rg7, String couleur7) {
        Vict = 0.0;
        Egal = 0.0;
        Def = 0.0;
        double cpt = 0.00;
        ArrayList<Carte> combic_ad = new ArrayList<Carte>();
        ArrayList<Carte> combic_jo = new ArrayList<Carte>();

        for (int i = 0; i < 7; i++) {
            combic_ad.add(null);
            combic_jo.add(null);
        }
        Carte Carte1T = new Carte(null, 0);
        Carte Carte2T = new Carte(null, 0);
        Carte Carte3T = new Carte(null, 0);
        Carte Carte4T = new Carte(null, 0);
        Carte Carte5T = new Carte(null, 0);
        Carte1T = retirer_cartePioche(rg3, couleur3);
        Carte2T = retirer_cartePioche(rg4, couleur4);
        Carte3T = retirer_cartePioche(rg5, couleur5);
        Carte4T = retirer_cartePioche(rg6, couleur6);
        Carte5T = retirer_cartePioche(rg7, couleur7);
        Carte Carte1J = new Carte(null, 0);
        Carte1J = retirer_cartePioche(rg1, couleur1);
        Carte Carte2J = new Carte(null, 0);
        Carte2J = retirer_cartePioche(rg2, couleur2);
       
        combic_jo.set(0, Carte1J);
        combic_jo.set(1, Carte2J);
        combic_jo.set(2, Carte1T);
        combic_jo.set(3, Carte2T);
        combic_jo.set(4, Carte3T);
        combic_jo.set(5, Carte4T);
        combic_jo.set(6, Carte5T);

        combic_ad.set(2, Carte1T);
        combic_ad.set(3, Carte2T);
        combic_ad.set(4, Carte3T);
        combic_ad.set(5, Carte4T);
        combic_ad.set(6, Carte5T);

        for (int i = 0; i < Pioche.size(); i++) {

            for (int j = i + 1; j < Pioche.size(); j++) {

                combic_ad.set(0, Pioche.get(i));
                combic_ad.set(1, Pioche.get(j));
               

            

                double scorec_jo = parmi7(combic_jo);
                double scorec_ad = parmi7(combic_ad);

                if (scorec_jo > scorec_ad) {
                    Vict += 1.0;
                }
                if (scorec_jo < scorec_ad) {
                    Def += 1.0;
                }
                if (scorec_jo == scorec_ad) {
                    Egal += 1.0;
                }
                cpt += 1.0;

            }
        }
        Vict = (Vict / cpt) * 100;
        Egal = (Egal / cpt) * 100;
        Def = (Def / cpt) * 100;

    }
}
