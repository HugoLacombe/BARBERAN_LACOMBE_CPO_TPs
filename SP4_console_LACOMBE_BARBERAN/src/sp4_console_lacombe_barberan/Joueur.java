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
    // vict attribut qui indique si le joeur possède une ligne/ diag/ colonne gagnante 
    boolean Vict; 
    String Nom;
    String Couleur;
    Jeton [] ListeJetons =new Jeton[21];
    int nombreDesintegrateurs ; 
    int nombreJetonsRestants;
    // contructeur 
    public Joueur(String nom){
        Nom=nom; 
        nombreJetonsRestants=21; 
        Vict=false; 
        
    }

    /**
     *renvoie la couleur en argument et l'associe au joueur
     * @param couleur
     */
    public void affecterCouleur(String couleur){
        Couleur = couleur; 
        
        
    }

    /**
     *Ajoute le jeton en argument dans la liste de jeton du joueurs dans une case vide 
     * @param jeton
     * @return
     */
    public boolean ajouterJeton(Jeton jeton){
        
    
        for(int i=0;i<=20;i++){
            if(ListeJetons[i]==null){
                ListeJetons[i]=jeton;
                
                
                return true;//
                
            }
           
            }
        return false; 
        }
    
    /**
     *incremente le nombre de desintegrateur du joueur 
     */
    public void obtenirDesintegrateur(){
        nombreDesintegrateurs+=1;
    }

    /**
     *incremente le nombre de desintegarteur si il en possede 
     * @return boolean
     */
    public boolean utiliserDeseintegrateur(){
        if (nombreDesintegrateurs>0){
            nombreDesintegrateurs-=1;
            return true;
        }
        
        return false;
    }
    
    
        
    }
       

    


