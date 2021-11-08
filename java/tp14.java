import java.util.Scanner;
public class tp14 {
    public static void main(String[] args){
        int n;
        int freq = 0, value=0;
        Scanner keyb = new Scanner(System.in);
        System.out.println("Entrer la taille de votre tableau");
        n= keyb.nextInt();
        int val[]=new int[n];
        System.out.println("Entrer les éléments de votre tableau");
        for(int i=0;i<n;i++){
            val[i]= keyb.nextInt();

        }
        for(int k=0;k<n;k++){
            int compt=0;
            for(int j=0;j<n;j++){
                if(j!= k && val[k] == val[j]){
                    compt = compt + 1;
                }
            }
            if(compt>freq){
                freq=compt;
                value=val[k];
            }
        }
        System.out.printf("L'élément le plus fréquent est %d et sa fréquenece d'apparition est %d", value, freq+1);
    }
    }

