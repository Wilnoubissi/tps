import java.util.HashMap;
import java.util.Scanner;
import java.util.Objects;
public class TP20 {
    public static void main(String[] args) {
        System.out.print("Entrez votre 1er texte:");
        Scanner keyb = new Scanner(System.in);
        String text_1 = keyb.nextLine();
        System.out.print("Entrez votre 2eme texte:");
        String text_2 = keyb.nextLine();
        HashMap<Character, Integer> occurences_text1=new HashMap<>();
        HashMap<Character, Integer> occurences_text2=new HashMap<>();
        for(int i=0;i<text_1.length();i++){
            if(occurences_text1.get(text_1.charAt(i))==null){
                occurences_text1.put(text_1.charAt(i), 1);
            }else{
                occurences_text1.replace(text_1.charAt(i), occurences_text1.get(text_1.charAt(i)) + 1);
            }
        }
        for(int i=0;i<text_2.length();i++){
            if(occurences_text2.get(text_2.charAt(i))==null){
                occurences_text2.put(text_2.charAt(i), 1);
            } else{
                occurences_text2.replace(text_2.charAt(i), occurences_text2.get(text_2.charAt(i)) + 1);
            }
        }
        //occurences_text1.remove(' ');
        //occurences_text2.remove(' ');
        System.out.println(occurences_text1);
        System.out.println(occurences_text2);
        if(Objects.equals(occurences_text1, occurences_text2)){
            System.out.print("Ce sont des anagrammes \n");
        } else{
            System.out.print("Ce ne sont pas des anagrammes \n");
        }
    }
}
