import java.util.Scanner;
public class tp1 {
   public static void main(String[] args){
        System.out.print("Diametre : ");
        Scanner keyboard = new Scanner(System.in);

        double diametre = keyboard.nextDouble();
        final double PI=3.14;
        double surface=Math.pow(diametre, 2)*Math.PI*0.25;
        System.out.printf("Surface = diametre x diametre x PI x 0.25 = %f x %f x %f = %f", diametre, diametre, Math.PI, surface);
    }
}

