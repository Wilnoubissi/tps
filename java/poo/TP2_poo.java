import java.util.Scanner;

 class Patient {
     private double height;
     private double weight;

     public double getHeight() {
         return height;
     }

     public void setHeight(double height) {
         this.height = height;
     }

     public double getWeight() {
         return weight;
     }

     public void setWeight(double weight) {
         this.weight = weight;
     }

     double imc() {
         double imc = weight / (height * height);
         return imc;
     }
 }
class Main_imc {
    public static void main(String[] args) {

        Patient moi = new Patient();
        Scanner keyb = new Scanner(System.in);
        System.out.print("Entrer la taille \n");
        double height = keyb.nextDouble();
        moi.setHeight(height);
        System.out.print("Entrer le poids \n");
        double weight = keyb.nextDouble();
        moi.setWeight(weight);
        System.out.println("Taille : " + moi.getHeight());
        System.out.println("Poids : " + moi.getWeight());
        System.out.println("imc: " + moi.imc());
    }
}


