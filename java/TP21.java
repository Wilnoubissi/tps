import java.util.Scanner;
//import java.util.Objects;
public class TP21 {
    public static void main(String[] args) {
        System.out.print("Entrez votre  texte:");
        Scanner keyb = new Scanner(System.in);
        String text_1 = keyb.nextLine();
        //String s1=text_1;
        char vide = ' ';
        for(int i=0;i<text_1.length();i++){
            if(text_1.charAt(i) == vide){
                text_1=text_1.replace(text_1.charAt(i+1), Character.toUpperCase(text_1.charAt(i+1)));
            }
        }
        System.out.printf("Resultat: %s \n", text_1);
    }
}
