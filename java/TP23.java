import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class TP23 {
    public static void main(String[] args) {
        // Ecrire un programme Java demande à l’utilisateur de saisir  liste de langages de programmations à partir du clavier.
        // Une fois le tableau rempli, l’utilisateur sera appelé à saisir les noms des langages qu’il souhaite retirer de liste.
        // Le programme devra ensuite retirer ces langages et afficher l’état du tableau avant et après la suppression.

        ArrayList<String> programingLanguages = new ArrayList<>();
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Combien de langages voulez-vous enregistrer ? ");
        int arraySiz = keyboard.nextInt();
        for(int i=0; i<arraySiz; i++){
            System.out.printf("Saisissez le langage %d : ", i+1);
            programingLanguages.add(keyboard.next());
        }
        System.out.println("Tableau avant suppression : " + programingLanguages);

        System.out.print("Combien de langages souhaitez vous supprimé ? ");
        int nbLanguageToRemove = keyboard.nextInt();

        System.out.println("Saisissez les noms des langages que vous souhaitez supprimer du tableau : ");
        for (int i=0; i<nbLanguageToRemove; i++){
            System.out.printf("Saisissez le langage %d à retirer : ", i+1);
            String langToRemove = keyboard.next();
            programingLanguages.removeIf(lang -> Objects.equals(lang, langToRemove));
        }

        /*String[] strToArray = keyboard.next().toLowerCase().split("\\W+");
        for (String str : strToArray) {
            programingLanguages.removeIf(lang -> Objects.equals(lang, str));
            System.out.println(str);
        }*/
        System.out.println("Tableau après suppression : " + programingLanguages);
    }
}
