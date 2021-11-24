/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_lacombe_barberan;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Baptiste
 */
public class Partie {

    Joueur[] ListeJoueurs = new Joueur[2];
    Joueur joueurCourant;
    Grille grillejeu;

    public Partie(Joueur joueur1, Joueur joueur2) {

        ListeJoueurs[0] = joueur1;
        ListeJoueurs[1] = joueur2;
        joueurCourant = null;
    }

    public void attribuerCouleursAuxJoueurs() {
        // couleur Jaune attribué à 0
        // couleur Jaune attribué à 1 
        Random r = new Random();
        int n = r.nextInt(1);
        if (n == 0) {
            ListeJoueurs[0].Couleur = "jaune";
            ListeJoueurs[1].Couleur = "rouge";
        } else {
            ListeJoueurs[0].Couleur = "rouge";
            ListeJoueurs[1].Couleur = "jaune";
        }

    }

    public void initialiserPartie() {

        grillejeu = new Grille();
        Random r = new Random();

//creation des jetons joueur1
        for (int i = 0; i <= 20; i++) {
            Jeton jeton = new Jeton(ListeJoueurs[0].Couleur);
            ListeJoueurs[0].ajouterJeton(jeton);

        }
        //creation des jetons joueur1
        for (int j = 0; j <= 20; j++) {
            Jeton jeton = new Jeton(ListeJoueurs[1].Couleur);
            ListeJoueurs[1].ajouterJeton(jeton);

        }
        //placer les trous noir 
        for (int k = 0; k < 5; k++) {

            int a = r.nextInt(5);    //tirer aleatoirement un entier  
            int b = r.nextInt(6);
            grillejeu.placerTrouNoir(a, b);
        }
        //placer les desintegrateurs
        int cpt = 0;
        while (cpt < 2) {

            int x = r.nextInt(5);    //tirer aleatoirement un entier  
            int y = r.nextInt(6);
            if (grillejeu.CellulesJeu[x][y].trouNoir == true) {
                grillejeu.placerDesintegrateur(x, y);
                cpt += 1;
            }

        }
        for (int z = 0; z < 3; z++) {
            int x = r.nextInt(5);    //tirer aleatoirement un entier  
            int y = r.nextInt(6);
            grillejeu.placerDesintegrateur(x, y);

        }
        grillejeu.placerDesintegrateur(5, 0);
    }

