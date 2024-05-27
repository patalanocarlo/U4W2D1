package Esercizio4;

public class Banca {
    public static void main(String args[]) {
        ContoCorrente conto1 = new ContoCorrente("Grossi Mario", 30000.0);

        System.out.println("Saldo conto: " + conto1.restituisciSaldo());

        try {
            conto1.preleva(1750);
            System.out.println("Saldo conto: " + conto1.restituisciSaldo());
        } catch (BancaException e) {
            System.out.println("Errore durante il prelievo: " + e.getMessage());
        }

        ContoOnLine conto2 = new ContoOnLine("Rossi Luigi", 50000.0, 1500);

        conto2.stampaSaldo();

        try {
            conto2.preleva(2000);
            conto2.stampaSaldo();
        } catch (BancaException e) {
            System.out.println("Errore durante il prelievo: " + e.getMessage());
        }
    }
}