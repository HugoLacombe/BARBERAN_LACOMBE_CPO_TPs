/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sp4_console_lacombe_barberan;

import java.util.Random;

/**
 *
 * @author Baptiste
 */
public class FenetreDeJeu extends javax.swing.JFrame {

    Joueur[] ListeJoueurs = new Joueur[2];
    Joueur joueurCourant;
    Grille grillejeu = new Grille();

    public FenetreDeJeu() { //fenetre principale du jeu 
        initComponents();
        
        Panneau_Info_Joueur.setVisible(false); //cache les panneaux infos
        Panneau_Info_Partie.setVisible(false);

                  
        for (int i = 0; i < 6; i++) {

            for (int j = 0; j < 7; j++) {

                CelluleGraphique cellGraph = new CelluleGraphique(grillejeu.CellulesJeu[i][j]);//mise en relation 
                cellGraph.addActionListener(new java.awt.event.ActionListener() { //enregisteur action sur la cellule 
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        message.setText("Un bouton a été cliqué"); //affichage message dans la box d'affichage message
                        Cellule c = cellGraph.celluleAssociee; 
                        if (c.jetonCourant == null) {   //si clique sur case vide 
                            return;

                        }
                        if (c.jetonCourant.Couleur.equals(joueurCourant.Couleur)) { // si joueur clique sur une case avec un jeton de sa couleur
                            message.setText("Le joueur : " + joueurCourant.Nom + "récupère un de ses jetons"); //affichage texte
                            Jeton jrecup = c.recupererJeton(); //recupere le jeton 
                            c.supprimerJeton(); //suprime le jeton de la grille 
                            joueurCourant.ajouterJeton(jrecup); // remet le jeton dans la liste des jetons de celui qui le recupere 
                            
                            
                            
                            joueurSuivant(); // change de tour 

                        } else {
                            if (joueurCourant.nombreDesintegrateurs >= 1) { // verif si ilpossede desintegrateur 
                                message.setText("Le joueur : " + joueurCourant.Nom + " désintégre un des jetons adverses"); //affichage text 
                                c.supprimerJeton(); //supr jeton 
                                joueurCourant.utiliserDeseintegrateur(); //suppr un jeton adverse 
                                Panneau_Grille.repaint(); //refresh de l'affichage 
                                
                                joueurSuivant();// passage tour d'apres 

                            } else {
                                return; 
                            }

                        }
                        grillejeu.tasserGrillecomplet();// met a jour la rille en faisant tomber tous les jetons au plus bas 
                        Panneau_Grille.repaint(); //refresh affichage 
                        lbl_j1_desint.setText(ListeJoueurs[0].nombreDesintegrateurs + "");//affiche le nbr de desintegrateur du J1 dans l'affichage info Joueur
                        lbl_j2_desint.setText(ListeJoueurs[1].nombreDesintegrateurs + "");//affiche le nbr de desintegrateur du J2 dans l'affichage info joueur

                        ListeJoueurs[0].Vict = grillejeu.etreGagnantePourJoueur(ListeJoueurs[0]);//met dans l'argument vict du J1 si il a gagné avec un booleen
                        ListeJoueurs[1].Vict = grillejeu.etreGagnantePourJoueur(ListeJoueurs[1]);// meme chose J2
                        if (ListeJoueurs[0].Vict && !ListeJoueurs[1].Vict) {// verif J1 gagne 
                            message.setText("Victoire de " + ListeJoueurs[0].Nom);
                           
                        }
                        if (ListeJoueurs[1].Vict && !ListeJoueurs[0].Vict) {//verif J2 gagne
                            message.setText("Victoire de " + ListeJoueurs[1].Nom); 
                            
                        }
                        if (ListeJoueurs[0].Vict && ListeJoueurs[1].Vict) {//verif si un joueur fait une faute en faisant gagner les 2joueurs
                            if (joueurCourant == ListeJoueurs[0]) {
                                message.setText("Victoire de " + ListeJoueurs[1].Nom + " par la faute de jeu de " + ListeJoueurs[0].Nom);
                            } else {
                                message.setText("Victoire de " + ListeJoueurs[0].Nom + " par la faute de jeu de " + ListeJoueurs[1].Nom);
                            }
                            
                       }
                        if (ListeJoueurs[0].nombreJetonsRestants==0||ListeJoueurs[1].nombreJetonsRestants==0){// verif si les joeurs ont plus de jetons 
                            message.setText(" Un des joueurs ne possedent plus de jetons " + ListeJoueurs[1].Nom);
                        }

                    }

                });
                Panneau_Grille.add(cellGraph);// 

            }
        }
    
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panneau_Grille = new javax.swing.JPanel();
        Panneau_Création_Partie = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nom_joueur2 = new javax.swing.JTextField();
        nom_joueur1 = new javax.swing.JTextField();
        btn_start = new javax.swing.JButton();
        Panneau_Info_Joueur = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lbl_j1_nom = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lb_j1_couleur = new javax.swing.JLabel();
        lbl_j1_desint = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lb_j2_couleur = new javax.swing.JLabel();
        lbl_j2_desint = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lbl_j2_nom = new javax.swing.JLabel();
        Panneau_Info_Partie = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lbl_jcourant = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        message = new javax.swing.JTextArea();
        jSlider1 = new javax.swing.JSlider();
        jSlider2 = new javax.swing.JSlider();
        btn_col_0 = new javax.swing.JButton();
        btn_col_1 = new javax.swing.JButton();
        btn_col_2 = new javax.swing.JButton();
        btn_col_3 = new javax.swing.JButton();
        btn_col_4 = new javax.swing.JButton();
        btn_col_5 = new javax.swing.JButton();
        btn_col_6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panneau_Grille.setBackground(new java.awt.Color(255, 255, 255));
        Panneau_Grille.setLayout(new java.awt.GridLayout(6, 7));
        getContentPane().add(Panneau_Grille, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 672, 576));

        Panneau_Création_Partie.setBackground(new java.awt.Color(153, 153, 153));
        Panneau_Création_Partie.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nom Joueur 2 :");
        Panneau_Création_Partie.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, 20));

        jLabel2.setText("Nom Joueur 1 :");
        Panneau_Création_Partie.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 20));

        nom_joueur2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nom_joueur2ActionPerformed(evt);
            }
        });
        Panneau_Création_Partie.add(nom_joueur2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 80, -1));

        nom_joueur1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nom_joueur1ActionPerformed(evt);
            }
        });
        Panneau_Création_Partie.add(nom_joueur1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 80, -1));

        btn_start.setText("Démarrer Partie");
        btn_start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_startActionPerformed(evt);
            }
        });
        Panneau_Création_Partie.add(btn_start, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 120, 30));

        getContentPane().add(Panneau_Création_Partie, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 40, 280, 120));

        Panneau_Info_Joueur.setBackground(new java.awt.Color(153, 153, 153));
        Panneau_Info_Joueur.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Panneau_Info_Joueur.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        lbl_j1_nom.setText("NomJoueur1");
        Panneau_Info_Joueur.add(lbl_j1_nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 90, 20));

        jLabel6.setText("Désintegrateurs :");
        Panneau_Info_Joueur.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 100, -1));

        jLabel7.setText("Couleur :");
        Panneau_Info_Joueur.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 60, -1));

        jLabel8.setText("Joueur 1 :");
        Panneau_Info_Joueur.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 60, 20));

        lb_j1_couleur.setText("CouleurJoueur1");
        Panneau_Info_Joueur.add(lb_j1_couleur, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 90, 20));

        lbl_j1_desint.setText("nbdesintJoueur1");
        Panneau_Info_Joueur.add(lbl_j1_desint, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 90, 20));
        Panneau_Info_Joueur.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 250, 10));

        jLabel9.setText("Désintegrateurs :");
        Panneau_Info_Joueur.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 100, -1));

        jLabel10.setText("Couleur :");
        Panneau_Info_Joueur.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 60, -1));

        lb_j2_couleur.setText("CouleurJoueur2");
        Panneau_Info_Joueur.add(lb_j2_couleur, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 90, 20));

        lbl_j2_desint.setText("nbdesintJoueur2");
        Panneau_Info_Joueur.add(lbl_j2_desint, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 100, 20));

        jLabel5.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N
        jLabel5.setText("Infos joueurs");
        Panneau_Info_Joueur.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel12.setText("Joueur 2 :");
        Panneau_Info_Joueur.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 60, 20));

        lbl_j2_nom.setText("NomJoueur2");
        Panneau_Info_Joueur.add(lbl_j2_nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 90, 20));

        getContentPane().add(Panneau_Info_Joueur, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 180, 280, 260));

        Panneau_Info_Partie.setBackground(new java.awt.Color(153, 153, 153));
        Panneau_Info_Partie.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N
        jLabel3.setText("Infos jeu");
        Panneau_Info_Partie.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel11.setText("Joueur Courant :");
        Panneau_Info_Partie.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 100, 20));

        lbl_jcourant.setText("NomJoueur");
        Panneau_Info_Partie.add(lbl_jcourant, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 90, 20));

        message.setColumns(20);
        message.setRows(5);
        jScrollPane1.setViewportView(message);

        Panneau_Info_Partie.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 280, 110));
        Panneau_Info_Partie.add(jSlider1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));
        Panneau_Info_Partie.add(jSlider2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        getContentPane().add(Panneau_Info_Partie, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 470, 280, 190));

        btn_col_0.setText("1");
        btn_col_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_0ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        btn_col_1.setText("2");
        btn_col_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 10, -1, -1));

        btn_col_2.setText("3");
        btn_col_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 10, -1, 20));

        btn_col_3.setText("4");
        btn_col_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 10, -1, -1));

        btn_col_4.setText("5");
        btn_col_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 10, -1, -1));

        btn_col_5.setText("6");
        btn_col_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_5ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, -1, -1));

        btn_col_6.setText("7");
        btn_col_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_6ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(646, 10, -1, -1));

        setBounds(0, 0, 1046, 704);
    }// </editor-fold>//GEN-END:initComponents

    private void nom_joueur2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nom_joueur2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nom_joueur2ActionPerformed

    private void nom_joueur1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nom_joueur1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nom_joueur1ActionPerformed

    private void btn_startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_startActionPerformed
        Panneau_Info_Joueur.setVisible(true);// rend le panneau Info Joueur visible
        Panneau_Info_Partie.setVisible(true);//meme chose panneau Info partie 
        initialiserPartie(); // utilise la methode qui initialise tt et cree des jetons ...
        Panneau_Grille.repaint(); //refresh de l'affichage
        btn_start.setEnabled(false); // desactivation du bouton start 

