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
        la classe BouteilleBiere
        
*/
        uneBiere.lireEtiquette();
        BouteilleBiere secondeBiere = new BouteilleBiere("Leffe",
6.6,"Abbaye de Leffe") ;

     
        secondeBiere.lireEtiquette();
        
    }
    
}
