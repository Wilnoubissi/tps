import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class TP27 {
    public static void occurence_position(ArrayList<ArrayList<Integer>> tableauDentiers, int a) {
        int compteur=0;
        ArrayList<Integer> position = new ArrayList<Integer>() ;
        //ArrayList<ArrayList<Integer>> resultat = new ArrayList<ArrayList<Integer>>();
         for(int i=0;i< tableauDentiers.size();i++){
            for(int j=0;j<tableauDentiers.get(i).size();j++){
                if(tableauDentiers.get(i).get(j)==a) {
                    compteur++;
                    System.out.print("(");
                    System.out.print(i);
                    System.out.print(",");
                    System.out.print(j);
                    System.out.print(")");
                }
            }
        }
         System.out.printf("\n %d apparait %d fois dans les listes aux positions ci-dessus ", a, compteur);
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrice_valeurs = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> list_valeurs = new ArrayList<Integer>();
        list_valeurs.add(1);
        list_valeurs.add(4);
        list_valeurs.add(4);
        list_valeurs.add(1);
        //matrice_valeurs={{1, 4, 2, 1}, {6, 3, 8, 9}, {1, 5, 1, 0}};
        matrice_valeurs.add(list_valeurs);
        occurence_position(matrice_valeurs,4);
    }
}
