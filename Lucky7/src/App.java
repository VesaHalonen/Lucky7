import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pelivaluutan määrä: ");
        int raha = scanner.nextInt();

        while (raha > 0) {
            System.out.println("Paina Enter arpoaksesi numerot...");
            scanner.nextLine();
            int numero1 = rand.nextInt(10) + 1;
            int numero2 = rand.nextInt(10) + 1;
            int numero3 = rand.nextInt(10) + 1;

        raha = raha -1; 
        int MontaSeiskaa = 0;

        System.out.println("Heitit: " + numero1 + ", " + numero2 + ", "  + numero3);
        System.out.println("");
        
        if (numero1 == 7) MontaSeiskaa++;
        if (numero2 == 7) MontaSeiskaa++;
        if (numero3 == 7) MontaSeiskaa++;

        MontaSeiskaa = 0;

            if (MontaSeiskaa == 1) {
            System.out.println("Sait yhden seiskan, olet viineri! Voitit 3 valuuttaa");
            raha = raha + 3;
                }
                else if (MontaSeiskaa == 2) {
                System.out.println("Sait kaksi seiskaa, olet viineri! Voitit 5 valuuttaa");
                raha = raha + 5;
                }
                else if (MontaSeiskaa == 3) {
                System.out.println("Wau, kaikki seiskoja! Voitit 15 valuuttaa");
                raha = raha + 15;
            }     
                    else {
                        System.out.println("Voi rähmä, et saanut numero 7, hävisit..");
        }

        System.out.println("");
        System.out.println("Saldo: " + raha);
        System.out.println("");
    }
}
}


