import java.util.Scanner;
import java.lang.StringBuffer;
public class TP17 {
    public static void main(String[] args) {
        System.out.println("Entrez votre texte:");
        Scanner keyb = new Scanner(System.in);
        String text = keyb.nextLine();
        StringBuffer text_inv= new StringBuffer();
        for (int i = 1; i <= text.length(); i++) {
            text_inv.append(text.charAt(text.length()-i));
        }
        System.out.printf("Voici le texte inversé: %s", text_inv);
    }
}
