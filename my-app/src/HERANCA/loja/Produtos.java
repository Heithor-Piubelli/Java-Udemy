package HERANCA.loja;

public class Produtos {

    protected String nome;
    protected double preco;

    public Produtos(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String produtosGeral() {
        return "Produto: "
        + "Nome: " + nome 
        + ", Preço: " + preco;
    }
}
