/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assistant_poker_lacombe_barberan;

import java.lang.Math;
import java.util.ArrayList;

/**
 *
 * @author Baptiste
 */
public class Combinaison {
    ArrayList<Carte> tab= new ArrayList<Carte>();

    public Combinaison(ArrayList<Carte> Combi) {
        tab=Combi; 
    }
    
// méthode paire avec tableuau d'indices de cartes TRIES en argument 
// Il faut acceder a la au rang de la carte qui est de l'indice dans le tableau pour voir si deux rangs sont identiques 
    public Double Paire() {
        int cpt_carte_id = 0;
        int rang_paire = 0;
        for (int i = 0; i <= 3; i++) {
            if (tab.get(i).Rang == tab.get(i + 1).Rang) {

                cpt_carte_id += 1;
                rang_paire = tab.get(i).Rang;
            }
        }
        if (cpt_carte_id == 1) { //Si il y a bien qu'une paire qui est possible 
            return 1000000.0 + rang_paire;// convention expliqué plus haut

        }
        return 0.0; // pas de paire, ou on peut mieux faire comme combi. 
    }

    //Fonction qui cherhce dans une tableau de 5 cartes triés dans l'ordre de rang 
    // si il y a deux paires 
    public Double DoublePaire() {
        int cpt_carte_id = 0;
        int rang_paire1 = 0;
        int rang_paire2 = 0;
        int rang_solo = 0;
        for (int i = 0; i <= 3; i++) {
            if (tab.get(i).Rang == tab.get(i + 1).Rang) {

                cpt_carte_id += 1;
                
                if (rang_paire1 == 0) {

                    rang_paire1 = tab.get(i).Rang;
                } else {
                    rang_paire2 = tab.get(i).Rang;
                }
            }
            //System.out.println(cpt_carte_id);
        }

//Si il y a bien que 2  paires qui est possible 
        if (cpt_carte_id == 2 && rang_paire1 != rang_paire2) {
          //  System.out.println("Première carte rang : "+rang_paire1+" Deuxième paire : "+rang_paire2);
            for (int j = 0; j <= 3; j++) {
                if (tab.get(j).Rang != rang_paire1 && tab.get(j).Rang != rang_paire2) {
                    rang_solo = tab.get(j).Rang;
                }
            }
       //     System.out.println(rang_solo); 

            if (rang_paire1 > rang_paire2) {
                
                return 3 * Math.pow(10, 10) + rang_paire1 * Math.pow(10, 8) + rang_paire2 * Math.pow(10, 6) + rang_solo * Math.pow(10, 4);
            }
            if (rang_paire2 > rang_paire1) {
                
                return 3 * Math.pow(10, 10) + rang_paire2 * Math.pow(10, 8) + rang_paire1 * Math.pow(10, 6) + rang_solo * Math.pow(10, 4);
            }

        }
        return 0.0; // pas de paire, ou on peut mieux faire comme combi. 
    }

    public Double Brelan() {
        int cpt_brelan = 0;
        int rang_brelan = 0;
        int rang_c1 = 0;
        int rang_c2 = 0;

        for (int i = 0; i <= 2; i++) {
            if (tab.get(i).Rang == tab.get(i + 1).Rang && tab.get(i + 1).Rang == tab.get(i + 2).Rang) {

                cpt_brelan += 1;
                rang_brelan = tab.get(i).Rang;

            }

        }

        if (cpt_brelan == 1) {
            for (int j = 0; j <= 4; j++) {
                if (tab.get(0).Rang == rang_brelan) {
                    rang_c1 = tab.get(3).Rang;
                    rang_c2 = tab.get(4).Rang;
                } else if (tab.get(1).Rang == rang_brelan && tab.get(3).Rang == rang_brelan) {
                    rang_c1 = tab.get(0).Rang;
                    rang_c2 = tab.get(4).Rang;
                } else if (tab.get(2).Rang == rang_brelan && tab.get(4).Rang == rang_brelan) {
                    rang_c1 = tab.get(0).Rang;
                    rang_c2 = tab.get(1).Rang;
                }

            }
            if(rang_c1>rang_c2){

            return 4 * Math.pow(10, 10) + rang_brelan * Math.pow(10, 8) + rang_c1 * Math.pow(10, 6) + rang_c2 * Math.pow(10, 4);
            }
            else {
                return 4 * Math.pow(10, 10) + rang_brelan * Math.pow(10, 8) + rang_c2 * Math.pow(10, 6) + rang_c1 * Math.pow(10, 4);
            }
        }
        return 0.0;

    }

    public Double Suite() {
        int cpt_Suite = 0;
        int rang_Suite = 0;

        if (tab.get(0).Rang + 1 == tab.get(1).Rang && tab.get(1).Rang + 1 == tab.get(2).Rang && tab.get(2).Rang + 1 == tab.get(3).Rang && tab.get(3).Rang + 1 == tab.get(4).Rang) {

            cpt_Suite += 1;
            rang_Suite = tab.get(4).Rang;
        }

        if (cpt_Suite == 1) {
            return 5 * Math.pow(10, 10) + rang_Suite * Math.pow(10, 8);
        }

        return 0.0;

    }

