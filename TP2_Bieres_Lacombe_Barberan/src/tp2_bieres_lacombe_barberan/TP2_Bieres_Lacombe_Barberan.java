/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_lacombe_barberan;

/**
 *
 * @author 33695
 */
public class TP2_Bieres_Lacombe_Barberan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls",
7.0 ,"Dubuisson") ;
/*/Lorsque nous utilisons le constructeur par défaut => BouteilleBiere uneBiere = new BouteilleBiere()
    On n'affecte pas les valeurs des différents attributs directement lors de l'initialisaton de notre variable qui appartient à 
        la classe BouteilleBiere quand c'est par le constructeur est celui par défault . 
        Ici on en a crée un nouveau constructeur qui nous permet d'affecter tous les attributs de la classe
        
*/
        uneBiere.lireEtiquette();
        
        BouteilleBiere secondeBiere = new BouteilleBiere("Leffe",
6.6,"Abbaye de Leffe") ;
          secondeBiere.lireEtiquette();
          
        BouteilleBiere troisBiere = new BouteilleBiere("Heinekein",8.0,"LA brasserie de jul");
        troisBiere.lireEtiquette();
        
        //On crée des objets de la classe bouteilleBiere
        
        System.out.println(troisBiere.Decapsuler());
        troisBiere.Decapsuler();
        System.out.println(troisBiere) ;
        /*/la ligne d'au dessus permet d'afficher la référence de l'objet.
        En définissant la méthode toString on peut afficher ce l'on souhaite avec 
cette ligne.
/*/

        BouteilleBiere quatBiere = new BouteilleBiere("Corona",14.0,"Chez tonton");
        quatBiere.Decapsuler();
        System.out.println(quatBiere);
    }
    
}
