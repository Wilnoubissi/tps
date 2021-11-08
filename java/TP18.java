import java.util.Scanner;
import java.lang.StringBuffer;
public class TP18 {
    public static void main(String[] args) {
        System.out.print("Entrez votre texte:");
        Scanner keyb = new Scanner(System.in);
        StringBuffer text = new StringBuffer(keyb.nextLine());
        StringBuffer text_inv= new StringBuffer();
        for (int i = 1; i <= text.length(); i++) {
            text_inv.append(text.charAt(text.length()-i));
        }
        if(text.toString().equals(text_inv.toString())){
            System.out.printf("Voici le texte inversé: %s \n", text_inv);
            System.out.printf("Il s'agit d'un palindrome \n");
            System.out.printf("%d, %d", text.length(), text_inv.length());
        }else {
            System.out.printf("Il ne s'agit pas d'un palindrome \n");
            System.out.printf("Voici le texte inversé: %s\n", text_inv);
            System.out.printf("%d, %d", text.length(), text_inv.length());
        }
    }
}
