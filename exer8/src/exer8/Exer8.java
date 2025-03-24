import java.util.ArrayList;
import java.util.Collections;

public class InverterOrdem {
    public static void main(String[] args) {
        // Cria o ArrayList com seis elementos
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(10);
        lista.add(20);
        lista.add(30);
        lista.add(40);
        lista.add(50);
        lista.add(60);

        // Exibe a lista na ordem original
        System.out.println("Lista original: " + lista);

        // Inverte a ordem dos elementos na lista
        Collections.reverse(lista);

        // Exibe a lista na ordem inversa
        System.out.println("Lista na ordem inversa: " + lista);
    }
}
