/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_lacombe_barberan;

import java.util.Random;
import java.util.Scanner;

/**
 * EXERCICE 3
 *
 * @author Hugo LACOMBE/Baptiste BArberan
 */
public class TP1_guessMyNumber_LACOMBE_BARBERAN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random generateurAleat = new Random();
        int n = generateurAleat.nextInt(100);
        System.out.println(n);
        n = generateurAleat.nextInt(100);
        System.out.println(n);
        n = generateurAleat.nextInt(100);
        System.out.println(n);
        n = generateurAleat.nextInt(100);
        System.out.println(n);
        n = generateurAleat.nextInt(100);
        System.out.println(n);
        //Affichage des 5 nombres aléatoires générées grace au module Random generator

        // Mode facile => classique nb dee coups illimité indication plus simple 
        // Mode normal=> nombre de coup illimité grand nombre
        // Mode difficile => indication peu detaillée, nombre de coup limité, intervalle plus grand 
        Scanner sc = new Scanner(System.in);
        //Saisie du mode par l'utilisateur
        System.out.println("Choissisez votre mode de difficulté");
        System.out.println("1) Mode facile\n2) Mode simple\n3) Mode difficile");
        int mode;
        
        mode = sc.nextInt();
        // choix du mode par l'utilisateur
        int nbadev;
        int tent = 0;
        if (mode == 1) { // mode facile 
            //On demande à l'utilisateur de saissir un nombre entre 0 et 100 
            // On va générer un nombre aléatoire entre 0 et 100 => nbadev
            nbadev = generateurAleat.nextInt(100);
            System.out.println(nbadev); // A ENLEVER

            
            // initialisation du nombre saissi par l'utilisateur 
            int nbutil;
           
            // boucle interraction utilisateur 
            
            boolean rep = false;
            while (true) {
                while (true) {
                    System.out.println("Saissisez un nombre entier entre 0 et 100");
                    nbutil = sc.nextInt();
                    if (nbutil >= 0 && nbutil <= 100) {
                        break;
                    }
                }
                tent += 1;// une tentative est ajoutée

                if (nbutil == nbadev) {
                    rep = true;
                    System.out.print("Gagné!!");
                    break;

                }
                if ( (nbadev-5)=< nbutil && nbutil <=(nbavev+5)) {
                    System.out.println("Tu y es presque");
                    continue;
                }

                if (nbutil < nbadev) {
                    System.out.println("trop petit !!");
                }
                if (nbutil > nbadev) {
                    System.out.println("trop grand !!");
                }
                
               
                }

            }
            System.out.println("Nombre de tentative : " +tent);

        }
    }
