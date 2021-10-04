
package tp1_convertisseur_barberan_lacombe;

import java.util.Scanner;

/**
 *
 * @author Baptiste Hugo
 * TP1 Exercice 2 
 */
public class TP1_Convertisseur_BARBERAN_LACOMBE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        double valeur =0 ;
    Scanner sc=new Scanner(System.in);
    // Scanner=> module pour récupérer les données uti + créé un espace de stockage 
    System.out.println("Rentrez votre temperature en celcius");
    valeur= sc.nextDouble(); //valeur est demandé à l'utilisateur est la temp en celcius
    System.out.println("la temperature converti en kelvin est "+ (valeur + 273.5));
   
    //deuxieme methode pour convertir la temp avec la fonction 
    double tempC=sc.nextDouble();
    double tempK=CelciusVersKelvin(tempC);
    System.out.println("la temperature converti en kelvin est "+tempK);
    }
    
    
    // fonctions de conversion de temperatures 
   public static double CelciusVersKelvin(double tempCelcius){
       double a = (tempCelcius+273.5);
        return(a);
   }
   public static double KelvinVersCelcius(double tempKelvin){
    double a= (tempKelvin- 273.5);
    return (a);
}
public static double FarenheitVersCelcius(double tempFarenheit	){
 double a= (tempFarenheit- 32.0)/1.8;
    return (a);   
}

public static double CelciusVersFarenheit(double tempCelcius){
double a= (tempCelcius*1.8)+32;
    return (a);   
}
}