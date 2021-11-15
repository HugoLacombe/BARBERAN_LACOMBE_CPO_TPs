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

    public Cellule() {
        jetonCourant = null;
        trouNoir = false;
        desintegrateur = false;
    }

    public boolean affecterJeton(Jeton Jeton) { // affecte le jeton en paramètre ou retourne faux si cellule pleine 
        if (jetonCourant == null) {
            System.out.print("Cellule occupé ");
            return false;
        } else {
            jetonCourant = Jeton;
            return true;
        }
    }

    public String lireCouleurDuJeton() {
        if (jetonCourant == null) {
            return "vide";
        } else {
            return jetonCourant.lireCouleur();
        }
    }

    public Jeton recupererJeton() {
        return jetonCourant;
    }

    public boolean supprimerJeton() {
        if (jetonCourant == null) {
            System.out.print("Jeton innexistant ");
            return false;
        } else {
            jetonCourant = null;
            return true;
        }
    }

    public boolean placerTrouNoir() {
        if (trouNoir == false) {
            trouNoir = true;
            System.out.println("Ajout de Trou Noir effectuÃ©");
            return true;
        } else {
            System.out.println("Trou Noir deja present");
            return false;
        }
    }

    public boolean placerDesintegrateur(){
     if (desintegrateur == false) {
            desintegrateur = true;
            System.out.println("Ajout du desintegrateur effectué");
            return true;
        } else {
            System.out.println("desintegrateur deja present");
            return false;
        }
       
    } 
public boolean recupererDesintegrateur (){
 if (desintegrateur == true) {
            desintegrateur = false;
            System.out.println("Suppression du desintegrateur effectué");
            return true;
        } else {
            System.out.println("pas de desintegrateur present");
            return false;
        }   
}
public boolean activerTrouNoir(){
    if(trouNoir == true){
        jetonCourant=null; // vide la cellule
        trouNoir = false; // disparition du Trou Noir
        System.out.println("Activation du Trou Noir");
        return true;  
    }
    else{
        System.out.println("Pas de Trou Noir dans cette cellule");
        return false;
    }
}
}
