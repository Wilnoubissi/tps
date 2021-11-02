import java.util.Scanner;
public class tp2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Votre prenom : ");
        String prenom = keyboard.nextLine();

        System.out.print("Votre nom : ");
        String nom = keyboard.nextLine();

        System.out.print("Votre age : ");
        int age = keyboard.nextInt();

        System.out.printf("Vous vous appelez %s %s et votre age est %d ans", prenom, nom, age);
    }
}
