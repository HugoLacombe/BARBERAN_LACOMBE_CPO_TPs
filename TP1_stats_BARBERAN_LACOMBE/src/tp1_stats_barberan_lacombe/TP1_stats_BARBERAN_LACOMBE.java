/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stats_barberan_lacombe;

import java.util.Random;
import java.util.Scanner;

/**
 * TP1_stats
 *
 * @author BARBERAN LACOMBE
 */
public class TP1_stats_BARBERAN_LACOMBE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] tab1; //initialisation tableau nommé tab1 
        tab1 = new int[6];  //Initialisation de la taile du tableau a 6

        for (int cpt = 0; cpt <= 5; cpt++) { // boucle qui parcourt le tableau et le rempli de 0
            tab1[cpt] = 0;
            // attention la premiere valeur de tab1 commence a l'indice 0 
        }

        Scanner sc = new Scanner(System.in); // création de l'espace de stockage 

        System.out.println("Rentrez un nombre entier ");  //affichage 
        int m = sc.nextInt();  // demande a l'utilisateur du nombre entier 

        Random generateurAleat = new Random();//importation du module aleatoire 
        
        
        for (int cpt = 0; cpt <= m; cpt++) { // boucle qui parcourt le tableau et le rempli de 0
            
        int nbaleat = generateurAleat.nextInt(5);
        tab1[nbaleat] +=1 ;// probleme entre taille de tableau et nombre itération je pense que le tableau doit faire la taille m
        }
         for (int cpt = 0; cpt <= 5; cpt++) { // boucle qui parcourt le tableau et affiche les valeurs des cases dans l'ordre
            System.out.println(tab1[cpt]);  //affichage   ;
            // attention la premiere valeur de tab1 commence a l'indice 0 
        }
    }
}
