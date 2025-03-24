import java.util.ArrayList;

class Aluno {
    String nome;
    double nota;

    Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Aluno> alunos = new ArrayList<>();
        alunos.add(new Aluno("Lucas", 7.8));
        alunos.add(new Aluno("Gabriela", 8.2));
        alunos.add(new Aluno("Pedro", 6.5));
        alunos.add(new Aluno("Juliana", 9.0));
        alunos.add(new Aluno("Felipe", 7.3));

        System.out.println("Lista de Alunos:");
        for (Aluno aluno : alunos) {
            System.out.println(aluno.nome + " - " + aluno.nota);
        }

        double somaNotas = 0;
        for (Aluno aluno : alunos) {
            somaNotas += aluno.nota;
        }
        double media = somaNotas / alunos.size();
        System.out.println("\nMédia das notas: " + media);
    }
}
