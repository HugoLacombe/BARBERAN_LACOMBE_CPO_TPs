/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_lacombe_barberan;

import java.util.Random;
import java.util.Scanner;

/** 
 * EXERCICE 3
 *
 * @author Hugo LACOMBE/Baptiste BArberan
 */
public class TP1_guessMyNumber_LACOMBE_BARBERAN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random generateurAleat = new Random();
        int n = generateurAleat.nextInt(100);
        System.out.println(n);
        n = generateurAleat.nextInt(100);
        System.out.println(n);
        n = generateurAleat.nextInt(100);
        System.out.println(n);
        n = generateurAleat.nextInt(100);
        System.out.println(n);
        n = generateurAleat.nextInt(100);
        System.out.println(n);
        //Affichage des 5 nombres aléatoires générées grace au module Random generator

        // Mode facile => classique nb dee coups illimité indication plus simple 
        // Mode normal=> nombre de coup illimité grand nombre
        // Mode difficile => indication peu detaillée, nombre de coup limité, intervalle plus grand 
        //Mode cauchemar => ajout des fausses indications 
        //Debut du jeu 
        Scanner sc = new Scanner(System.in);

        System.out.println("Choissisez votre mode de difficulté");
        System.out.println("1) Mode facile\n2) Mode simple\n3) Mode difficile\n4) Mode Cauchemar");
        int mode;
        
        mode = sc.nextInt();
       
        
        int nbutil;// nombre de l'utilisateur
        int nbadev;// nombre à deviner
        int tent = 0;//nombre de tentative
        
        // Mode facile 
        if (mode == 1) { 
            //On demande à l'utilisateur de saissir un nombre entre 0 et 100 
            // On va générer un nombre aléatoire entre 0 et 100 => nbadev
            nbadev = generateurAleat.nextInt(100);
            


            // boucle interraction utilisateur 
            while (true) {
                while (true) {
                    System.out.println("Saissis un nombre entier entre 0 et 100");
                    nbutil = sc.nextInt();
                    if (nbutil >= 0 && nbutil <= 100) {
                        break;
                    }
                }
                tent += 1;// une tentative est ajoutée

                if (nbutil == nbadev) {
                    
                    System.out.print("Gagné!!");
                    break;
                }

                if (nbutil < nbadev) {
                    int D = (nbadev - nbutil);
                    if (D >= 20) {
                        System.out.println("Tu es encore trop loin, c'est plus grand !");
                        continue;

                    }
                    if (D >= 10) {
                        System.out.println("Tu te rapproches, plus grand encore !");
                        continue;

                    }
                    if (D >= 5) {
                        System.out.println("Tu chauffes, il te manque rien ! ");
                        continue;
                    }
                    if (D >= 1) {
                        System.out.println("Presque, un peu plus allez !");
                        continue;
                    } else {
                        System.out.println("trop petit !!");
                    }
 
                }
                if (nbutil > nbadev) {
                    int D1 = (nbutil - nbadev);// différence pour connaître la position du nombre de l'utilisateur par rapport au nombre à deviner 
                    if (D1 >= 20) {
                        System.out.println("Tu es encore trop loin, c'est plus petit !");
                        continue;

                    }
                    if (D1 >= 10) {
                        System.out.println("Tu te rapproches, plus petit encore !");
                        continue;

                    }
                    if (D1 >= 5) {
                        System.out.println("Tu chauffes, il te manque rien ! ");
                        continue;
                    }
                    if (D1 >= 1) {
                        System.out.println("Presque, un peu moins allez !");
                        continue;
                    } else {
                        System.out.println("trop grand!!");
                    }
                }

            }

        }
        // Mode simple 
        if (mode == 2) {
            nbadev = generateurAleat.nextInt(100);
            while (true) {
                while (true) {
                    System.out.println("Saissis un nombre entier entre 0 et 100");
                    nbutil = sc.nextInt();
                    if (nbutil >= 0 && nbutil <= 100) {
                        break;
                    }
                }
                tent += 1;// une tentative est ajoutée

                if (nbutil == nbadev) {
                    
                    System.out.print("Gagné!!");
                    break;
                }

                if (nbutil < nbadev) {
                    System.out.println("Plus grand");
                }
                if (nbutil > nbadev) {
                    System.out.println("Plus petit");

                }

            }
        }
            //Mode Difficile
            if (mode == 3) {
                System.out.println("Tu as choissis le mode difficile, sois stratégique les tentatives sont limitées (10 coups) ");
                nbadev = generateurAleat.nextInt(100);
                while (true) {
                    while (true) {
                        System.out.println("Saissis un nombre entier entre 0 et 100");
                        nbutil = sc.nextInt();
                        if (nbutil >= 0 && nbutil <= 100) {
                            break;
                        }
                    }
                    tent += 1;// une tentative est ajoutée

                    if (nbutil == nbadev) {
                        
                        System.out.print("Gagné!!");
                        break;
                    }

                    if (nbutil < nbadev) {
                        System.out.println("Plus grand");
                    }
                    if (nbutil > nbadev) {
                        System.out.println("Plus petit");

                    }
                    if (tent == 10) {
                        System.out.println("Tu as utilisé des dix tentatives, c'est fini tu as perdu !");
                        break;
                    }

                }

            }

            //Mode cauchemar
            int temp;
            if (mode == 4) {
                System.out.println("Tu as choissis le mode cauchemar, sois stratégique les tentatives sont limitées (10 coups), parfois les indications seront fausses ");
                nbadev = generateurAleat.nextInt(100);
                
                while (true) {
                    while (true) {
                        System.out.println("Saissis un nombre entier entre 0 et 100");
                        nbutil = sc.nextInt();
                        if (nbutil >= 0 && nbutil <= 100) {
                            break;
                        }
                    }
                    tent += 1;// une tentative est ajoutée

                    if (nbutil == nbadev) {
                        
                        System.out.print("Gagné!!");
                        break;
                    }

                    if (nbutil < nbadev) {
                        temp = generateurAleat.nextInt(9);//A enlever
                        
                        if (temp == 0 || temp == 1 || temp == 2) {
                            System.out.println("Plus petit");
                            continue;

                        }
                        System.out.println("Plus grand");
                    }
                    if (nbutil > nbadev) {
                        temp = generateurAleat.nextInt(9);
                        
                        if (temp == 0 || temp == 1 || temp == 2) {
                            System.out.println("Plus grand");
                            continue;
                        }
                        System.out.println("Plus petit");

                    }
                    if (tent == 10) {
                        System.out.println("Tu as utilisé des dix tentatives, c'est fini tu as perdu !");
                        break;
                    }

                }

            }

            System.out.println(" Nombre de tentative : " + tent);

        

        System.out.println(" Nombre de tentative : " + tent);

    }
}
