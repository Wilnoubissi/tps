
import java.util.Scanner;
public class tp15 {
    public static void main(String[] args) {
        int n=0;
        int freq = 0, value = 0;
        Scanner keyb = new Scanner(System.in);
        int val[] = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.printf("Entrer la taille du %d eme tableau \n", i + 1);
            val[i] = keyb.nextInt();
        }
        int tab_1[] = new int[val[0]];
        int tab_2[] = new int[val[1]];
        int tab_3[] = new int[val[2]];

        System.out.printf("Entrer les éléments du 1er tableau \n");
        for (int i = 0; i < val[0]; i++) {
            tab_1[i] = keyb.nextInt();
            if(tab_1[i]%3==0){
                n=n+tab_1[i];
            }

        }
        System.out.printf("Entrer les éléments du 2eme tableau \n");
        for (int i = 0; i < val[1]; i++) {
            tab_2[i] = keyb.nextInt();
            if(tab_2[i]%3==0){
                n=n+tab_2[i];
            }

        }
        System.out.printf("Entrer les éléments du 3eme tableau \n");
        for (int i = 0; i < val[2]; i++) {
            tab_3[i] = keyb.nextInt();
            if(tab_3[i]%3==0){
                n=n+tab_3[i];
            }
        }
        System.out.printf("tableau 1 \n");
        for (int i = 0; i < val[0]; i++) {
            System.out.printf("%d",tab_1[i]);
        }
        System.out.printf("\n tableau 2 \n");
        for (int i = 0; i < val[1]; i++) {
            System.out.printf("%d",tab_2[i]);
        }

        System.out.printf("\n tableau 3 \n");
        for (int i = 0; i < val[2]; i++) {
            System.out.printf("%d",tab_3[i]);
        }
        System.out.printf("\n La somme : %d \n", n);
    }
}
