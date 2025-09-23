package POO.aluguel;
import java.util.Scanner;

public class AluguelIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Bem vindo ao Hotel");
        System.out.print("Quantos quartos serão alugados? ");
        int quartos = input.nextInt();
        Aluguel[] vetor = new Aluguel[10]; // Criei um vetor com 10 posições e a classe Aluguel

        for(int i = 0; i < quartos; i++){
            input.nextLine(); // Consumir a quebra de linha
            System.out.println("Aluguel #" + (i + 1) + ":");
            System.out.print("Nome: ");
            String nome = input.nextLine();
            System.out.print("Email: ");
            String email = input.nextLine();
            System.out.print("Quarto (0 a 9): ");
            int quarto = input.nextInt();
            input.nextLine(); // consumir quebra de linha
            vetor[quarto] = new Aluguel(nome, email);
        }

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] != null) {
                System.out.println(vetor[i]);
            }
        }

        

    }
}
