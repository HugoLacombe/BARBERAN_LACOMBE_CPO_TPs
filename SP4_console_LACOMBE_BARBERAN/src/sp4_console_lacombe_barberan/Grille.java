/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_lacombe_barberan;

/**
 *
 * @author Hugo Lacombe
 */
public class Grille {
  Cellule [][] CellulesJeu= new Cellule [6][7] ;
  
  public Grille(){
      for (int i=0;i<=6;i++){
         
          for(int j=0;j<=7;j++){
              
          
          CellulesJeu[i][j]= new Cellule();
      }
      }
  }
 public boolean ajouterJetonDansColonne(Jeton jeton, int colonne){
     for (int i=5;i>=0;i--){
          if(CellulesJeu[i][colonne].jetonCourant==null){
    
     CellulesJeu[i][colonne].jetonCourant=jeton;
     return true ;
     
 }
          
}
     return false ;
 }
}
