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
 
 @Override
 public String toString () {// methode affichage 
 return "Le modele est "+Modele+"\nLa marque est"+Marque+"\n La puissance est "+PuissanceCV  ;
}
}
