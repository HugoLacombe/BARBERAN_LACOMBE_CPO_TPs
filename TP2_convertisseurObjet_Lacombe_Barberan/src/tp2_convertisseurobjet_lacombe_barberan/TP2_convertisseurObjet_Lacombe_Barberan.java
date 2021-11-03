/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_lacombe_barberan;

import java.util.Scanner;

/**
 *
 * @author Baptiste
 */
public class TP2_convertisseurObjet_Lacombe_Barberan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
       Convertisseur Conv_informatique= new Convertisseur(); //création objet de type convertisseur 
      
       
       //Formulaire :
        Scanner sc = new Scanner(System.in);
        int arret=1; // variable pour sortir du formulaire de conversions 
        Conv_informatique.Convertisseur();
        while (arret !=2){
            
        System.out.println("Bonjour, Vous rentrez dans le convertisseur de temperature  :");
        
        System.out.println("Saisissez la conversion que vous souhaiter effectuer :\n"
                + "1) De Celcius vers Kelvin\n" + "2) De Kelvin vers Celcius\n" + "3) De Franheit vers Celcius \n" + "4) De Celcius vers Farenheit\n" + "5) De Kelvin vers Farenheit\n"
                + "6) Farenheit vers Kelvin\n"+"7) Afficher le nombre de conversions\n"+"8) Arreter les converSions \n" );

        int numero = 18;

        while (numero > 8 || numero < 0) {//evite que l'utilisateur entre une valeur non compris dans les choix 
            System.out.println("Rentrez un numéro entre 1 et 8, faites votre choix");
            numero = sc.nextInt(); //numéro demandé à l'utilisateur^pour choisir son type de conversion 

        }

        switch (numero) {
            case 1:// celcius vers Kelvin 
                System.out.println("Rentrez votre temperature en celcius a convertir en Kelvin");
                double tempC = sc.nextDouble();
                double tempK = Conv_informatique.CelciusVersKelvin(tempC);
                System.out.println("la temperature converti en kelvin est " + tempK);
                break;

            case 2://convertir Kelvin vers Celcius 
                System.out.println("Rentrez votre temperature en Kelvin a convertir en Celsius");
                double tempK1 = sc.nextDouble();
                double tempC1 = Conv_informatique.KelvinVersCelcius(tempK1);
                System.out.println("la temperature converti en kelvin est " + tempC1);
                break;

            case 3://convertir Farenheit vers Celcius  
                System.out.println("Rentrez votre temperature en Farenheit a convertir en Celcius");
                double tempF1 = sc.nextDouble();
                double tempC2 = Conv_informatique.FarenheitVersCelcius(tempF1);
                System.out.println("la temperature converti en kelvin est " + tempC2);
                break;

            case 4://convertir Celcius Vers Farenheit
                System.out.println("Rentrez votre temperature en celcius a convertir en Farenheit");
                double tempC3 = sc.nextDouble();
                double tempF2 = Conv_informatique.CelciusVersFarenheit(tempC3);
                System.out.println("la temperature converti en kelvin est " + tempF2);
                break;

            case 5://Kelvin Vers Farenheit
                System.out.println("Rentrez votre temperature en Kelvin a convertir en Farenheit");
                double tempK2 = sc.nextDouble();
                double tempF3 = Conv_informatique.KelvinVersFarenheit(tempK2);
                System.out.println("la temperature converti en Farenheit est " + tempF3);
                break;

            case 6://Farenheit Vers Kelvin
                System.out.println("Rentrez votre temperature en Farenheit a convertir en Kelvin");
                double tempF4 = sc.nextDouble();
                double tempK3 = Conv_informatique.FarenheitVersKelvin(tempF4);//conversion de celcius vers farenheit
                System.out.println("la temperature converti en kelvin est " + tempK3);
                break;

            case 7:// afficher nombre de conversions 
                 System.out.println(Conv_informatique.toString ());
                break;
           
            case 8: // arreter les conversions 
                arret=2;
                break;
        }
        
   }
    
}
}
