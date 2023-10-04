import java.util.Random;
import java.util.Scanner;

public class morpion {

    public static void main(String[] args) {
        char[][] grille = new char[3][3];
        char joueur = 'X';
        char ordinateur = 'O';
        boolean tourJoueur = new Random().nextBoolean();

        initialiserGrille(grille);

        Scanner scanner = new Scanner(System.in);
        afficherGrille(grille);

        while (true) {
            if (tourJoueur) {
                tour(scanner, grille, joueur);
            } else {
                tourOrdinateur(grille, ordinateur);
            }
            afficherGrille(grille);

            if (aGagne(grille, joueur)) {
                System.out.println(joueur + " a gagné !");
                break;
            } else if (estPleine(grille)) {
                System.out.println("Match nul !");
                break;
            }

            tourJoueur = !tourJoueur;
        }

        scanner.close();
    }

    public static void initialiserGrille(char[][] grille) {
        for (char[] ligne : grille) {
            for (int j = 0; j < grille[0].length; j++) {
                ligne[j] = ' ';
            }
        }
    }

    public static void afficherGrille(char[][] grille) {
    
        for (char[] ligne : grille) {
            for (char cellule : ligne) {
                System.out.print(cellule + " | ");
            }
            System.out.println("\n-----------");
        }
    }

    public static void tour(Scanner scanner, char[][] grille, char joueur) {
        int ligne, colonne;
        do {
            System.out.print("Entrez la ligne (1, 2 ou 3) : ");
            ligne = scanner.nextInt() - 1;
            System.out.print("Entrez la colonne (1, 2 ou 3) : ");
            colonne = scanner.nextInt() - 1;
        } while (ligne < 0 || ligne >= 3 || colonne < 0 || colonne >= 3 || grille[ligne][colonne] != ' ');

        grille[ligne][colonne] = joueur;
    }

    public static void tourOrdinateur(char[][] grille, char ordinateur) {
        Random rand = new Random();
        int ligne, colonne;
        do {
            
            ligne = rand.nextInt(3);
            colonne = rand.nextInt(3);
            System.out.println("Tour de l'ordinateur ");
        } while (grille[ligne][colonne] != ' ');

        grille[ligne][colonne] = ordinateur;
    }

    public static boolean aGagne(char[][] grille, char joueur) {
        // Vérification des lignes, des colonnes et des diagonales
        for (int i = 0; i < 3; i++) {
            if (grille[i][0] == joueur && grille[i][1] == joueur && grille[i][2] == joueur ||
                grille[0][i] == joueur && grille[1][i] == joueur && grille[2][i] == joueur) {
                return true;
            }
        }
        return grille[0][0] == joueur && grille[1][1] == joueur && grille[2][2] == joueur ||
               grille[0][2] == joueur && grille[1][1] == joueur && grille[2][0] == joueur;
    }

    public static boolean estPleine(char[][] grille) {
        for (char[] ligne : grille) {
            for (char cellule : ligne) {
                if (cellule == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}
