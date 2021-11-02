import java.util.Scanner;
public class tp3 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Entrer la premiere valeur(a) : ");
        double a = keyboard.nextDouble();

        System.out.print("Entrer la deuxieme valeur(b) : ");
        double b = keyboard.nextDouble();

        System.out.print("Entrer la troisieme valeur(c) : ");
        double c = keyboard.nextDouble();

        System.out.printf("Les valeurs entrées sont  a=%f b=%f et c=%f \n", a, b, c);
        System.out.printf("Permutation: b<==a, c<==b, a<==c \n");
        double temp=a, temp_1=b;
        a=c;
        b=temp;
        c=temp_1;
        System.out.printf("Les valeurs permutées sont  a=%f b=%f et c=%f", a, b, c);

    }
}
