import java.util.HashMap;
import java.util.Scanner;
//import java.util.Objects;
public class TP22 {
    public static void main(String[] args) {
        System.out.print("Entrez votre  texte:");
        Scanner keyb = new Scanner(System.in);
        StringBuilder text_1 = new StringBuilder(keyb.nextLine());
        HashMap<Character, Integer> occurences_text1=new HashMap<>();
        for(int i=0;i<text_1.length();i++){
            if(occurences_text1.get(text_1.charAt(i))==null){
                occurences_text1.put(text_1.charAt(i), 1);
            }else{
                occurences_text1.replace(text_1.charAt(i), occurences_text1.get(text_1.charAt(i)) + 1);
            }
        }
        for(int k=0;k<text_1.length();k++) {
            int compt = 1;
            for (int j = 0; j < text_1.length(); j++) {
                if (j!= k && text_1.charAt(k) == text_1.charAt(j)) {
                    compt = compt + 1;
                }
                if(compt<=2) {
                    text_1=text_1.deleteCharAt(j);
                }
            }
        }
        System.out.printf("Resultat sans doublon: %s \n", text_1);
    }
}

