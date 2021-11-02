import java.util.Scanner;
public class tp6 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Entrer x : ");
        int x = keyboard.nextInt();

        System.out.print("Entrer y : ");
        int y = keyboard.nextInt();

        System.out.printf("Après permutation:\n");
        int temp=x;
        x=y;
        y=temp;
        System.out.printf("x=%d \n", x);
        System.out.printf("y=%d \n", y);

    }
}

