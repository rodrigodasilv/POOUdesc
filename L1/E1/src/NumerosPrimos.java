import java.util.Scanner;

public class NumerosPrimos{
    public static void getPrimos(int inicio, int fim) {
        for(int i = inicio ; i <= fim; i++) {
            if(ehPrimo(i)) {
                System.out.println(i);
            }
        }
    }
    public static boolean ehPrimo(int numero) {
        if(numero == 1){
            return false;
        }
        for(int i = 2; i < numero; i++) {
            if(numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}