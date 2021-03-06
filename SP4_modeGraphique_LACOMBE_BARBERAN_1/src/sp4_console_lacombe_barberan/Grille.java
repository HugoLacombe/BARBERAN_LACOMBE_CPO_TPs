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
        for (int i = 0; i < 6; i++) {

            for (int j = 0; j < 7; j++) {

                CellulesJeu[i][j] = new Cellule();
            }
        }
    }

    public boolean ajouterJetonDansColonne(Jeton jeton, int colonne) {
        for (int i = 5; i >= 0; i--) {
            /*/
            if (CellulesJeu[i][colonne].jetonCourant == null) {

                CellulesJeu[i][colonne].jetonCourant = jeton;
                return true;

            }

        }
        return false;// colonne pleine
            /*/
            if (CellulesJeu[i][colonne].affecterJeton(jeton) == true) {
                return true;
            }
        }
        return false;
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
                if (couleurJ == CellulesJeu[i][j].lireCouleurDuJeton()
                        && couleurJ == CellulesJeu[i][j + 1].lireCouleurDuJeton()
                        && couleurJ == CellulesJeu[i][j + 2].lireCouleurDuJeton()
                        && couleurJ == CellulesJeu[i][j + 3].lireCouleurDuJeton()) {
                   // System.out.println("ligne gagnante: " + i +joueur1.Nom);  

                    return true; //ligne gagnante

                }

            }

        }
        //colonne
        for (int j = 0; j < 7; j++) {
            for (int i = 0; i < 3; i++) {
                if (couleurJ == CellulesJeu[i][j].lireCouleurDuJeton()
                        && couleurJ == CellulesJeu[i + 1][j].lireCouleurDuJeton()
                        && couleurJ == CellulesJeu[i + 2][j].lireCouleurDuJeton()
                        && couleurJ == CellulesJeu[i + 3][j].lireCouleurDuJeton()) {
                    //System.out.println("colonne gagante: " + j+joueur1.Nom);
                    return true;
                }
            }
        }

        //diagonnale montante
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (couleurJ == CellulesJeu[i][j].lireCouleurDuJeton()
                        && couleurJ == CellulesJeu[i + 1][j + 1].lireCouleurDuJeton()
                        && couleurJ == CellulesJeu[i + 2][j + 2].lireCouleurDuJeton()
                        && couleurJ == CellulesJeu[i + 3][j + 3].lireCouleurDuJeton()) {
                    return true;
                }
            }

        }
        //diagonale descandante 
        for (int i = 3; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                if (couleurJ == CellulesJeu[i][j].lireCouleurDuJeton()
                        && couleurJ == CellulesJeu[i - 1][j + 1].lireCouleurDuJeton()
                        && couleurJ == CellulesJeu[i - 2][j + 2].lireCouleurDuJeton()
                        & couleurJ == CellulesJeu[i - 3][j + 3].lireCouleurDuJeton()) {
                    return true;
                }
            }

        }
        return false;
    }

    public boolean colonneRemplie(int j) {
        if (CellulesJeu[0][j].jetonCourant != null) {
            return true;
        }
        return false;
    }

    public void afficherGrilleSurConsole() {
        

        for (int i = 0; i < 6; i++) {

            for (int j = 0; j < 7; j++) {
                // System.out.println("_ _ _ _ _ _");
                String Couleur; 
                
                if (CellulesJeu[i][j].lireCouleurDuJeton() != "vide") {
                    Couleur = CellulesJeu[i][j].jetonCourant.lireCouleur();

                    if (Couleur == "rouge") {
                        if (j == 0) {
                            System.out.print("| R |");
                        } else {
                            System.out.print(" R |");
                        }

                    }
                    if (Couleur == "jaune") {
                        if (j == 0) {
                            System.out.print("| J |");
                        } else {
                            System.out.print(" J |");
                        }

                    }
                } if ((CellulesJeu[i][j].lireCouleurDuJeton() == "vide")&&(CellulesJeu[i][j].desintegrateur!=true)&&(CellulesJeu[i][j].trouNoir!=true)   ){
                    if (j == 0) {
                        System.out.print("| - |");
                    } else {
                        System.out.print(" - |");
                    }
                }
                
                if ((CellulesJeu[i][j].lireCouleurDuJeton() == "vide") &&(CellulesJeu[i][j].desintegrateur==true)&& (CellulesJeu[i][j].trouNoir!=true)) {
                        
                    
                    if (j == 0) {
                        System.out.print("| D |");
                    } else {
                        System.out.print(" D |");
                    }
                }

                if ((CellulesJeu[i][j].lireCouleurDuJeton() == "vide") &&(CellulesJeu[i][j].trouNoir==true)) {
                        
                    
                    if (j == 0) {
                        System.out.print("| N |");
                    } else {
                        System.out.print(" N |");
                    }
                }
            }
            System.out.println();
        }

    }

    public boolean placerTrouNoir(int i, int j) {

        if (CellulesJeu[i][j].trouNoir == false) {
            CellulesJeu[i][j].trouNoir = true;
            return true;

        }
        return false;
    }

    public boolean placerDesintegrateur(int i, int j) {
        if (CellulesJeu[i][j].desintegrateur == false) {
            CellulesJeu[i][j].desintegrateur = true;
            return true;

        }
        return false;

    }

    public boolean supprimerJeton(int i, int j) {
        if (CellulesJeu[i][j].jetonCourant != null) {
            CellulesJeu[i][j].jetonCourant = null;
            return true;
        }
        return false;
    }

    public boolean ligneDesin(int colonne) {
        int ligne =0;
        
        for (int i = 0; i <=5; i++) {

            if (CellulesJeu[i][colonne].jetonCourant == null) {

               ligne = i+1; //ligne ou se trouve le desintegrateur
               

            }
        }
        System.out.println(ligne);
        

        if (CellulesJeu[ligne][colonne].desintegrateur == true) {
            //System.out.println("LA FCT RENVOIE TRUE");
            CellulesJeu[ligne][colonne].desintegrateur =false; 
            return true;//verifie si il y a un desintegrateur 
        }

        return false;
    }

    public Jeton recupererJeton(int i, int j) {

        Jeton jetonvise;
        jetonvise = CellulesJeu[i][j].jetonCourant;
        CellulesJeu[i][j].jetonCourant = null;
        return jetonvise;

    }

    public void tasserGrille(int j) {

        for (int i = 5; i >=1; i--) {

            if (CellulesJeu[i][j].jetonCourant == null ) {

                CellulesJeu[i][j].jetonCourant = CellulesJeu[i -1][j].jetonCourant;

                CellulesJeu[i -1][j].jetonCourant = null;
                
                
         


            }

        }

    }
    public void tasserGrillecomplet(){
        for(int i=0; i<7; i++){
            tasserGrille(i);
        }
    } 

}
