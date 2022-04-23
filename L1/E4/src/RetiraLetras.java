public class RetiraLetras {
    public static String retiraConsoantes(String frase){
        String frase_sem_consoantes = "";
        for (int i=0; i<frase.length(); i++) {
            if (frase.toUpperCase().charAt(i) == 65 || frase.toUpperCase().charAt(i) == 69 || frase.toUpperCase().charAt(i) == 73 || frase.toUpperCase().charAt(i) == 79 || frase.toUpperCase().charAt(i) == 85) {
                frase_sem_consoantes = frase_sem_consoantes + (frase.charAt(i));
            }
        }
        return frase_sem_consoantes;
    }
    public static String retiraVogais(String frase){
        String frase_sem_vogais = "";
        for (int i=0; i<frase.length(); i++) {
            if (!(frase.toUpperCase().charAt(i) == 65 || frase.toUpperCase().charAt(i) == 69 || frase.toUpperCase().charAt(i) == 73 || frase.toUpperCase().charAt(i) == 79 || frase.toUpperCase().charAt(i) == 85)) {
                frase_sem_vogais = frase_sem_vogais + (frase.charAt(i));
            }
        }
        return frase_sem_vogais;
    }
}
