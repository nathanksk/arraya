import java.util.ArrayList;

public class CopiarArrayList {
    public static void main(String[] args) {
        // Cria o ArrayList original de nomes
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Ana");
        nomes.add("Carlos");
        nomes.add("Beatriz");
        nomes.add("João");
        nomes.add("Mariana");

        // Exibe o ArrayList original
        System.out.println("ArrayList original: " + nomes);

        // Copia os elementos para um novo ArrayList
        ArrayList<String> copiaNomes = new ArrayList<>(nomes);

        // Exibe o novo ArrayList (cópia)
        System.out.println("ArrayList copiado: " + copiaNomes);
    }
}
