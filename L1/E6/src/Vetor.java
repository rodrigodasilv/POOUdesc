import java.util.Random;
public class Vetor {
    public static int[] intersecaoMatrizes(int a[],int b[]){
        int n = a.length;
        int[] c = new int [n];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if(a[i]==b[j]){
                    c[i] = a[i];
                }
            }
        }
        return c;
    }
    public static int[] uniaoMatrizes(int a[],int b[]){
        int n = a.length;
        int[] c = new int [n*2];
        int k=0;
        for (int i=0;i<n;i++){
            c[k++]=a[i];
        }
            for (int i=0;i<n;i++){

                if(!existeNaMatriz(b[i],c,k)){
                    c[k++] = b[i];
                }

        }
        return c;
    }

    public static int[] somaMatrizes(int x[],int y[]){
        int n = x.length;
        int[] z = new int [n];
        for (int i=0;i<n;i++){
            z[i] = x[i] + y[i];
        }
        return z;
    }

    public static int[] subtracaoMatrizes(int x[],int y[]){
        int n = x.length;
        int[] z = new int [n];
        for (int i=0;i<n;i++){
            z[i] = x[i] - y[i];
        }
        return z;
    }

    private static boolean existeNaMatriz(int x, int [] c, int k){
        for (int i =0;i<k;i++){
            if(c[i]==x){
                return true;
            }
        }
        return false;
    }
    public static void matrizAleatoria(int x[]){
        int n = x.length;
        Random gerador = new Random();
        for (int i=0;i<n;i++){
            x[i]= gerador.nextInt(999);
        }
    }
}
