import java.util.Random;

public class ArrayTest {
    public static void main(String[] args) {
        //Luodaan uusi Array (Int), jonka koko on 3 arvoa.
        int[] ArvotutLuvutLista = new int[3];
        arvoluvut(ArvotutLuvutLista);
    }
        //Luodaan uusi funktio (nimeltään arvoluvut), jota kutsutaan, kun numerot tarvii arpoa uudestaan
        public static void arvoluvut(int[] numbers) {
            Random rand = new Random();
            for (int i=0; i < numbers.length; i++ ) {
                numbers[i] = rand.nextInt(10) + 1;
                System.out.println(numbers[i]);
             }
    }
}

