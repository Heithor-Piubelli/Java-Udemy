package POO.encapsulamento;
import java.util.Scanner;

public class LojaIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
            System.out.println("Digite o nome do produto:");
            String nome = input.nextLine();
            System.out.println("Digite o preço do produto:");
            double preco = input.nextDouble();

            Loja produto = new Loja();
            produto.setNome(nome);
            produto.setPreco(preco);
            System.out.println("Produto cadastrado:");
            System.out.println("Produto: " + produto.getNome());
            System.out.println("Preço: " + produto.getPreco());

    }
}
