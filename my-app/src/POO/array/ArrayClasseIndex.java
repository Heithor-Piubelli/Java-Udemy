package POO.array;

import java.util.Scanner;

public class ArrayClasseIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int quantidade = input.nextInt(); // Lê a quantidade de produtos
        input.nextLine(); // Consome a quebra de linha pendente após nextInt

        Produto[] vetor = new Produto[quantidade]; // Cria o array de produtos

        for (int i = 0; i < quantidade; i++) {
            String nome = input.nextLine(); // Lê o nome do produto
            double preco = input.nextDouble(); // Lê o preço do produto
            input.nextLine(); // Consome a quebra de linha após o número

            vetor[i] = new Produto(nome, preco); // Cria o objeto Produto e armazena no array
        }

        double soma = 0.0; // Variável para acumular os preços

        for (int i = 0; i < quantidade; i++) {
            soma += vetor[i].getPreco(); // Soma os preços de todos os produtos
        }

        double media = soma / quantidade; // Calcula a média dos preços

        System.out.printf("Preço médio = %.2f%n", media); // Imprime a média com 2 casas decimais

        input.close(); // Fecha o scanner
    }
}
