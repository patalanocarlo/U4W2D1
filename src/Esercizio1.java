public class Esercizio1 {
    public static void main(String[] args) {
        int sum = add(5, 3);
        System.out.println("Risultato somma: " + sum);
        int result = 0;
        try {
            result = divide(10, 0);
            System.out.println("Risultato divisione: " + result);
        } catch (ArithmeticException e){
            System.err.println("Errore Riscontrato: " + e.getMessage());
        }


    }

    public static int divide(int a, int b) {
        return a / b;
    }

    public static int add(int a, int b) {
        return a + b;
    }
}