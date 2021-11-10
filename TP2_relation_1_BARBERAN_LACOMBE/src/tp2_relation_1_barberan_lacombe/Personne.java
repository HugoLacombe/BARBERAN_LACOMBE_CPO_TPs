/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_barberan_lacombe;

/**
 *
 * @author Baptiste
 */
public class Personne {
    
    String nom ;
    String prenom;
    
    public Personne(String Unnom,String Unprenom ){//Constructeur 
        nom= Unnom;
        prenom=Unprenom;
    }
    @Override
    public String toString () {// methode affichage 
 return "Le nom est "+nom+"\nLe prénom est"+prenom;
}
    //public String Personne(String nom1, String prenom1  ); // s'appuyer sur bouteille biere pour faire constructeur 
    
}

