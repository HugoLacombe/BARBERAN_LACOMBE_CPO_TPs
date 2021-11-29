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
        int cpt1 = 0;
        while (cpt1 < 5) {
            int a = r.nextInt(5);    //tirer aleatoirement un entier  
            int b = r.nextInt(6);
            if (grillejeu.CellulesJeu[a][b].trouNoir == false) {
                grillejeu.placerTrouNoir(a, b);
                cpt1 += 1;

            }

        }

        //placer les desintegrateurs
        int cpt = 0;
        while (cpt < 2) {

            int x = r.nextInt(5);    //tirer aleatoirement un entier  
            int y = r.nextInt(6);
            if ((grillejeu.CellulesJeu[x][y].trouNoir == true) && (grillejeu.CellulesJeu[x][y].presenceDesintegrateur() == false)) {
                grillejeu.placerDesintegrateur(x, y);
                cpt += 1;
            }

        }
        int cpt2 = 0;

        while (cpt2 < 3) {

            int x = r.nextInt(5);    //tirer aleatoirement un entier  
            int y = r.nextInt(6);
            if ((grillejeu.CellulesJeu[x][y].trouNoir == false) && (grillejeu.CellulesJeu[x][y].presenceDesintegrateur() == false)) {
                grillejeu.placerDesintegrateur(x, y);
                cpt2 += 1;
            }
        }

        //grillejeu.placerDesintegrateur(5, 1);
        //grillejeu.placerDesintegrateur(5, 2);
        //grillejeu.placerDesintegrateur(5, 3);
    }

    public void debuterPartie() {
        
        Random r = new Random();
        int a = r.nextInt(2);
        joueurCourant = ListeJoueurs[a];
        
        while (ListeJoueurs[0].Vict != true && ListeJoueurs[1].Vict != true && grillejeu.etreRemplie() != true) {
            System.out.println("");
            System.out.println("Information sur le joueur");
            System.out.println("Au tour de : "+joueurCourant.Nom);
            System.out.println("Votre Nombre de désintégrateur est de : " + joueurCourant.nombreDesintegrateurs);
            System.out.println("Votre Nombre de jetons restants : " + joueurCourant.nombreJetonsRestants);
            System.out.println("VOtre couleur est : " + joueurCourant.Couleur);
            System.out.println("");
            System.out.println("~Affichage de la Grille~");
            System.out.println("");
            grillejeu.afficherGrilleSurConsole();
            System.out.println("");
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

                            grillejeu.ajouterJetonDansColonne(joueurCourant.ListeJetons[(joueurCourant.nombreJetonsRestants) - 1], colonne_jc);
                            if (grillejeu.ligneDesin(colonne_jc) == true) {
                                joueurCourant.nombreDesintegrateurs += 1;

                                System.out.println("Vous avez gagné un désintégrateur " + joueurCourant.nombreDesintegrateurs);

                            }

                            coup = true;

                        }
                        if (coup == false) {

                            System.out.println("Place ton jeton, tu t'es trompé");
                            colonne_jc = sc.nextInt();
                        }

                    } while (coup == false);

                    joueurCourant.ListeJetons[(joueurCourant.nombreJetonsRestants) - 1] = null;
                    joueurCourant.nombreJetonsRestants -= 1;
                    //System.out.println("jeton placé");
                    ListeJoueurs[0].Vict=grillejeu.etreGagnantePourJoueur(ListeJoueurs[0]); 
                    ListeJoueurs[1].Vict=grillejeu.etreGagnantePourJoueur(ListeJoueurs[1]); 
                    
                    

                    break;

                case 2: //Récupérer les jetons 
                    System.out.println("Rentrez la  ligne du jeton entre 0 et 5 ");
                    int ligne_recup = sc.nextInt();
                    System.out.println("Rentrez la colonne du jeton visé entre 0 et 6");
                    int colonne_recup = sc.nextInt();
                    while ((grillejeu.celluleOccupee(ligne_recup, colonne_recup) != true)
                            || (grillejeu.lireCouleurDuJeton(ligne_recup, colonne_recup) != joueurCourant.Couleur)
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
                    if ((grillejeu.etreGagnantePourJoueur(ListeJoueurs[0]) == true) && (grillejeu.etreGagnantePourJoueur(ListeJoueurs[1])) == true) {
                        if (joueurCourant == ListeJoueurs[0]) {
                            System.out.println(ListeJoueurs[1] + "a gagné! par faute de " + joueurCourant.Nom);
                            
                            ListeJoueurs[1].Vict=true; 
                        } else {
                            System.out.println(ListeJoueurs[0] + "A gagné! par faute de " + joueurCourant.Nom);
                            ListeJoueurs[0].Vict=true; 

                        }

                    }
                    ListeJoueurs[0].Vict=grillejeu.etreGagnantePourJoueur(ListeJoueurs[0]); 
                    ListeJoueurs[1].Vict=grillejeu.etreGagnantePourJoueur(ListeJoueurs[1]); 
                    break;

                case 3://utilisation désint
                    if (joueurCourant.nombreDesintegrateurs >= 1) {
                        System.out.println("Rentrez les coordonnées du jeton adverse à supprimer");
                        System.out.println("Rentrez la ligne entre 0 et 5");
                        int ligne_supr = sc.nextInt();
                        System.out.println("Rentrez la colonne entre 0 et 6");
                        int colonne_supr = sc.nextInt();

                        while ((grillejeu.celluleOccupee(ligne_supr, colonne_supr) != true)
                                || (grillejeu.lireCouleurDuJeton(ligne_supr, colonne_supr) == joueurCourant.Couleur)
                                || (ligne_supr < 0) || (colonne_supr < 0) || (ligne_supr >= 6) || (colonne_supr >= 7)) {
                            System.out.println(" Vous vous etes trompés! Rentrez les coordonnées du jeton adverse a supprimer");
                            System.out.println("Rentrez la ligne entre 0 et 5");
                            ligne_supr = sc.nextInt();
                            System.out.println("Rentrez la colonne entre 0 et 6");
                            colonne_supr = sc.nextInt();

                        }
                        grillejeu.supprimerJeton(ligne_supr, colonne_supr);
                        grillejeu.tasserGrille(colonne_supr);
                        System.out.println("Désintégration avec succés");
                        joueurCourant.nombreDesintegrateurs -= 1;
                         ListeJoueurs[0].Vict=grillejeu.etreGagnantePourJoueur(ListeJoueurs[0]); 
                         ListeJoueurs[1].Vict=grillejeu.etreGagnantePourJoueur(ListeJoueurs[1]); 
                        if ((grillejeu.etreGagnantePourJoueur(ListeJoueurs[0]) == true) && (grillejeu.etreGagnantePourJoueur(ListeJoueurs[1])) == true) {
                            System.out.println("~Affichage de la Grille~");
                            System.out.println("");
                            grillejeu.afficherGrilleSurConsole();
                            System.out.println("");
                            if (joueurCourant == ListeJoueurs[0]) {
                                System.out.println(ListeJoueurs[1].Nom + "A gagné! par faute de " + joueurCourant.Nom);
                                ListeJoueurs[1].Vict=true; 

                            } else {
                                System.out.println(ListeJoueurs[0].Nom + "A gagné! par faute de " + joueurCourant.Nom);
                                ListeJoueurs[0].Vict=true; 

                            }

                        }

                    } else {
                        System.out.println("Vous n'avez pas de desintegrateur ");// il faut redemarrer au debut du switch case
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
            

            } else {
                joueurCourant = ListeJoueurs[0];
               
            }

        }
        
        System.out.println("~Résultats~"); 
        System.out.println(""); 
        if(ListeJoueurs[0].Vict==true){
            System.out.println("Félicitations "+ListeJoueurs[0].Nom+" tu as gagné !"); 
        }
        else{
            System.out.println("Félicitations "+ListeJoueurs[1].Nom+" tu as gagné !"); 
        }
        System.out.println("");
        System.out.println("PARTIE TERMINE");
        
        grillejeu.afficherGrilleSurConsole();
        

    }
}
