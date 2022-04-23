public class Fibonacci {
    public static int calculaFibonacciAteTermo(int n){
        if (n == 0){
            return 0;
        } else{
            if (n == 1){
                return 1;
            }else{
                return calculaFibonacciAteTermo(n - 1) + calculaFibonacciAteTermo(n - 2);
            }
        }
    }

    public static int calculaSomaFibonacciAteTermo(int n){
        int soma = 0;
        for (int i = 0; i<=n; i++){
            soma = soma + calculaFibonacciAteTermo(i);
        }
        return soma;
    }
}