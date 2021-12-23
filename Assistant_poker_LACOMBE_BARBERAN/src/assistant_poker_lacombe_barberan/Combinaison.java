/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assistant_poker_lacombe_barberan;

import java.lang.Math;

/**
 *
 * @author Baptiste
 */
public class Combinaison {

// méthode paire avec tableuau d'indices de cartes TRIES en argument 
// Il faut acceder a la au rang de la carte qui est de l'indice dans le tableau pour voir si deux rangs sont identiques 
    public Double Paire(Carte tab[]) {
        int cpt_carte_id = 0;
        int rang_paire = 0;
        for (int i = 0; i <= 3; i++) {
            if (tab[i].Rang == tab[i + 1].Rang) {

                cpt_carte_id += 1;
                rang_paire = tab[i].Rang;
            }
        }
        if (cpt_carte_id == 1) { //Si il y a bien qu'une paire qui est possible 
            return 1000000.0 + rang_paire;// convention expliqué plus haut

        }
        return 0.0; // pas de paire, ou on peut mieux faire comme combi. 
    }

    //Fonction qui cherhce dans une tableau de 5 cartes triés dans l'ordre de rang 
    // si il y a deux paires 
    public Double DoublePaire(Carte tab[]) {
        int cpt_carte_id = 0;
        int rang_paire1 = 0;
        int rang_paire2 = 0;
        int rang_solo = 0;
        for (int i = 0; i <= 3; i++) {
            if (tab[i].Rang == tab[i + 1].Rang) {

                cpt_carte_id += 1;
                if (rang_paire1 == 0) {

                    rang_paire1 = tab[i].Rang;
                } else {
                    rang_paire2 = tab[i].Rang;
                }
            }
        }

//Si il y a bien que 2  paires qui est possible 
        if (cpt_carte_id == 2 && rang_paire1 != rang_paire2) {
            for (int j = 0; j <= 3; j++) {
                if (tab[j].Rang != rang_paire1 && tab[j].Rang != rang_paire2) {
                    rang_solo = tab[j].Rang;
                }
            }

            if (rang_paire1 > rang_paire2) {
                return 3 * Math.pow(10, 10) + rang_paire1 * Math.pow(10, 8) + rang_paire2 * Math.pow(10, 6) + rang_solo * Math.pow(10, 4);
            }
            if (rang_paire2 < rang_paire1) {
                return 3 * Math.pow(10, 10) + rang_paire2 * Math.pow(10, 8) + rang_paire1 * Math.pow(10, 6) + rang_solo * Math.pow(10, 4);
            }

        }
        return 0.0; // pas de paire, ou on peut mieux faire comme combi. 
    }

    public Double Brelan(Carte tab[]) {
        int cpt_brelan = 0;
        int rang_brelan = 0;
        int rang_c1 = 0;
        int rang_c2 = 0;

        for (int i = 0; i <= 2; i++) {
            if (tab[i].Rang == tab[i + 1].Rang && tab[i + 1].Rang == tab[i + 2].Rang) {

                cpt_brelan += 1;
                rang_brelan = tab[i].Rang;

            }

        }

        if (cpt_brelan == 1) {
            for (int j = 0; j <= 4; j++) {
                if (tab[0].Rang == rang_brelan) {
                    rang_c1 = tab[3].Rang;
                    rang_c2 = tab[4].Rang;
                } else if (tab[1].Rang == rang_brelan && tab[3].Rang == rang_brelan) {
                    rang_c1 = tab[0].Rang;
                    rang_c2 = tab[4].Rang;
                } else if (tab[2].Rang == rang_brelan && tab[4].Rang == rang_brelan) {
                    rang_c1 = tab[0].Rang;
                    rang_c2 = tab[1].Rang;
                }

            }

            return 4 * Math.pow(10, 10) + rang_brelan * Math.pow(10, 8) + rang_c1 * Math.pow(10, 6) + rang_c2 * Math.pow(10, 4);

        }
        return 0.0;

    }

    public Double Suite(Carte tab[]) {
        int cpt_Suite = 0;
        int rang_Suite = 0;

        if (tab[0].Rang + 1 == tab[1].Rang && tab[1].Rang + 1 == tab[2].Rang && tab[2].Rang + 1 == tab[3].Rang && tab[3].Rang + 1 == tab[4].Rang) {

            cpt_Suite += 1;
            rang_Suite = tab[4].Rang;
        }

        if (cpt_Suite == 1) {
            return 5 * Math.pow(10, 10) + rang_Suite * Math.pow(10, 8);
        }

        return 0.0;

    }

