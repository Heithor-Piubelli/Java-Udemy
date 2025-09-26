package HERANCA.loja;

public class ProdutosImportados extends Produtos {

    private double taxaImportacao;

    public ProdutosImportados(String nome, double preco, double taxaImportacao) {
        super(nome, preco);
        this.taxaImportacao = taxaImportacao;
    }

    public double getTaxaImportacao() {
        return taxaImportacao;
    }

    public String produtosGeral() {
        return "Produto Importado: "
        +"Nome: " + nome
        + ", Preço: " + preco
        + ", Taxa de Importação: " + taxaImportacao;
    }
}
