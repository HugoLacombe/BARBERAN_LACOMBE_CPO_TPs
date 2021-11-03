/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_lacombe_barberan;

/**
 *
 * @author 33695
 */
public class TP2_manip_LACOMBE_BARBERAN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tartiflette assiette1 = new Tartiflette(500) ;
        Tartiflette assiette2 = new Tartiflette(600) ;
        Tartiflette assiette3 = assiette2 ; 
        
       System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories) ;
System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories) ;
// Les deux objets possèdent le même nombre de calories 
System.out.println(assiette3);
System.out.println(assiette2);
// On remarque que assiette 2 et 3 ont la même référence, référence le même objet  
assiette2.nbCalories=200;
System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories) ;
System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories) ;
// En modifiant la valeur d'assiette 2 on modifie celle d'assiette 3 => même objet 
assiette3.nbCalories=100;
System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories) ;
System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories) ;

// on intervertit la référence des objets assiette1 et 2
System.out.println("On intervertit la référence d'assiette1 et 2 :");
Tartiflette temp = new Tartiflette(0);
temp=assiette2;
assiette2=assiette1;
assiette1=temp;
System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories) ;
System.out.println("nb de calories de Assiette 1 : " + assiette1.nbCalories) ;

/*/
Moussaka assiette666 = assiette1 ;
Moussaka assiette667 = new Tartiflette(1) ;
/*/
// Ces deux lignes sont fausses, une référence objet qui annonce référencer un type d’objet
//ne peut pas en référencer un autre qui n’a aucun rapport 

String [] tab =new String[10]; 
for (int i=0;i<10;i++){
tab[i]="Moussaka plat ";
}
for (int i=0;i<10;i++){
tab[i]+i=new Moussaka(100);
}
    }
    
}