    public Double Couleur(Carte tab[]) {
        int cpt_Couleur = 0;
        int rang_Couleur = 0;
        int rang_c1 = 0;
        int rang_c2 = 0;
        int rang_c3 = 0;
        int rang_c4 = 0;

        if (tab[0].Couleur == tab[1].Couleur && tab[1].Couleur == tab[2].Couleur && tab[2].Couleur == tab[3].Couleur && tab[3].Couleur == tab[4].Couleur) {

            cpt_Couleur += 1;
            rang_Couleur = tab[4].Rang;
            rang_c1 = tab[3].Rang;
            rang_c2 = tab[2].Rang;
            rang_c3 = tab[1].Rang;
            rang_c4 = tab[0].Rang;

        }

        if (cpt_Couleur == 1) {
            return 6 * Math.pow(10, 10) + rang_Couleur * Math.pow(10, 8) + rang_c1 * Math.pow(10, 6) + rang_c2 * Math.pow(10, 4) + rang_c3 * Math.pow(10, 2) + rang_c4;
        }

        return 0.0;

    }

    public Double Full(Carte tab[]) {

        int rang_paire = 0;
        int rang_brelan = 0;
        boolean brelan = false;
        boolean paire = false;

        for (int i = 0; i <= 2; i++) {
            if (tab[i].Rang == tab[i + 1].Rang && tab[i + 1].Rang == tab[i + 2].Rang) {

                brelan = true;
                rang_brelan = tab[i].Rang;

            }

        }
        for (int j = 0; j <= 3; j++) {
            if (tab[j].Rang == tab[j + 1].Rang && tab[j].Rang != rang_brelan) {

                paire = true;
                rang_paire = tab[j].Rang;
            }
        }

//Si il y a bien que 2  paires qui est possible 
        if (paire == true && brelan == true) {
            return 7 * Math.pow(10, 10) + rang_brelan * Math.pow(10, 8) + rang_paire * Math.pow(10, 6);
        }

        return 0.0; // pas de paire, ou on peut mieux faire comme combi. 
    }

    public Double Carre(Carte tab[]) {
        int cpt_Carre = 0;
        int rang_Carre = 0;
        int rang_solo = 0;
        if (tab[0].Rang == tab[1].Rang && tab[1].Rang == tab[2].Rang && tab[2].Rang == tab[3].Rang) {

            cpt_Carre += 1;
            rang_Carre = tab[0].Rang;
            rang_solo = tab[4].Rang;
        } else if (tab[1].Rang == tab[2].Rang && tab[2].Rang == tab[3].Rang && tab[3].Rang == tab[4].Rang) {
            cpt_Carre += 1;
            rang_Carre = tab[1].Rang;
            rang_solo = tab[0].Rang;
        }
        if (cpt_Carre == 1) {
            return 8 * Math.pow(10, 10) + rang_Carre * Math.pow(10, 8) + rang_solo * Math.pow(10, 6);
        }

        return 0.0;

    }

    public Double QuinteF(Carte tab[]) {

        int rang_Quinte = 0;

        if (tab[0].Rang + 1 == tab[1].Rang && tab[1].Rang + 1 == tab[2].Rang && tab[2].Rang + 1 == tab[3].Rang && tab[3].Rang + 1 == tab[4].Rang && tab[0].Couleur == tab[1].Couleur && tab[1].Couleur == tab[2].Couleur && tab[2].Couleur == tab[3].Couleur && tab[3].Couleur == tab[4].Couleur) {

            rang_Quinte = tab[4].Rang;

            return 9 * Math.pow(10, 10) + rang_Quinte * Math.pow(10, 8);
        }

        return 0.0;
    }

    public Double QuinteFR(Carte tab[]) {

        if (tab[0].Rang == 10 && tab[1].Rang == 11 && tab[2].Rang == 12 && tab[3].Rang == 13 && tab[4].Rang == 14 && tab[0].Couleur == tab[1].Couleur && tab[1].Couleur == tab[2].Couleur && tab[2].Couleur == tab[3].Couleur && tab[3].Couleur == tab[4].Couleur) {

            return 10 * Math.pow(10, 10);
        }

        return 0.0; // pas de paire, ou on peut mieux faire comme combi. 
    }

}