    public Double Couleur() {
        int cpt_Couleur = 0;
        int rang_Couleur = 0;
        int rang_c1 = 0;
        int rang_c2 = 0;
        int rang_c3 = 0;
        int rang_c4 = 0;

        if (tab.get(0).Couleur == tab.get(1).Couleur && tab.get(1).Couleur == tab.get(2).Couleur && tab.get(2).Couleur == tab.get(3).Couleur && tab.get(3).Couleur == tab.get(4).Couleur) {

            cpt_Couleur += 1;
            rang_Couleur = tab.get(4).Rang;
            rang_c1 = tab.get(3).Rang;
            rang_c2 = tab.get(2).Rang;
            rang_c3 = tab.get(1).Rang;
            rang_c4 = tab.get(0).Rang;

        }

        if (cpt_Couleur == 1) {
            return 6 * Math.pow(10, 10) + rang_Couleur * Math.pow(10, 8) + rang_c1 * Math.pow(10, 6) + rang_c2 * Math.pow(10, 4) + rang_c3 * Math.pow(10, 2) + rang_c4;
        }

        return 0.0;

    }

    public Double Full() {

        int rang_paire = 0;
        int rang_brelan = 0;
        boolean brelan = false;
        boolean paire = false;

        for (int i = 0; i <= 2; i++) {
            if (tab.get(i).Rang == tab.get(i + 1).Rang && tab.get(i + 1).Rang == tab.get(i + 2).Rang) {

                brelan = true;
                rang_brelan = tab.get(i).Rang;

            }

        }
        for (int j = 0; j <= 3; j++) {
            if (tab.get(j).Rang == tab.get(j + 1).Rang && tab.get(j).Rang != rang_brelan) {

                paire = true;
                rang_paire = tab.get(j).Rang;
            }
        }

//Si il y a bien que 2  paires qui est possible 
        if (paire == true && brelan == true) {
            return 7 * Math.pow(10, 10) + rang_brelan * Math.pow(10, 8) + rang_paire * Math.pow(10, 6);
        }

        return 0.0; // pas de paire, ou on peut mieux faire comme combi. 
    }

    public Double Carre() {
        int cpt_Carre = 0;
        int rang_Carre = 0;
        int rang_solo = 0;
        if (tab.get(0).Rang == tab.get(1).Rang && tab.get(1).Rang == tab.get(2).Rang && tab.get(2).Rang == tab.get(3).Rang) {

            cpt_Carre += 1;
            rang_Carre = tab.get(0).Rang;
            rang_solo = tab.get(4).Rang;
        } else if (tab.get(1).Rang == tab.get(2).Rang && tab.get(2).Rang == tab.get(3).Rang && tab.get(3).Rang == tab.get(4).Rang) {
            cpt_Carre += 1;
            rang_Carre = tab.get(1).Rang;
            rang_solo = tab.get(0).Rang;
        }
        if (cpt_Carre == 1) {
            return 8 * Math.pow(10, 10) + rang_Carre * Math.pow(10, 8) + rang_solo * Math.pow(10, 6);
        }

        return 0.0;

    }

    public Double QuinteF() {

        int rang_Quinte = 0;

        if (tab.get(0).Rang + 1 == tab.get(1).Rang && tab.get(1).Rang + 1 == tab.get(2).Rang && tab.get(2).Rang + 1 == tab.get(3).Rang && tab.get(3).Rang + 1 == tab.get(4).Rang && tab.get(0).Couleur == tab.get(1).Couleur && tab.get(1).Couleur == tab.get(2).Couleur && tab.get(2).Couleur == tab.get(3).Couleur && tab.get(3).Couleur == tab.get(4).Couleur) {

            rang_Quinte = tab.get(4).Rang;

            return 9 * Math.pow(10, 10) + rang_Quinte * Math.pow(10, 8);
        }

        return 0.0;
    }

    public Double QuinteFR() {

        if (tab.get(0).Rang == 10 && tab.get(1).Rang == 11 && tab.get(2).Rang == 12 && tab.get(3).Rang == 13 && tab.get(4).Rang == 14 && tab.get(0).Couleur == tab.get(1).Couleur && tab.get(1).Couleur == tab.get(2).Couleur && tab.get(2).Couleur == tab.get(3).Couleur && tab.get(3).Couleur == tab.get(4).Couleur) {

            return 10 * Math.pow(10, 10);
        }

        return 0.0; // pas de paire, ou on peut mieux faire comme combi. 
    }
    public Double Score(){
        
            if(QuinteFR()!=0.0){
               return QuinteFR() ;
            } 
             if(QuinteF()!=0.0){
               return QuinteF() ;
            } 
              if(Carre()!=0.0){
               return Carre() ;
            } 
               if(Full()!=0.0){
               return Full() ;
            } 
                if(Couleur()!=0.0){
               return Couleur() ;
            } 
                 if(Suite()!=0.0){
               return Suite() ;
            } 
                  if(Brelan()!=0.0){
               return Brelan() ;
            } 
                   if(DoublePaire()!=0.0){
               return DoublePaire() ;
            } 
                    if(Paire()!=0.0){
               return Paire() ;
            } 
                    return (double) tab.get(tab.size()-1).Rang;
    }
}
