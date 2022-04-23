import java.util.Arrays;

public class Vetor {
    public int[] calculaVetor(int [] v, int[] u){
        int[] t = new int[10];
        for(int i = 0; i<10;i++){

            if (Impar.ehImpar(v[i])==true & Impar.ehImpar(u[i])==true) {
                t[i] = v[i] - u[i];
            }else if(Impar.ehImpar(v[i])==false & Impar.ehImpar(u[i])==false){
                t[i] = v[i] + u[i];
            }else{
                t[i] = v[i] * u[i];
            }
        }
        ordenaVetor(t);
        return t;
    }
    public void ordenaVetor(int[] t){
        Arrays.sort(t);
    }
}
