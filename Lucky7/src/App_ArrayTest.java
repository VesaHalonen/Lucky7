import java.util.Random;
import java.util.Scanner;


public class App_ArrayTest {
    public static void main(String[] args) throws Exception {
        int[] ArvotutLuvutLista = new int[3];
        int seiskat = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pelivaluutan määrä (saldo): ");
        int saldo = scanner.nextInt();
        scanner.nextLine();
            System.out.println("Paina Enter arpoaksesi numerot...");
            String aloitus = scanner.nextLine();
                if (aloitus.equals("")) {
                    seiskat = arvoluvut(ArvotutLuvutLista);
                }
                        switch (seiskat) {
                            case 1:
                                System.out.println("");
                                System.out.println("Sait yhden seiskan!");
                                saldo = saldo + 3;
                                break;
                            case 2:
                                System.out.println("");
                                System.out.println("Sait kaksi seiskaa!");
                                saldo = saldo + 5;
                                break;
                            case 3:
                                System.out.println("");
                                System.out.println("Sait kaksi seiskaa!");
                                saldo = saldo + 10;
                                break;
                            default:
                                System.out.println("");
                                System.out.println("Voi rähmä, et saanut seiskoja!");
                                break;
        }
        System.out.println("Saldosi on: " + saldo + " valuuttaa");
        System.out.println("");
        System.out.println("Paina Enter pelataksesi uudestaan! Jos haluat keskeyttää pelin, niin paina e ja Enter");
        scanner = new Scanner(System.in);
            String respin = scanner.nextLine();
                if (respin.equalsIgnoreCase("")) {
    }
    }
//-----Funktio, joka arpoo 3 numeroa Arrayhyn-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------             
                    public static int arvoluvut(int[] numbers) {
                    Random rand = new Random();
                    int seiskat = 0;
                    System.out.println("Arvotut numerot: ");
                    for (int i=0; i < numbers.length; i++ ) {
                        numbers[i] = rand.nextInt(10) + 1;
                        System.out.println(numbers[i]);
                        //ArvotutLuvutLista[i] = numbers[i];
                        if (numbers[i] == 7) {
                            seiskat++;
                        }
             }
             return seiskat;
    }           
}

