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
public class Carte {
    String Couleur; 
    String Symbole; 
    int Rang; 
    Carte [] Pioche = new Carte [32]; 
    public Carte(String sym, int rang){
        
        Symbole = sym;
        Rang=rang; 
    }
    public String toString(){
        String ph="Le rang de la carte est" +Rang+" le symbole est "+Symbole ;
        return ph; 
    }
    /*/
    public void InitPioche(){
        for(int i = 0; i<Pioche.length;i++){
            for(int j=0; j<8;j++){
              String  sym="Coeur";
              for(int k=7; k<=14;k++){
                Pioche[j]= new Carte(sym,j);  
              
             
                
                
            }
        }
             for(int j=8; j<16;j++){
              String  sym="Pique";
              for(int k=7; k<=14;k++){
                Pioche[j]= new Carte(sym,j);  
              
             
                
                
            }
        }
              for(int j=16; j<24;j++){
              String  sym="Trèfle";
              for(int k=7; k<=14;k++){
                Pioche[j]= new Carte(sym,j);  
              
             
                
                
            }
        }
               for(int j=24; j<32;j++){
              String  sym="Carreaux";
              for(int k=7; k<=14;k++){
                Pioche[j]= new Carte(sym,j);  
              
             
                
                
            }
        }
        
        
        
        
    }

}
/*/
}
