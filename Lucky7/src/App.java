import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Random rand = new Random();

        int numero1 = rand.nextInt(10) + 1;
        int numero2 = rand.nextInt(10) + 1;
        int numero3 = rand.nextInt(10) + 1;
        System.out.println("Heitit: " + numero1 + ", " + numero2 + ", "  + numero3);
        System.out.println("");
         if (numero1 == 7 || numero2 == 7 || numero3 ==7) {
            System.out.println("Sait numero 7, olet viineri!");
            
         } else {
            System.out.println("Voi rähmä, et saanut numero 7, hävisit..");
        }
    }
}
