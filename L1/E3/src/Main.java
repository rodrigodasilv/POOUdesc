import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n,soma = 0;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe um numero inteiro!");
        n = leitor.nextInt();
        System.out.println(n + " termo de Fibonacci é: " + Fibonacci.calculaFibonacciAteTermo(n));
        System.out.println("Soma dos " + n + " termos de Fibonacci é: " + Fibonacci.calculaSomaFibonacciAteTermo(n));
    }
}
