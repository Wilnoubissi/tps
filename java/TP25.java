import java.util.ArrayList;
import java.util.Scanner;
public class TP25 {
    public static void main(String[] args) {
        ArrayList<String> adressEmail=new ArrayList<>();
        //        Ajout des emails yahoo, gmail, hotmail
        Scanner keyb=new Scanner(System.in);
        //System.out.print("Combien d'emails (yahoo, gmail, hotmail) :");
        //int nbreMail=keyb.nextInt();

        //for(int i=0;i<nbreMail;i++){
          //  System.out.printf("Entrez le mail numero %d : ",(i+1));
            //String mail= keyb.next();
            //adressEmail.add(mail);
        //}
        adressEmail.add("christian.lisangola@gmail.com");
        adressEmail.add("jean.paul@gmail.com");
        adressEmail.add("alain@gmail.com");
        adressEmail.add("lydie@yahoo.fr");
        adressEmail.add("josephine.lajoie@yahoo.com");
        adressEmail.add("luise@hotmail.fr");
        adressEmail.add("philemon.turion@gmail.com");
        adressEmail.add("jules.cesar@hotmail.fr");
        int compt_gmail=0;
        int compt_yahoo=0;
        int compt_hotmail=0;
        float pourcent_compt_gmail;
        float pourcent_compt_yahoo;
        float pourcent_compt_hotmail;
        for(int i=0;i<adressEmail.size();i++){
            if(adressEmail.get(i).contains("gmail")) {
                compt_gmail++;
            }else {
                if(adressEmail.get(i).contains("yahoo")) {
                    compt_yahoo++;
                }else {
                    if(adressEmail.get(i).contains("hotmail")) {
                        compt_hotmail++;
                    }
                }
            }
            }
        pourcent_compt_gmail=100*compt_gmail/adressEmail.size();
        pourcent_compt_yahoo=100*compt_yahoo/adressEmail.size();
        pourcent_compt_hotmail=100*compt_hotmail/adressEmail.size();

        System.out.printf("Pourcentage gmail : %f\n",pourcent_compt_gmail);
        System.out.printf("Pourcentage yahoo : %f\n",pourcent_compt_yahoo);
        System.out.printf("Pourcentage hotmail : %f\n",pourcent_compt_hotmail);
        }

    }
