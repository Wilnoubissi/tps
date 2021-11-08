import java.lang.reflect.Array;
import java.util.*;
public class TP29 {
    //Fonction qui retourne les coordonnées en fonction des intructions données: haut:y++, bas:y--, gauche:x--, droite:x++
    public static int[] coordFinales(String[] ch1) {
        int[] point = {0, 0};
        for (int i = 0; i < ch1.length; i++) {
            if (ch1[i].equals("haut")) {
                point[1] ++;
            } else {
                if (ch1[i].equals("bas")) {
                    point[1]--;
                } else {
                    if (ch1[i].equals("droite")) {
                        point[0]++;
                    } else {
                        if (ch1[i].equals("gauche")) {
                            point[0]--;
                        }
                    }
                }
            }
        }
        return point;
    }

    public static void main(String[] args) {
        String[] instructions = {"haut", "haut", "bas", "gauche"};
        //Affichage du tableau
        System.out.print(Arrays.toString(coordFinales(instructions)));
        //for (int i=0; i<coordFinales(instructions).length;i++){
        //    System.out.print(coordFinales(instructions)[i]);
        //    System.out.print(",");
        //}
    }
}
