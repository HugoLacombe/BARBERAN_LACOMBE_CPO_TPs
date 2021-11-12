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
    int nbVoitures ;
    Voiture [] liste_voitures ;
    
    public Personne(String Unnom,String Unprenom ){//Constructeur 
        nom= Unnom;
        prenom=Unprenom;
        liste_voitures = new Voiture [3] ;
        nbVoitures=0 ;
    }
    public boolean ajouter_voiture( Voiture voiture_a_ajouter) {
        if (voiture_a_ajouter.proprietaire!=null){
            System.out.println("Voiture volé elle appartient déjà à quelqu'un ");
            return false;}
            
        else if (nbVoitures==3){
            System.out.println("Trop de voiture ");
        return false ;
        }
       liste_voitures[nbVoitures]=voiture_a_ajouter;
       nbVoitures+=1;
       voiture_a_ajouter.proprietaire = this ;
       System.out.println("La voiture ajouté est : "+voiture_a_ajouter);
// cela dit à la voiture que l'objet qui utilise la methode ajouter_voiture est son proprietaire  
       return true ; 
    }
    
    @Override
    public String toString () {// methode affichage 
 return "Le nom est "+nom+"et le prénom est"+prenom;
}
    //public String Personne(String nom1, String prenom1  ); // s'appuyer sur bouteille biere pour faire constructeur 
    
}

