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
                return 3 * Math.pow(10, 10) + rang_paire1 * 100000000 + rang_paire2 * Math.pow(10, 6) + rang_solo * Math.pow(10, 4);
            }
            if (rang_paire2 < rang_paire1) {
                return 3 * Math.pow(10, 10) + rang_paire2 * 100000000 + rang_paire1 * Math.pow(10, 6) + rang_solo * Math.pow(10, 4);
            }

        }
        return 0.0; // pas de paire, ou on peut mieux faire comme combi. 
    }

    public Double Brelan(Carte tab[]) {
        int cpt_brelan = 0;
        int rang_brelan = 0;
        for (int i = 0; i <= 2; i++) {
            if (tab[i].Rang == tab[i + 1].Rang && tab[i + 1].Rang == tab[i + 2].Rang) {

                cpt_brelan += 1;
                rang_brelan = tab[i].Rang;
                

            }
            
        }
        
    }

}
