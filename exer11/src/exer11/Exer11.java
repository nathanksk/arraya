import java.util.ArrayList;

public class SomarArrayList {
    public static void main(String[] args) {
        // Cria o ArrayList de números decimais
        ArrayList<Double> numeros = new ArrayList<>();
        numeros.add(10.5);
        numeros.add(20.3);
        numeros.add(30.1);
        numeros.add(5.7);
        numeros.add(4.4);

        // Inicializa a variável para armazenar a soma
        double soma = 0;

        // Percorre o ArrayList e soma os valores
        for (Double numero : numeros) {
            soma += numero;
        }

        // Exibe o resultado da soma
        System.out.println("Soma dos valores: " + soma);
    }
}
