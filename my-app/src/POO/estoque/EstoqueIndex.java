package POO.estoque;
import java.util.Scanner;

public class EstoqueIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Cria objeto produto da classe Estoque
        Estoque produto = new Estoque();

        System.out.println("Bem vindo ao sistema de estoque!");

        System.out.println("Digite o nome do produto:");
        produto.nome = input.nextLine();

        System.out.println("Digite o preço do produto:");
        produto.preco = input.nextDouble();

        System.out.println("Digite a quantidade do produto no estoque:");
        produto.quantidade = input.nextInt();

        System.out.println(produto.toString()); //tranformando objeto em string para evitar um texto giggante


    }
}
