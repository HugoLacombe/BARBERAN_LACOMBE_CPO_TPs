/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_barberan_lacombe;

/**
 *
 * @author Baptiste
 */
public class Voiture {
 String Modele;
 String Marque;
 int PuissanceCV;
 Personne proprietaire ;
  public Voiture(String UnModele,String UneMarque,int UnePuissanceCV ){ //Constructeur 
        Modele= UnModele;
        Marque=UneMarque;
        PuissanceCV =UnePuissanceCV;
        proprietaire=null;
    }
  
 @Override
 public String toString () {// methode affichage 
 return "\nmodele: "+Modele+"\nmarque: "+Marque+"\npuissance: "+PuissanceCV+" CV"+"\n"  ;
}
}
