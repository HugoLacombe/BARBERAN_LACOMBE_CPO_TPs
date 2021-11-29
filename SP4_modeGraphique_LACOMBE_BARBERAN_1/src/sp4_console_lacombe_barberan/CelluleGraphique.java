/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_lacombe_barberan;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Baptiste
 */
public class CelluleGraphique extends JButton {
  Cellule celluleAssociee;
  ImageIcon img_vide= new javax.swing.ImageIcon(getClass().getResource("/images/celluleVide.png"));
  
  
  public CelluleGraphique(Cellule uneCellule){
      celluleAssociee=uneCellule;
  }

    
    @Override
  public void paintComponent (Graphics G){
      super.paintComponent(G);
      setIcon(img_vide);// on attribue l'image cellulevide
  }
  
}
