public class Esercizio1 {
    public static void main(String[] args) {
        try {

            int result= divide(10,0);
            System.out.println("Risultato: " + result);
        } catch (ArithmeticException e){
            System.err.println("Eccezzione riscontrata:"+ e.getMessage());
        }
    }
   public static int divide(int a , int b){
       return a / b;
   }
}
