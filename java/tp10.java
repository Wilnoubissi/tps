public class tp10{
    public static void main(String[] variables){
        int nb = 2;
        int nb_max = 10;
        System.out.println("Tables de multiplication");
        for (int i = nb; i <= nb_max; i++) {
            System.out.printf("Table de %d \n",i);
            for (int k = 1; k <= 10; k++) {
                System.out.printf("%d x %d = %d \n", k, i, k*i);
            }
        }
    }
}