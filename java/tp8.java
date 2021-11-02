import java.util.Scanner;
public class tp8 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Entrer le coefficient a");
        int a = keyboard.nextInt();

        System.out.print("Entrer le coefficient b");
        int b = keyboard.nextInt();

        System.out.print("Entrer le coefficients c ");
        int c = keyboard.nextInt();

        double d = b*b - 4 * a * c;
        if(d>0) {
            double k = (-b - Math.pow(d, 0.5)) / (2 * a);
            double p = (-b + Math.pow(d, 0.5)) / (2 * a);

            System.out.printf("Les racines de l'équation sont %f , %f", k, p);
        }else{
            if (d==0){
                double k = (-b) / (2 * a);
                System.out.printf("La racine de l'équation est %f", k);
            }else{
                System.out.printf("L'équation n'admet pas des racines réelles, mais admet des racines complexes");
            }

        }
    }
}