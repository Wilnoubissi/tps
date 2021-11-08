import java.util.Scanner;
class rectangle {
    double longueur ;
    double largeur ;
    double aire_rectangle(){
        double aire=longueur*largeur;
        return aire;
    }
    double perimetre(){
        double perimetre=(longueur+largeur)*2;
        return perimetre;
    }
}
class Main_rectangle {
    public static void main(String[] args) {
        rectangle exemple = new rectangle();
        Scanner keyb = new Scanner(System.in);
        System.out.print("Entrer la longueur: ");
        exemple.longueur=keyb.nextDouble();
        System.out.print("Entrer la largeur: ");
        exemple.largeur=keyb.nextDouble();
        System.out.printf("Aire: %f", exemple.aire_rectangle());
        System.out.printf("\nPerimetre: %f", exemple.perimetre());
    }
}

