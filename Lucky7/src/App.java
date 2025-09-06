import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pelivaluutan määrä: ");
        int raha = scanner.nextInt();
        scanner.nextLine();
            System.out.println("Paina Enter arpoaksesi numerot...");
            String aloitus = scanner.nextLine();
                if (aloitus.equals("")) {

                    while (raha > 0) {
                        int numero1 = rand.nextInt(10) + 1;
                        int numero2 = rand.nextInt(10) + 1;
                        int numero3 = rand.nextInt(10) + 1;

                        raha = raha -1;
                        int MontaSeiskaa = 0;

                        System.out.println("Heitit: " + numero1 + ", " + numero2 + ", "  + numero3);
                        System.out.println("");
                            
 //                           if (numero1 == 7) MontaSeiskaa++;
 //                           if (numero2 == 7) MontaSeiskaa++;
 //                           if (numero3 == 7) MontaSeiskaa++;

                            if (numero1==7||numero2==7||numero3==7)                              


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
                            System.out.println("Saldo: " + raha);
                            System.out.println("");

                                System.out.println("Haluatko pelata uudestaan? Jos haluat pelata, niin paina Enter");
                                System.out.println("Jos et halua pelata, kirjoita e ja paina Enter.");
                                String jatketaanko = scanner.nextLine();
                                if (jatketaanko.equals("e")) {
                                    break;
                                }
                                        if (raha < 1) {
                                        System.out.println("Voi rähmä, olet persauki! Lisää pelivaluuttaa.");
                                        System.out.println("Pelivaluutan määrä: ");
                                            raha = scanner.nextInt();
                        }
                    }
                }
            }
        }

