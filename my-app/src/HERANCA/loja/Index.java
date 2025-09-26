package HERANCA.loja;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Index {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Produtos> produtosCadastro = new ArrayList<>(); // Lista para armazenar os produtos cadastrados

        System.err.println("Digite o número de produtos que deseja cadastrar: ");
        int quantidadeProdutos = input.nextInt();
        input.nextLine(); // Consumir a quebra de linha após o nextInt()

        for (int i = 1; i <= quantidadeProdutos; i++) {
            System.out.println("Produto #" + i + " é (1) Normal, (2) Usado, ou (3) Importado?");
            int tipo = input.nextInt();
            input.nextLine(); // consumir quebra de linha

            System.out.println("Nome do produto: ");
            String nome = input.nextLine();

            System.out.println("Preço do produto: ");
            double preco = input.nextDouble();
            input.nextLine(); // <<< consome a quebra de linha do nextInt()

            if (tipo == 1) {
                Produtos p = new Produtos(nome, preco);
                produtosCadastro.add(p);
            } else if (tipo == 2) {
                System.out.println("Data de Fabricação do produto (aaaa-mm-dd): ");
                String dataFabricacao = input.nextLine();

                ProdutosUsados pu = new ProdutosUsados(nome, preco, dataFabricacao);
                produtosCadastro.add(pu);
            } else if (tipo == 3) {
                System.out.println("Taxa de alfândega do produto: ");
                double taxaImportacao = input.nextDouble();

                ProdutosImportados pi = new ProdutosImportados(nome, preco, taxaImportacao);
                produtosCadastro.add(pi);
            }
        }
        for (Produtos prod : produtosCadastro) { //aqui vai imprimir todos os produtos cadastrados
            System.out.println(prod.produtosGeral());
        }
    }
}
