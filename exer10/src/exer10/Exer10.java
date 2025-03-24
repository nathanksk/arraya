import java.util.ArrayList;
import java.util.Iterator;

public class UsarIterator {
    public static void main(String[] args) {
        // Cria o ArrayList com cinco números inteiros
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);

        // Obtém o Iterator para percorrer o ArrayList
        Iterator<Integer> iterator = numeros.iterator();

        // Percorre e exibe os elementos usando o Iterator
        System.out.println("Elementos do ArrayList:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
