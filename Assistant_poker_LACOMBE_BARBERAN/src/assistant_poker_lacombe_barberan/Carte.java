/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assistant_poker_lacombe_barberan;

/**
 *
 * @author 
 * 
 */
public class Carte implements java.lang.Comparable<Carte> {
    String Couleur; 
    String Symbole; 
    int Rang; 
    Carte [] Pioche = new Carte [32]; 
    public Carte(String sym, int rang){
        
        Symbole = sym;
        Rang=rang; 
    }
    
    @Override
    public int compareTo (Carte cartec){
        if (cartec.Rang > this.Rang) return -1;
        if (cartec.Rang< this.Rang) return 1 ;
        return 0;
    }
    @Override 
    public String toString(){
        return "Carte{ couleur=" + Symbole + ", rang="+ Rang +"}";
    }
        
      
}
