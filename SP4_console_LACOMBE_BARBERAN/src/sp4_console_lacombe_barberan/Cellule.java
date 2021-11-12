/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_lacombe_barberan;

/**
 *
 * @author Baptiste
 */
public class Cellule {
Jeton jetonCourant;
boolean trouNoir;
boolean desintegrateur;

public Cellule(){
jetonCourant=null;
trouNoir=false ;
desintegrateur=false;}

public boolean affecterJeton(Jeton Jeton){ // affecte le jeton en paramètre ou retourne faux si cellule pleine 
if(jetonCourant==null){
System.out.print("Cellule occupé ");
    return false ;
}
else{
    jetonCourant= Jeton;
       return true ; }}




public String lireCouleurDuJeton(){
if (jetonCourant==null){
    return "vide";
}
    else {
            return jetonCourant.lireCouleur();
            }    
}

public Jeton recupererJeton(){
return jetonCourant;
}

public boolean supprimerJeton() {
 if(jetonCourant==null){
     System.out.print("Jeton innexistant ");
return false ;
}
 else{ jetonCourant=null;
    return true ;
     }
}

//public boolean placerTrouNoir(){
  //  trouNoir.placerTrouNoir(int, int);
//}
}