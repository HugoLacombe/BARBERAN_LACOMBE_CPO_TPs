/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_lacombe_barberan;

/**
 *
 * @author Hugo
 */
public class Jeton {
    String Couleur;
    
    /**
     *afecte la couleur en argument au jeton 
     * @param unecouleur string 
     */
    public Jeton(String unecouleur){
        Couleur=unecouleur; 
    
    }
    
    /**
     *
     * @return couleur du joueur 
     */
    public String lireCouleur(){
        return Couleur;
    }
    
}
