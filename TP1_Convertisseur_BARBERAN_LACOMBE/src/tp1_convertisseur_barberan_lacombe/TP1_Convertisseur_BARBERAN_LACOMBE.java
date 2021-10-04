
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
    
    //Formulaire :
    
    int numero=0;
    while(numero>6 && numero<0){
      System.out.println("Rentrez un numéro entre 1 et 6 faites votre choix");    
      numero= sc.nextInt(); //valeur est demandé à l'utilisateur
    }
    switch (numero){
            case 1:// celcius ver Kelvin 
    double tempC=sc.nextDouble();
    double tempK=CelciusVersKelvin(tempC);
    System.out.println("la temperature converti en kelvin est "+tempK);
            
            case 2://convertir Kelvin vers Celcius  
    double tempK1=sc.nextDouble();
    double tempC1=KelvinVersCelcius(tempK1);
    System.out.println("la temperature converti en kelvin est "+tempC1);
    
            case 3://convertir Farenheit vers Celcius  
                
    double tempF1=sc.nextDouble();
    double tempC2=KelvinVersCelcius(tempF1);
    System.out.println("la temperature converti en kelvin est "+tempC2);
    
            case 4://convertir 
                    
    
    
    
    
    
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
public static double KelvinVersFarenheit(double tempKelvin){
    double a=KelvinVersCelcius(tempKelvin);   
     a=CelciusVersFarenheit(a);
     return a ;
    
}
}