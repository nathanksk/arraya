import java.util.ArrayList;
import java.util.HashSet;

public class RemoverDuplicados {
    public static void main(String[] args) {
        // Cria o ArrayList com alguns números, incluindo duplicatas
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(2);
        lista.add(4);
        lista.add(1);
        lista.add(5);

        // Exibe a lista original
        System.out.println("Lista original: " + lista);

        // Remover duplicatas usando HashSet
        HashSet<Integer> conjunto = new HashSet<>(lista);
        
        // Converte de volta para ArrayList (se necessário)
        ArrayList<Integer> listaSemDuplicados = new ArrayList<>(conjunto);

        // Exibe a lista sem repetições
        System.out.println("Lista sem duplicatas: " + listaSemDuplicados);
    }
}