// TODO add your handling code here:
    }//GEN-LAST:event_btn_startActionPerformed

    private void btn_col_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_0ActionPerformed
        // TODO add your handling code here:

        joueurDansColonne(0);
        if (grillejeu.colonneRemplie(0) == true) {// si colonne remplie desactive le bouton
            btn_col_0.setEnabled(false);
        }
        joueurSuivant();
    }//GEN-LAST:event_btn_col_0ActionPerformed

    private void btn_col_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_2ActionPerformed
        // TODO add your handling code here:

        joueurDansColonne(2);
        if (grillejeu.colonneRemplie(2) == true) {
            btn_col_2.setEnabled(false);
        }
        
        joueurSuivant();
    }//GEN-LAST:event_btn_col_2ActionPerformed

    private void btn_col_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_1ActionPerformed
        // TODO add your handling code here:

        joueurDansColonne(1);
        if (grillejeu.colonneRemplie(1) == true) {
            btn_col_1.setEnabled(false);
        }
        joueurSuivant();
    }//GEN-LAST:event_btn_col_1ActionPerformed

    private void btn_col_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_3ActionPerformed
        // TODO add your handling code here:

        joueurDansColonne(3);
        if (grillejeu.colonneRemplie(3) == true) {
            btn_col_3.setEnabled(false);
        }
        joueurSuivant();
    }//GEN-LAST:event_btn_col_3ActionPerformed

    private void btn_col_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_4ActionPerformed
        // TODO add your handling code here:

        joueurDansColonne(4);
        if (grillejeu.colonneRemplie(4) == true) {
            btn_col_4.setEnabled(false);
        }
        joueurSuivant();
    }//GEN-LAST:event_btn_col_4ActionPerformed

    private void btn_col_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_5ActionPerformed
        // TODO add your handling code here:

        joueurDansColonne(5);
        if (grillejeu.colonneRemplie(5) == true) {
            btn_col_5.setEnabled(false);
        }
        joueurSuivant();
    }//GEN-LAST:event_btn_col_5ActionPerformed

    private void btn_col_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_6ActionPerformed
        // TODO add your handling code here:

        joueurDansColonne(6);
        if (grillejeu.colonneRemplie(6) == true) {
            btn_col_6.setEnabled(false);
        }
        joueurSuivant();
    }//GEN-LAST:event_btn_col_6ActionPerformed
    public boolean joueurDansColonne(int indice_colonne) {
        Panneau_Grille.repaint();
        // variable qui confirme si le jeton est bien placé
        if (grillejeu.colonneRemplie(indice_colonne) != true) {
               
            // ajoute un jeton dans la colonne pris dans la liste du joueur courant
            grillejeu.ajouterJetonDansColonne(joueurCourant.ListeJetons[(joueurCourant.nombreJetonsRestants) - 1], indice_colonne);
           
            if (grillejeu.ligneDesin(indice_colonne) == true) {// verif si il y a un desintegrateur a la ligne du jeton ajouté a la colonne en argument 
                joueurCourant.nombreDesintegrateurs += 1;
                lbl_j1_desint.setText(ListeJoueurs[0].nombreDesintegrateurs + "");// affichache nbr desint
                lbl_j2_desint.setText(ListeJoueurs[1].nombreDesintegrateurs + "");
            }
            ListeJoueurs[0].Vict = grillejeu.etreGagnantePourJoueur(ListeJoueurs[0]);// verif du gagnant
            ListeJoueurs[1].Vict = grillejeu.etreGagnantePourJoueur(ListeJoueurs[1]);
            if (ListeJoueurs[0].Vict && !ListeJoueurs[1].Vict) {
                message.setText("Victoire de " + ListeJoueurs[0].Nom);//affich le gagnant 
            }
            if (ListeJoueurs[1].Vict && !ListeJoueurs[0].Vict) {
                message.setText("Victoire de " + ListeJoueurs[1].Nom);
            }
            if (ListeJoueurs[0].Vict && ListeJoueurs[1].Vict) {// affiche le gagnant en fonction des fautes des joueurs
                if (joueurCourant == ListeJoueurs[0]) {
                    message.setText("Victoire de " + ListeJoueurs[1].Nom + " par la faute de jeu de " + ListeJoueurs[0].Nom);
                } else {
                    message.setText("Victoire de " + ListeJoueurs[0].Nom + " par la faute de jeu de " + ListeJoueurs[1].Nom);
                }

            }

            joueurCourant.ListeJetons[(joueurCourant.nombreJetonsRestants) - 1] = null;// suprime le jeton de la liste du joueur qui est mtn sur la grille
            joueurCourant.nombreJetonsRestants -= 1; //desincremente le nbr de jeton
            Panneau_Grille.repaint();//refresh
            return true;// jeton placé 
        }

        return false;// jeton non placé car colonne remplie 
    }

    public void joueurSuivant() {// change le tour passe au joueur suivant en fonction du joueur suivant 
        if (joueurCourant == ListeJoueurs[0]) {
            joueurCourant = ListeJoueurs[1];

        } else {
            joueurCourant = ListeJoueurs[0];

        }
        lbl_jcourant.setText(joueurCourant.Nom);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FenetreDeJeu().setVisible(true);
            }
        });
    }

    public void initialiserPartie() {

        grillejeu.viderGrille(); // vide la grille avant de commencer 
        Random r = new Random(); // import module aleatoire

        String nomj1 = nom_joueur1.getText();
        Joueur joueur1 = new Joueur(nomj1); //crée un nouvel objet de type Joueur 
        String nomj2 = nom_joueur2.getText();
        Joueur joueur2 = new Joueur(nomj2);// crée un nouvel objet de type joueur 
        ListeJoueurs[0] = joueur1;
        ListeJoueurs[1] = joueur2;
        attribuerCouleursAuxJoueurs();// attribue les couleurs aux joueurs aleatoirement 

        lbl_j1_nom.setText(nomj1); //affiche le nom du J1 rentré par l'utilisateur
        lbl_j2_nom.setText(nomj2);//affiche le nom du J2 rentré par l'utilisateur
        lb_j1_couleur.setText(joueur1.Couleur); //affiche la couleur des joeurs défini ulterieurement 
        lb_j2_couleur.setText(joueur2.Couleur);
        lbl_j1_desint.setText(joueur1.nombreDesintegrateurs + "");
        lbl_j2_desint.setText(joueur2.nombreDesintegrateurs + "");
        
        //creation des jetons joueur1
        for (int i = 0; i <= 20; i++) {
            Jeton jeton = new Jeton(ListeJoueurs[0].Couleur);
            ListeJoueurs[0].ajouterJeton(jeton);

        }
        //creation des jetons joueur1
        for (int j = 0; j <= 20; j++) {
            Jeton jeton = new Jeton(ListeJoueurs[1].Couleur);
            ListeJoueurs[1].ajouterJeton(jeton);

        }
        //placer les trous noir 
        int cpt1 = 0;
        while (cpt1 < 5) { //place 5 trous noirs 
            int a = r.nextInt(5);    //tirer aleatoirement un entier  
            int b = r.nextInt(6);
            if (grillejeu.CellulesJeu[a][b].trouNoir == false) {
                grillejeu.placerTrouNoir(a, b);// place trou noir si il n'y en a pas deja un 
                cpt1 += 1; // compte le nomre de trous noirs placé 

            }

        }

        //placer les desintegrateurs
        int cpt = 0;
        while (cpt < 2) {

            int x = r.nextInt(5);    //tirer aleatoirement un entier  
            int y = r.nextInt(6);
            if ((grillejeu.CellulesJeu[x][y].trouNoir == true) && (grillejeu.CellulesJeu[x][y].presenceDesintegrateur() == false)) {
                grillejeu.placerDesintegrateur(x, y); // place 3 les desinte derriere des trou noirs mais ou il y a pas deja de desinte  
                cpt += 1;
            }

        }
        int cpt2 = 0;

        while (cpt2 < 3) {

            int x = r.nextInt(5);    //tirer aleatoirement un entier  
            int y = r.nextInt(6);
            if ((grillejeu.CellulesJeu[x][y].trouNoir == false) && (grillejeu.CellulesJeu[x][y].presenceDesintegrateur() == false)) {
                grillejeu.placerDesintegrateur(x, y); //place  3 desinte la ou il n'y en a pas et ou il y a pas de trou noir 
                cpt2 += 1;
            }
        }

        int a = r.nextInt(2);
        joueurCourant = ListeJoueurs[a]; //attribue aleatoirement le joueur qui commence 
        lbl_jcourant.setText(joueurCourant.Nom); // affiche le joueur courant sur la fenetre info partie 
    }

    public void attribuerCouleursAuxJoueurs() {
        // couleur Jaune attribué à 0
        // couleur Jaune attribué à 1 
        Random r = new Random();
        int n = r.nextInt(1);
        if (n == 0) {
            ListeJoueurs[0].Couleur = "jaune";
            ListeJoueurs[1].Couleur = "rouge";
        } else {
            ListeJoueurs[0].Couleur = "rouge";
            ListeJoueurs[1].Couleur = "jaune";
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panneau_Création_Partie;
    private javax.swing.JPanel Panneau_Grille;
    private javax.swing.JPanel Panneau_Info_Joueur;
    private javax.swing.JPanel Panneau_Info_Partie;
    private javax.swing.JButton btn_col_0;
    private javax.swing.JButton btn_col_1;
    private javax.swing.JButton btn_col_2;
    private javax.swing.JButton btn_col_3;
    private javax.swing.JButton btn_col_4;
    private javax.swing.JButton btn_col_5;
    private javax.swing.JButton btn_col_6;
    private javax.swing.JButton btn_start;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JSlider jSlider2;
    private javax.swing.JLabel lb_j1_couleur;
    private javax.swing.JLabel lb_j2_couleur;
    private javax.swing.JLabel lbl_j1_desint;
    private javax.swing.JLabel lbl_j1_nom;
    private javax.swing.JLabel lbl_j2_desint;
    private javax.swing.JLabel lbl_j2_nom;
    private javax.swing.JLabel lbl_jcourant;
    private javax.swing.JTextArea message;
    private javax.swing.JTextField nom_joueur1;
    private javax.swing.JTextField nom_joueur2;
    // End of variables declaration//GEN-END:variables
}
