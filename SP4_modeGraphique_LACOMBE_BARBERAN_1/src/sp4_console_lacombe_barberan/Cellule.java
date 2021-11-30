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
        jetonCourant = null;// initialise la valeur du jeton 
        trouNoir = false;
        desintegrateur = false;
    }

    public boolean affecterJeton(Jeton Jeton) { // affecte le jeton en paramètre ou retourne faux si cellule pleine 
        if (jetonCourant == null) {

            jetonCourant = Jeton; 

            activerTrouNoir();

            return true;

        } else {
            System.out.print("Cellule occupé ");
            return false;
        }
    }

    /**
     *
     * @return couleur du jeton en argument 
     * ou vide si il n'y a pas de jeton 
     */
    public String lireCouleurDuJeton() {
        if (jetonCourant == null) {
            return "vide";
        } else {
            return jetonCourant.lireCouleur();
        }
    }

    /**
     * @return jetoncourant
     */
    public Jeton recupererJeton() {
     
                
    
        return jetonCourant;
    }
    
    /**
     *verif si il y un jeton false 
     * sinon suppr le jeton true 
     * @return boolean 
     */
    public boolean supprimerJeton() {
        if (jetonCourant == null) {
          //  System.out.print("Jeton innexistant ");
            return false;
        } else {
            jetonCourant = null;
            return true;
        }
    }

    /**
     *place un trou noir dans la cellule  si il y en a pas true 
     * sinon false 
     * @return boolean 
     */
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

    /**
     *place un desintegrateur dans la cellule  si il y en a pas true 
     * sinon false 
     * @return boolean
     */
    public boolean placerDesintegrateur() {
        if (desintegrateur == false) {
            desintegrateur = true;
            System.out.println("Ajout du desintegrateur effectué");
            return true;
        } else {
            System.out.println("desintegrateur deja present");
            return false;
        }

    }

    /**
     *verif si il y un trou noir
     * @return boolean
     */
    public boolean presenceTrouNoir() {
        if (trouNoir == false) {
            return false;
        } else {
            return true;
        }
    }

    /**
     *Indique la prence desintegrateur 
     * @return boolean
     */
    public boolean presenceDesintegrateur() {
        if (desintegrateur == false) {
            return false;
        } else {
            return true;
        }
    }

    /**
     *si desinte supprime true 
     * sinon false
     * @return boolean 
     */
    public boolean recupererDesintegrateur() {
        if (desintegrateur == true) {
            desintegrateur = false;
            System.out.println("Suppression du desintegrateur effectué");
            return true;
        } else {
            System.out.println("pas de desintegrateur present");
            return false;
        }
    }

    /**
     *si trou noir est la suppr jeton de la cellule et met trou noir en false et renvoie true 
     * sinon renvoie false 
     * @return boolran
     */
    public boolean activerTrouNoir() {
        if (trouNoir == true) {
            jetonCourant = null; // vide la cellule
            trouNoir = false; // disparition du Trou Noir
            System.out.println("Activation du Trou Noir");
            return true;
        } else {
            System.out.println("Pas de Trou Noir dans cette cellule");
            return false;
        }
    }
}
