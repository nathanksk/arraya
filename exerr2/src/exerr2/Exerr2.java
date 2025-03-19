import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Criando um ArrayList de strings e adicionando os nomes
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Ana");
        nomes.add("Carlos");
        nomes.add("Bruna");
        nomes.add("Daniel");
        nomes.add("Eduardo");

        // Criando um Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Exibindo a lista original
        System.out.println("Lista original: " + nomes);

        // Pedindo ao usuário para informar o nome que deseja remover
        System.out.print("Digite o nome que você deseja remover: ");
        String nomeParaRemover = scanner.nextLine();

        // Verificando se o nome existe na lista
        if (nomes.contains(nomeParaRemover)) {
            nomes.remove(nomeParaRemover);  // Remove o nome
            System.out.println("Nome removido com sucesso.");
        } else {
            System.out.println("Nome não encontrado na lista.");
        }

        // Exibindo a lista atualizada
        System.out.println("Lista atualizada: " + nomes);

        scanner.close();  // Fecha o scanner
    }
}