    public void debuterPartie() {

        Random r = new Random();
        int a = r.nextInt(2);
        joueurCourant = ListeJoueurs[a];
        while (grillejeu.etreGagnantePourJoueur(ListeJoueurs[0]) != true && grillejeu.etreGagnantePourJoueur(ListeJoueurs[1]) != true && grillejeu.etreRemplie() != true) {
            System.out.println("Votre Nombre de désintégrateur est de :"+ joueurCourant.nombreDesintegrateurs); 
            System.out.println("Votre Nombre de jetons restants"+ joueurCourant.nombreJetonsRestants); 
            grillejeu.afficherGrilleSurConsole();
            System.out.println("Choissis ton coup :");
            System.out.println("1.Placer un jeton");
            System.out.println("2.Récupérer un jeton de sa couleur");
            System.out.println("3.Désintégrer un jeton de la couleur adverse");
            Scanner sc = new Scanner(System.in);
            int nombre = sc.nextInt();
            switch (nombre) {
                case 1:
                    System.out.println("Placez votre jeton dans une colonne? ");

                    int colonne_jc = sc.nextInt();

                    boolean coup = false;

                    do {

                        if (colonne_jc < 7 && colonne_jc >= 0 && grillejeu.colonneRemplie(colonne_jc) != true) {

                            System.out.println("boucle 2");

                            grillejeu.ajouterJetonDansColonne(joueurCourant.ListeJetons[(joueurCourant.nombreJetonsRestants) - 1], colonne_jc);
                            if (grillejeu.ligneDesin(colonne_jc) == true) {
                                joueurCourant.nombreDesintegrateurs += 1;
                                System.out.println("désintégrateur la");
                            }

                            coup = true;

                        }
                        if (coup == false) {
                            System.out.println("boucle 2");
                            System.out.println("Place ton jeton, tu t'es trompé");
                            colonne_jc = sc.nextInt();
                        }

                    } while (coup == false);

                    joueurCourant.ListeJetons[(joueurCourant.nombreJetonsRestants) - 1] = null;
                    joueurCourant.nombreJetonsRestants -= 1;
                    System.out.println("jeton placé");

                    break;

                case 2: //Récupérer les jetons 
                    System.out.println("rentrez la ligne [0;5]");
                    int ligne_recup = sc.nextInt();
                    System.out.println("rentrez la colonne [0;6]");
                    int colonne_recup = sc.nextInt();
                    while ((grillejeu.celluleOccupee(ligne_recup, colonne_recup) != true)
                            || (grillejeu.lireCouleurDuJeton(ligne_recup,colonne_recup)!= joueurCourant.Couleur)
                            || (ligne_recup < 0) || (colonne_recup < 0) || (ligne_recup >= 6) || (colonne_recup >= 7)) {

                        System.out.println("rentrez les coordonnez d'un jeton vous appartenant ou qui existe ");
                        System.out.println("rentrez la ligne [0;5]");
                        ligne_recup = sc.nextInt();
                        System.out.println("rentrez la colonne [0;6]");
                        colonne_recup = sc.nextInt();

                    }

                    joueurCourant.ListeJetons[(joueurCourant.nombreJetonsRestants)] = grillejeu.recupererJeton(ligne_recup, colonne_recup);
                    joueurCourant.nombreJetonsRestants += 1;
                    grillejeu.tasserGrille(colonne_recup);
                    if ((grillejeu.etreGagnantePourJoueur(ListeJoueurs[0]) ==true) && (grillejeu.etreGagnantePourJoueur(ListeJoueurs[1]))==true) {
                        if (joueurCourant == ListeJoueurs[0]) {
                            System.out.println(ListeJoueurs[1] + "a gagné! par faute de " + joueurCourant.Nom);

                        } else {
                            System.out.println(ListeJoueurs[0] + "A gagné! par faute de " + joueurCourant.Nom);

                        }

                    }
                    break;

                case 3:
                    if (joueurCourant.nombreDesintegrateurs >= 1) {
                        System.out.println("rentrez les coordonnées du jeton adverse a supprimer");
                        System.out.println("rentrez la ligne [0;5]");
                        int ligne_supr = sc.nextInt();
                        System.out.println("rentrez la colonne [0;6]");
                        int colonne_supr = sc.nextInt();

                        while ((grillejeu.celluleOccupee(ligne_supr, colonne_supr) != true)
                                || (grillejeu.lireCouleurDuJeton(ligne_supr,colonne_supr) == joueurCourant.Couleur)
                                || (ligne_supr < 0) || (colonne_supr< 0) || (ligne_supr >= 6) || (colonne_supr >= 7)) {
                            System.out.println(" Vous vous etes trompés! Rentrez les coordonnées du jeton adverse a supprimer");
                            System.out.println("rentrez la ligne [0;5]");
                            ligne_supr = sc.nextInt();
                            System.out.println("rentrez la colonne [0;6]");
                            colonne_supr = sc.nextInt();

                        }
                        grillejeu.supprimerJeton(ligne_supr, colonne_supr);
                        grillejeu.tasserGrille(colonne_supr);
                        if ((grillejeu.etreGagnantePourJoueur(ListeJoueurs[0]) == true) && (grillejeu.etreGagnantePourJoueur(ListeJoueurs[1]))==true) {
                            if (joueurCourant == ListeJoueurs[0]) {
                                System.out.println(ListeJoueurs[1] + "A gagné! par faute de " + joueurCourant);

                            } else {
                                System.out.println(ListeJoueurs[0] + "A gagné! par faute de " + joueurCourant);

                            }

                        }

                    } else {
                        System.out.println("Vous n'avez pas de desintegrateur  ");// il faut redemarrer au debut du switch case
                        if (joueurCourant == ListeJoueurs[0]) {
                            joueurCourant = ListeJoueurs[1];

                        } else {
                            joueurCourant = ListeJoueurs[0];

                        }
                    }
                    break;

            }
            if (joueurCourant == ListeJoueurs[0]) {
                joueurCourant = ListeJoueurs[1];
                System.out.println("A ton tour " + ListeJoueurs[1].Nom);

            } else {
                joueurCourant = ListeJoueurs[0];
                System.out.println("A ton tour " + ListeJoueurs[0].Nom);
            }

        }
        System.out.println("PARTIE TERMINE");

    }
}
