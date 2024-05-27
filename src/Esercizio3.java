import java.util.Scanner;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;




public class Esercizio3 {
    private static final Logger logger= LoggerFactory.getLogger(Esercizio3.class);

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
         try {
             System.out.println("Inserisci il numero di Kilometri che hai percorso: ");
             double kilometriPercorsi= scanner.nextDouble();

             System.out.println("Inserisci il numero di litri di carburante che hai usato:");
             double carburanteUsato= scanner.nextDouble();
         }
    }
}
