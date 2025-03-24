import java.util.ArrayList;
import java.util.Scanner;

public class GerenciarTarefas {
    public static void main(String[] args) {
        // Cria um ArrayList para armazenar as tarefas
        ArrayList<String> tarefas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            // Exibe o menu interativo
            System.out.println("\n*** Menu de Tarefas ***");
            System.out.println("1. Adicionar Tarefa");
            System.out.println("2. Remover Tarefa");
            System.out.println("3. Listar Tarefas");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Para consumir a quebra de linha após a escolha
            
            switch (opcao) {
                case 1:
                    // Adicionar Tarefa
                    System.out.print("Digite a tarefa a ser adicionada: ");
                    String tarefaAdicionar = scanner.nextLine();
                    tarefas.add(tarefaAdicionar);
                    System.out.println("Tarefa adicionada com sucesso!");
                    break;
                
                case 2:
                    // Remover Tarefa
                    if (tarefas.isEmpty()) {
                        System.out.println("Não há tarefas para remover.");
                    } else {
                        System.out.println("Tarefas atuais:");
                        for (int i = 0; i < tarefas.size(); i++) {
                            System.out.println((i + 1) + ". " + tarefas.get(i));
                        }
                        System.out.print("Digite o número da tarefa a ser removida: ");
                        int indiceRemover = scanner.nextInt();
                        if (indiceRemover > 0 && indiceRemover <= tarefas.size()) {
                            tarefas.remove(indiceRemover - 1);
                            System.out.println("Tarefa removida com sucesso!");
                        } else {
                            System.out.println("Índice inválido!");
                        }
                    }
                    break;
                
                case 3:
                    // Listar Tarefas
                    if (tarefas.isEmpty()) {
                        System.out.println("Não há tarefas na lista.");
                    } else {
                        System.out.println("Tarefas atuais:");
                        for (int i = 0; i < tarefas.size(); i++) {
                            System.out.println((i
