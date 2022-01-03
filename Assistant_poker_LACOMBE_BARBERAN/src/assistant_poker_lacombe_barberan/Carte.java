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

    int Rang;
   
// constructeur de la class Carte
    public Carte(String coul, int rang) {

        Couleur = coul;
        Rang = rang;
    }

    // méthode compareTo qui nous permet d'établir une hiéararchie entre les objets Carte par rapport à leur rang
    @Override
    public int compareTo(Carte cartec) {
        if (cartec.Rang > this.Rang) {
            return -1;
        }
        if (cartec.Rang < this.Rang) {
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Carte{ couleur=" + Couleur + ", rang=" + Rang + "}";
    }

}
