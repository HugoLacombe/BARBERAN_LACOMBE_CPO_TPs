/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sp4_console_lacombe_barberan;

/**
 *
 * @author 33695
 */
public class SP4_console_LACOMBE_BARBERAN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Jeton jeton  = new Jeton("Rouge"); 
 System.out.print(jeton.lireCouleur()); 
 Cellule c =new Cellule(); 
  System.out.print(c.lireCouleurDuJeton()); 
  
 c.affecterJeton(jeton);
 System.out.println(c.lireCouleurDuJeton());
 Grille G = new Grille();
 G.afficherGrilleSurConsole();
 
 G.ajouterJetonDansColonne(jeton, 5); 
        // TODO code application logic here
    }

    
}
