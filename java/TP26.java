import java.util.Locale;
import java.util.Scanner;
public class TP26 {
    //Fonction qui vérifie si un mot est le prefixe de l'autre
    public static boolean isPrefix(String ch1, String ch2){
        if(ch1.length()>ch2.length()) {
            String temp = ch1.toLowerCase();
            ch1=ch2.toLowerCase();
            ch2=temp;
        }
        return ch1.toLowerCase().equals(ch2.substring(0, ch1.length()).toLowerCase());
    }
    public static void main(String[] args){
        System.out.print("Entrez votre 1er texte:");
        Scanner keyb = new Scanner(System.in);
        String text_1 = keyb.nextLine();
        System.out.print("Entrez votre 2eme texte:");
        String text_2 = keyb.nextLine();
        System.out.print(isPrefix(text_1, text_2));
    }
}
