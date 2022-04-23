import java.util.Random;

public class Matriz {
    public static void geraMatrizAleatoria(int i, int j, int[][] matriz) {
        Random gerador = new Random();
        for (int linha = 0; linha < i; linha++) {
            for (int coluna = 0; coluna < j; coluna++) {
                matriz[linha][coluna] = gerador.nextInt(999);
            }
        }
    }
    public static void somaMatrizes(int k, int l, int[][] x,int[][] y,int[][] z){
        for(int linha=0; linha<k;linha++) {
            for (int coluna = 0; coluna < l; coluna++) {
                z[linha][coluna] = x[linha][coluna] + y[linha][coluna];
            }
        }
    }
    public static int[][] matrizTransposta(int m, int n, int[][] r){
        int[][] f = new int[n][m];
        for(int coluna=0; coluna<n;coluna++) {
            for (int linha = 0; linha < m; linha++) {
                f[coluna][linha]=r[linha][coluna] ;
            }
        }
        return f;
    }
}
