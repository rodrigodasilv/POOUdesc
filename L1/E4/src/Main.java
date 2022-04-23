import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int decisao;
        String frase;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe a frase:");
        frase = leitor.next();
        System.out.println("Informe:\n");
        System.out.println("1 - para tirar as consoantes da frase\n");
        System.out.println("2 - para tirar as vogais da frase\n");
        decisao = leitor.nextInt();
        switch (decisao) {
            case 1 -> frase = RetiraLetras.retiraConsoantes(frase);
            case 2 -> frase = RetiraLetras.retiraVogais(frase);
            default -> {
            }
        }
        System.out.println("A nova frase é: " + frase);
    }
}
