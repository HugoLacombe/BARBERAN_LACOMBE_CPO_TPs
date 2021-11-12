/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_lacombe_barberan;

/**
 *
 * @author Hugo.L
 */
public class Joueur {
    String Nom;
    String Couleur;
    Jeton [] ListeJetons =new Jeton[21];
    int nombreDesintegrateurs ; 
    int nombreJetonsRestants;
    
    public Joueur(String nom){
        Nom=nom; 
        
    }
    public void affecterCouleur(String couleur){
        Couleur = couleur; 
        
        
    }
    public boolean ajouterJeton(Jeton jeton){
        
    
        for(int i=0;i<=20;i++){
            if(ListeJetons[i]==null){
                ListeJetons[i]=jeton;
                return true;//
                
            }
           
            }
        return false; 
        }
    public void obtenirDesintegrateur(){
        nombreDesintegrateurs+=1;
    }
    public boolean utiliserDeseintegrateur(){
        if (nombreDesintegrateurs>0){
            nombreDesintegrateurs-=1;
            return true;
        }
        
        return false;
    }
    
    
        
    }
       

    


