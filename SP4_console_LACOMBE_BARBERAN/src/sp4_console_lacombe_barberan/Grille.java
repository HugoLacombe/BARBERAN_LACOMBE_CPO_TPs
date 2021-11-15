/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_lacombe_barberan;

/**
 *
 * @author Hugo Lacombe
 */
public class Grille {

    Cellule[][] CellulesJeu = new Cellule[6][7];

    public Grille() {
        for (int i = 0; i <= 6; i++) {

            for (int j = 0; j <= 7; j++) {

                CellulesJeu[i][j] = new Cellule();
            }
        }
    }

    public boolean ajouterJetonDansColonne(Jeton jeton, int colonne) {
        for (int i = 5; i >= 0; i--) {
            if (CellulesJeu[i][colonne].jetonCourant == null) {

                CellulesJeu[i][colonne].jetonCourant = jeton;
                return true;

            }

        }
        return false;// colonne pleine
    }

    public boolean etreRemplie() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                if (CellulesJeu[i][j].jetonCourant == null) {
                    return false; // pas remplie

                }

            }

        }
        return true; // remplie 

    }

    public void viderGrille() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                CellulesJeu[i][j].jetonCourant = null;
                // efface les jetons précédents 

            }

        }

    }

    /*/
    public void afficherGrilleSurConsole(){
        
    }
    /*/
    public boolean celluleOccupee(int ligne, int colonne) {
        if (CellulesJeu[ligne][colonne].jetonCourant == null) {
            return false;// pas occupée
        }
        return true;
    }

    public String lireCouleurDuJeton(int ligne, int colonne) {
        Jeton jetondelaC = CellulesJeu[ligne][colonne].jetonCourant;
        String couleur = jetondelaC.lireCouleur();
        return couleur;

    }

    public boolean etreGagnantePourJoueur(Joueur joueur1) {
        String couleurJ = joueur1.Couleur;
        int cpt = 0;
        // ligne 
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                if (couleurJ == CellulesJeu[i][j].lireCouleurDuJeton() &&
                        couleurJ == CellulesJeu[i][j + 1].lireCouleurDuJeton() &&
                        couleurJ == CellulesJeu[i][j + 2].lireCouleurDuJeton() &&
                        couleurJ == CellulesJeu[i][j + 3].lireCouleurDuJeton()) {
                    System.out.println("ligne gagnante: " + i);

                    return true; //ligne gagnante

                }

            }

        }
        //colonne
        for (int j = 0; j < 7; j++) {
            for (int i = 0; i < 3; i++) {
                if (couleurJ == CellulesJeu[i][j].lireCouleurDuJeton() &&
                        couleurJ == CellulesJeu[i + 1][j].lireCouleurDuJeton() &&
                        couleurJ == CellulesJeu[i + 2][j].lireCouleurDuJeton() &&
                        couleurJ == CellulesJeu[i + 3][j].lireCouleurDuJeton()) {
                    System.out.println("colonne gagante: " + j);
                    return true;
                }
            }
        }

        //diagonnale montante
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (couleurJ == CellulesJeu[i][j].lireCouleurDuJeton() && 
                        couleurJ == CellulesJeu[i + 1][j + 1].lireCouleurDuJeton() &&
                        couleurJ == CellulesJeu[i + 2][j + 2].lireCouleurDuJeton() &&
                        couleurJ == CellulesJeu[i + 3][j + 3].lireCouleurDuJeton()) {
                    return true;
                }
            }

        }
        //diagonale descandante 
        for (int i = 3; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                if (couleurJ == CellulesJeu[i][j].lireCouleurDuJeton() &&
                        couleurJ == CellulesJeu[i - 1][j + 1].lireCouleurDuJeton() &&
                        couleurJ == CellulesJeu[i - 2][j + 2].lireCouleurDuJeton() &
                        couleurJ == CellulesJeu[i - 3][j + 3].lireCouleurDuJeton()) {
                    return true;
                }
            }

        }
        return false;
    }


public boolean colonneRemplie(int j){
if (CellulesJeu[5][j].jetonCourant != null){
return true;
}
return false; 
}
public void tasserGrille(int ){

}

public boolean placerTrouNoir(int i, int j){ 
    
}

}

            
