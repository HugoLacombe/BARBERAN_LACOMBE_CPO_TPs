/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombresint;

import java.util.Scanner;

/**
 *EXO 1
 * @author HugoLACOMBE;BaptisteBArberan
 */
public class TP1_manipNombresInt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
int entier1 =0 ;
int entier2= 0 ;
Scanner sc=new Scanner(System.in);
// Scanner=> module pour récupérer les données uti + créé un espace de stockage 
System.out.println("Rentrez deux entiers");
entier1= sc.nextInt(); 
System.out.println("Deuxième entier");
entier2= sc.nextInt();
//Saissie des deux nombres
System.out.println(" La somme est "+(entier1+entier2));
System.out.println(" La différence du premier entier et du deuxième est "+(entier1-entier2));
System.out.println(" La multiplication des deux nombres est "+(entier1*entier2));
System.out.println(" La division des deux chiffres est "+(entier1/entier2));
System.out.println(" Le reste de la division euclidienne de l'entier 1 par l'entier 2  est "+(entier1%entier2));
    }

    }   
