/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_lacombe_barberan;

/**
 *
 * @author Baptiste
 */
public class Convertisseur {

int nbConversions    ; // création modele 
     
    
public  Convertisseur () { //methode convertisseur 
 nbConversions = 0 ;
}

@Override
public String toString () {// methode affichage 
 return "nb de conversions"+ nbConversions;
}

    public double CelciusVersKelvin(double tempCelcius) {
        double a = (tempCelcius + 273.5);
        return (a);
    }
    public double KelvinVersCelcius(double tempKelvin) {
        double a = (tempKelvin - 273.5);
        return (a);
    }

    public  double FarenheitVersCelcius(double tempFarenheit) {
        double a = (tempFarenheit - 32.0) / 1.8;
        return (a);
    }

    public double CelciusVersFarenheit(double tempCelcius) {
        double a = (tempCelcius * 1.8) + 32;
        return (a);
    }

    public double KelvinVersFarenheit(double tempKelvin) {
        double a = KelvinVersCelcius(tempKelvin);
        a = CelciusVersFarenheit(a);
        return a;

    }

    public double FarenheitVersKelvin(double tempFarenheit) {
        double a = FarenheitVersCelcius(tempFarenheit);
        a = CelciusVersKelvin(a);
        return a;
    }


}

