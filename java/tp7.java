import java.util.Scanner;
public class tp7 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Entrer un nombre entier : ");
        int x = keyboard.nextInt();
        if (x > 0 && x % 2 == 0) {
            System.out.print("Votre nombre est positif et pair");
        }else{
                if (x > 0 && x % 2 != 0) {
                    System.out.print("Votre nombre est positif et impair");
                }
            }
        if (x < 0 && x % 2 == 0) {
            System.out.print("Votre nombre est negatif et pair");
        } else {
            if (x < 0 && x % 2 != 0) {
                System.out.print("Votre nombre est negatif et impair");
            }
        }
    }
}
