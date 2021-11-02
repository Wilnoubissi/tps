import java.util.Scanner;
import java.util.Calendar;
public class tp4 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Donnez votre age : ");
        int age = keyboard.nextInt();
        int curYear = Calendar.getInstance().get(Calendar.YEAR);
        int annee = curYear - age;
        System.out.printf("Votre année de naissance est : %d", annee);
    }
}
