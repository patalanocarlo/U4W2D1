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
             if (carburanteUsato== 0 ){
              throw new ArithmeticException("Stai dividendo per zero è impossibile che tu abbia consumato 0");
             }
             double KmPerLitroUsato= kilometriPercorsi / carburanteUsato;
             System.out.println("Ecco il tuo rapporto su i kilometri fatti e il carburante usato: " +KmPerLitroUsato + " " + "KmXlitro" );
         }catch (ArithmeticException e){
             logger.error("Errore trovato: " + e.getMessage() );
             System.out.println("Assicurati di inserire un numero di litri diverso da zero...");
         }catch (Exception e){
             System.out.println("Errore Generico: " + e.getMessage());
             System.out.println("Errore rilevato durante la apertura del programma...");
         }finally {
             scanner.close();
         }
    }
}
