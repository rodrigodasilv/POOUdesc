import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] v = new int[10];
        int[] u = new int[10];
        int[] t;
        Scanner leitor = new Scanner(System.in);
        Vetor vetor = new Vetor();
        for (int i = 0; i < 10; i++){
            System.out.println("Informe o valor da posição " + (i+1) + " do vetor V:");
            v[i] = leitor.nextInt();
        }
        for (int i = 0; i < 10; i++){
            System.out.println("Informe o valor da posição " + (i+1) + " do vetor U:");
            u[i] = leitor.nextInt();
        }
        t = vetor.calculaVetor(v,u);
        for (int i = 0; i < 10; i++){
            System.out.println(t[i]);

        }
    }
}
