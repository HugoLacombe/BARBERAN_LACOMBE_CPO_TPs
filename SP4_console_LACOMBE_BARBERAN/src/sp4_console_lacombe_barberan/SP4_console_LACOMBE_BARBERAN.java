/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sp4_console_lacombe_barberan;
import java.util.Scanner;

/**
 *
 * @author 33695
 */
public class SP4_console_LACOMBE_BARBERAN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
System.out.println("Bienvenue dans le Super-Puissance 4 !!"); 
System.out.println("Tout d'abord choissisez vos pseudos, joueur n°1 comment vous vous appelez ?");
Scanner sc = new Scanner(System.in);
String pseudo1 = sc.nextLine();
System.out.println("Joueur 2 votre pseudo ?");
String pseudo2 =sc.nextLine();
System.out.println("Que la partie commence !!");


          Joueur joueur1 = new Joueur(pseudo1);
           Joueur joueur2 = new Joueur(pseudo2);
          
          Partie part1 = new Partie(joueur1,joueur2); 
          part1.attribuerCouleursAuxJoueurs();
          part1.initialiserPartie();
          part1.debuterPartie();
      
 
        
    }
    /*/
            Jeton jeton  = new Jeton("rouge"); 
 System.out.print(jeton.lireCouleur()); 
 Cellule c =new Cellule(); 
  System.out.print(c.lireCouleurDuJeton()); 
  
 c.affecterJeton(jeton);
 System.out.println(c.lireCouleurDuJeton());
 Grille G = new Grille();
 G.afficherGrilleSurConsole();
 
 G.ajouterJetonDansColonne(jeton, 5); 
 
 //G.afficherGrilleSurConsole();
  G.ajouterJetonDansColonne(jeton, 0);
   
   G.ajouterJetonDansColonne(jeton, 0);
   
   G.ajouterJetonDansColonne(jeton, 0);
   
   G.ajouterJetonDansColonne(jeton, 0);
   G.afficherGrilleSurConsole();
  G.ajouterJetonDansColonne(jeton, 1);
  System.out.println("  ekeekee  ");
          
          G.ajouterJetonDansColonne(jeton, 3);
          G.ajouterJetonDansColonne(jeton, 2);
          G.ajouterJetonDansColonne(jeton, 1);

          G.afficherGrilleSurConsole();
          Joueur joueur = new Joueur("Jul");
          joueur.Couleur="rouge";
          G.etreGagnantePourJoueur(joueur); 
          /*/
          
                  
 
 
        // TODO code application logic here
    }

    

