/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_lacombe_barberan;

/**
 *
 * @author Hugo Lacombe
 */
public class BouteilleBiere {
    String nom; 
    double  degreAlcool;
    String  brasserie;
    boolean ouverte; 
   
    public void lireEtiquette() {
    System.out.println("Bouteille de " + nom +" (" + degreAlcool +
            " degres) \nBrasserie : " + brasserie ) ;
    }
public BouteilleBiere(String unNom, double unDegre, String
uneBrasserie) {
 nom = unNom;
 degreAlcool = unDegre;
 brasserie = uneBrasserie;
 ouverte = false;
}
/*/
Définition du nouveau constructeur et on écrase celui déjà existant
/*/

public boolean Decapsuler(){
    if(ouverte==false){
        ouverte=true;
         return true;
        
      
    }
    else{
        System.out.println("Erreur la bière était déjà ouverte");
        return false;
    }
}
/*/
méthode Décapsuler permet de modifier l'attribut ouverte d'un objet de cette classe
/*/
@Override
public String toString() {
String chaine_a_retourner;
chaine_a_retourner = nom + " (" + degreAlcool + " degrés) Ouverte ? ";
if (ouverte == true ) chaine_a_retourner += "oui" ;
else chaine_a_retourner += "non" ;
return chaine_a_retourner ;
/*/
La méthode toSting() est une méthode qui est appelé avec la méthode System.out.println()
Cette méthode existe de base, la commande @Override permet d'écraser la méthode déjà existante

/*/
}
}

 
