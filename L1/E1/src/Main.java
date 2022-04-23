import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o primeiro valor:");
        int primeiroNumero = leitor.nextInt();
        System.out.print("Digite o último valor:");
        int ultimoNumero = leitor.nextInt();
        NumerosPrimos.getPrimos(primeiroNumero,ultimoNumero);
    }
}
