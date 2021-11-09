import java.util.Scanner;
class Tirelire {
    private double montant;

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public void afficher() {
        if (montant == 0) {
            System.out.print("Vous êtes sans le sous\n");
        } else {
            System.out.printf("Le montant de votre tirelire est de %.2f €\n", getMontant());
        }
    }
    public void secouer(){
        if (montant != 0) {
            System.out.print("Bing bing");
            System.out.println();
        }else {
                System.out.println();
            }
        }
    public void remplir(double ajout){
            if (ajout > 0) {
                montant+=ajout;
            }else{
                System.out.printf("Rentrez un montant en valeur positive\n");
            }
    }
    public void vider(){
        montant=0;
    }
    public void puiser(double retrait){
        if(retrait>0 && retrait<montant) {
            montant -= retrait;
            System.out.printf("Il vous reste %.2f € dans la tirelire\n", montant);
        }else {
            if (retrait > montant) {
                montant = 0;
                System.out.printf("Il vous reste %.2f € dans la tirelire\n", montant);
            } else if (retrait < 0){
                    System.out.printf("Rentrez un montant en valeur positive\n");
                }
            }
        }
    public double calculerSolde(double budget) {
        if(budget<0) {
            budget=0;
            System.out.printf("Rentrez un montant en valeur positive\n");
        }else if (budget <= montant) {
            System.out.printf("Vous êtes assez riche pour partir en vacances! Il vous restera %.2f €\n", montant-budget);
        }else if(budget>montant) {
            System.out.printf("Il vous manque %.2f € pour partir en vacances\n", budget-montant);
        }
        return montant-budget;
    }



    }
class Main_tirelire{
    public static void main(String[] args){
        Tirelire cagnotte = new Tirelire();
        Scanner keyboard= new Scanner(System.in);
        System.out.println("Choix : 1-remplir 2-afficher 3-secouer 4-vider 5-puiser 6-calculer le solde 7-sortir");
        int choix = keyboard.nextInt();
        while(choix!=7) {

            switch (choix) {
                case 1:
                    System.out.print("Entrez un montant : ");
                    double ajout = keyboard.nextDouble();
                    cagnotte.remplir(ajout);
                    break;
                case 2:
                    cagnotte.afficher();
                    break;
                case 3:
                    cagnotte.secouer();
                    break;
                case 4:
                    cagnotte.vider();
                    break;
                case 5:
                    System.out.print("Entrez un montant : ");
                    double retrait = keyboard.nextDouble();
                    cagnotte.puiser(retrait);
                    break;
                case 6:
                    System.out.print("Entrez un budget de vacances par exemple: ");
                    double budget = keyboard.nextDouble();
                    cagnotte.calculerSolde(budget);
                    break;
            }
            System.out.println("choix : 1-remplir 2-afficher 3-secouer 4-vider 5-puiser 6-calculer le solde 7-sortir");
            choix = keyboard.nextInt();
        }

    }

}
