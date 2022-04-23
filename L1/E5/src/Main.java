import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int i,j;
        Scanner leitor = new Scanner(System.in);
        do {
            System.out.println("Informe o numero de linhas da matriz: ");
            i = leitor.nextInt();
            System.out.println("Informe o numero de colunas da matriz: ");
            j = leitor.nextInt();
        }while(i==j);
        int[][] y = new int[i][j];
        int[][] x = new int[i][j];
        int[][] z = new int[i][j];

        Matriz.geraMatrizAleatoria(i,j,x);
        Matriz.geraMatrizAleatoria(i,j,y);
        Matriz.somaMatrizes(i,j,x,y,z);

        System.out.println("Matriz C:");
        for(int linha=0; linha<i;linha++) {
            for (int coluna = 0; coluna < j; coluna++) {
                System.out.println(z[linha][coluna]+" ");
            }
            System.out.println("\n");
        }

        int[][] r = Matriz.matrizTransposta(i,j,z);
        System.out.println("Matriz transposta:");
        for(int linha=0; linha<i;linha++) {
                for (int coluna = 0; coluna < j; coluna++) {
                    System.out.println(r[coluna][linha]+" ");
                }
                System.out.println("\n");
            }
        }
    }

