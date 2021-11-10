/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_relation_1_barberan_lacombe;

/**
 *
 * @author Baptiste
 */
public class TP2_relation_1_BARBERAN_LACOMBE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
Voiture uneClio = new Voiture ("Clio", "Renault", 5 ) ;
Voiture uneAutreClio = new Voiture ("Clio", "Renault", 5 ) ;
Voiture une2008 = new Voiture ("2008", "Peugeot", 6 ) ;
Voiture uneMicra = new Voiture ("Micra", "Nissan", 4 ) ;
Voiture uneFefe = new Voiture ("Ferrari", "SF 90", 5 ) ;
Voiture une911 = new Voiture ("Porsche","911 turbo S", 20);
Personne bob = new Personne("Bobby", "Sixkiller");
Personne reno = new Personne("Reno", "Raines");

System.out.println("liste des voitures disponibles "+ uneClio +
"\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra + "\n" + uneFefe) ;

bob.liste_voitures[0] = uneClio ;
bob.liste_voitures[1]= une2008;
bob.nbVoitures = 2 ;
une2008.proprietaire= bob ;
uneClio.proprietaire = bob ;

reno.liste_voitures[0]= uneFefe;
reno.liste_voitures[1]=uneMicra;
uneFefe.proprietaire=reno;
uneMicra.proprietaire=reno;
reno.nbVoitures=2;
        
System.out.println("la premiere voiture de reno est\n " +
reno.liste_voitures[0] + "et la deuxieme est\n"+ reno.liste_voitures[1]+"\nLe nombre de voiture de bob est "+bob.nbVoitures+" et de reno est "+ reno.nbVoitures );



bob.ajouter_voiture(uneFefe);
bob.ajouter_voiture(uneAutreClio);
bob.ajouter_voiture(une911);
}
}