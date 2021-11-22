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
        
         grillejeu =new Grille() ;
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
        int cpt=0;
        while (cpt<2){
            
            int x = r.nextInt(5);    //tirer aleatoirement un entier  
            int y = r.nextInt(6);
            if (grillejeu.CellulesJeu[x][y].trouNoir==true){
                grillejeu.placerDesintegrateur(x, y);
                cpt+=1;
            }
            
        }
        for (int z=0;z<3;z++){
            int x = r.nextInt(5);    //tirer aleatoirement un entier  
            int y = r.nextInt(6);
            grillejeu.placerDesintegrateur(x, y);
            
    }
}
    public void  debuterPartie(){
        Random r = new Random();
        int a = r.nextInt(2);
        joueurCourant=ListeJoueurs[a];
        while (grillejeu.etreGagnantePourJoueur(ListeJoueurs[0])!=true ||grillejeu.etreGagnantePourJoueur(ListeJoueurs[1])!=true || grillejeu.etreRemplie()!=true ){
            grillejeu.afficherGrilleSurConsole();
            int tour=0;
            System.out.println("Il va ou ton jeton ? ");
            Scanner sc = new Scanner(System.in);
            
               int colonne_jc = sc.nextInt();
               
               for(int i =0; i<21;i++){
                   
               
               if(joueurCourant.ListeJetons[i]!=null){
               
               break; 
              
               }
               boolean coup=false; 
               do{
                   
               
               if( colonne_jc<7 && colonne_jc >=0 && grillejeu.colonneRemplie(colonne_jc)!=true){
                   grillejeu.ajouterJetonDansColonne( joueurCourant.ListeJetons[i], colonne_jc);
                   coup=true; 
                   
               }
               if(coup==false){
                   System.out.println("Il va ou ton jeton ? pcq la tu t'es trompé c pas possible");
               colonne_jc = sc.nextInt();
               }
               
               
               }while(coup==false); 
               
               joueurCourant.ListeJetons[i]=null; 
               
               
               
               
               
               
               
        }
            
            
     }
    }
}
