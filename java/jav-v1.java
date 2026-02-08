package java;

import java.util.Scanner;

public class GestionTachesColocation {

    public static void main(String[] args) {

        // Liste fixe des colocataires
        String[] colocataires = {
                "Mustapha",
                "Zakaria",
                "Bilguisso",
                "Kélian",
        };

        // Liste fixe des tâches ménagères
        String[] taches = {
                "Nettoyer la cuisine",
                "Passer l'aspirateur",
                "Nettoyer la salle de bain",
                "Nettoyer le salon",
        };

        Scanner scanner = new Scanner(System.in);

        // Demande du numéro de la semaine
        System.out.print("Entrez le numéro de la semaine : ");
        int semaine = scanner.nextInt();

        System.out.println("\nRépartition des tâches pour la semaine " + semaine + " :\n");

        int nombre = colocataires.length;

        // Attribution des tâches avec rotation
        for (int i = 0; i < nombre; i++) {
            int indexTache = (i + semaine) % nombre;
            System.out.println(colocataires[i] + " doit faire : " + taches[indexTache]);
        }

        scanner.close();
    }
}
