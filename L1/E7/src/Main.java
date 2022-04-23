
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n;
        Scanner leitor = new Scanner(System.in);
        do {
            System.out.println("Informe o numero de linhas e colunas na matriz: ");
            n = leitor.nextInt();
        } while (n == 0);
        int[][] a = new int[n][n];
        int[][] b = new int[n][n];
        Matriz.geraMatrizAleatoria(n,n,a);
        Matriz.geraMatrizAleatoria(n,n,b);
        int[][] c = Matriz.matrizComposta(a,b,n);

        System.out.println("Matriz A:");
        for(int linha=0; linha<n;linha++) {
            for (int coluna = 0; coluna < n; coluna++) {
                System.out.println(a[linha][coluna]+" ");
            }
            System.out.println("\n");
        }

        System.out.println("Matriz B:");
        for(int linha=0; linha<n;linha++) {
            for (int coluna = 0; coluna < n; coluna++) {
                System.out.println(b[linha][coluna]+" ");
            }
            System.out.println("\n");
        }

        System.out.println("Matriz C:");
        for(int linha=0; linha<n;linha++) {
            for (int coluna = 0; coluna < n; coluna++) {
                System.out.println(c[linha][coluna]+" ");
            }
            System.out.println("\n");
        }
    }
}