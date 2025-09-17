package POO.estoque;

public class Estoque {
    public String nome;
    public double preco;
    public int quantidade;

    public double valorTotalEmEstoque() {
        return preco * quantidade;
    }

    public void adicionarProduto(int quantidade) { // criei um metodo com void pois ele nao me retrona nada
        this.quantidade += quantidade; // this se refere ao atributo da classe
    }

    public void tirarProduto(int quantidade) {
        this.quantidade -= quantidade;
    }

    public String toString() {
        return nome
                + ", $ "
                + String.format("%.2f", preco)
                + ", "
                + quantidade
                + " quantidade, Total: $ "
                + String.format("%.2f", valorTotalEmEstoque());
    }
}
