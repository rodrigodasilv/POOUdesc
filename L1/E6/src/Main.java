
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n;
        Scanner leitor = new Scanner(System.in);
        do {
            System.out.println("Informe o numero de posições nos vetores: ");
            n = leitor.nextInt();
        } while (n == 0);
        int[] a = new int[n];
        int[] b = new int[n];
        Vetor.matrizAleatoria(a);
        Vetor.matrizAleatoria(b);
        int[] c = Vetor.intersecaoMatrizes(a,b);
        int[] d = Vetor.uniaoMatrizes(a,b);
        int[] e = Vetor.somaMatrizes(a,b);
        int[] f = Vetor.subtracaoMatrizes(a,b);
        int[] g = Vetor.subtracaoMatrizes(b,a);

        System.out.println("A:");
        for (int i=0;i<n;i++){
            System.out.println(a[i]);
        }
        System.out.println("B:");
        for (int i=0;i<n;i++){
            System.out.println(b[i]);
        }
        System.out.println("Interseção:");
        for (int i=0;i<n;i++){
            System.out.println(c[i]);
        }
        System.out.println("União:");
        for (int i=0;i<n*2;i++){
            System.out.println(d[i]);
        }

        System.out.println("A + B:");
        for (int i=0;i<n;i++){
            System.out.println(e[i]);
        }

        System.out.println("A - B:");
        for (int i=0;i<n;i++){
            System.out.println(f[i]);
        }

        System.out.println("B - A:");
        for (int i=0;i<n;i++){
            System.out.println(g[i]);
        }
    }
}