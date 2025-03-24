import java.util.ArrayList;

public class MesclarArrayLists {
    public static void main(String[] args) {
        // Cria o primeiro ArrayList com cinco elementos
        ArrayList<Integer> lista1 = new ArrayList<>();
        lista1.add(1);
        lista1.add(2);
        lista1.add(3);
        lista1.add(4);
        lista1.add(5);

        // Cria o segundo ArrayList com cinco elementos
        ArrayList<Integer> lista2 = new ArrayList<>();
        lista2.add(6);
        lista2.add(7);
        lista2.add(8);
        lista2.add(9);
        lista2.add(10);

        // Cria o terceiro ArrayList para mesclar os dois anteriores
        ArrayList<Integer> listaMesclada = new ArrayList<>(lista1);  // Copia os elementos de lista1
        listaMesclada.addAll(lista2);  // Adiciona os elementos de lista2

        // Exibe o ArrayList mesclado
        System.out.println("ArrayList mesclado: " + listaMesclada);
    }
}
