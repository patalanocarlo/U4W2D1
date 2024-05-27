import java.util.Random;
import java.util.Scanner;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Esercizio2 {
    private static final Logger logger = LoggerFactory.getLogger(Esercizio2.class);

    public static void main(String[] args) {
        int[] array = new int[5];
        Random numeriRandom = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = numeriRandom.nextInt(10) + 1;
        }

        Scanner scanner = new Scanner(System.in);
        int value = -1;

        while (value != 0) {
            System.out.println("Stato del array attuale:");
          ScriviArray(array);
            System.out.println("Inserisci il numero da inserire nel array oppure digita 0 per chiudere il programma:");
            value = scanner.nextInt();
            if (value == 0) {
                break;
            }
            System.out.print("Inserisci la posizione in cui inserire il numero (0-4): ");
            int position = scanner.nextInt();

            try {
                if (position < 0 || position >= array.length) {
                    throw new ArrayIndexOutOfBoundsException("Indice fuori dal limite imposto " + position);
                }
                array[position] = value;
            } catch (ArrayIndexOutOfBoundsException e) {
                logger.error("Errore: " + e);
                System.out.println("Indice fuori dal limite imposto dell'array,Riprova... ");
            }
        }

        System.out.println("Termine del programma...");
        scanner.close();
    }

    private static void ScriviArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}