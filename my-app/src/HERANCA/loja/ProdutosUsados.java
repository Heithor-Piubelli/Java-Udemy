package HERANCA.loja;

public class ProdutosUsados extends Produtos {
    private String dataFabricacao;

    public ProdutosUsados(String nome, double preco, String dataFabricacao) {
        super(nome, preco);
        this.dataFabricacao = dataFabricacao;
    }

    public String getDataFabricacao() {
        return dataFabricacao;
    }

    public String produtosGeral() {
        return "Produto Usado: "
        + "Nome: " + nome
        + ", Preço: " + preco
        + ", Data de Fabricação: " + dataFabricacao;
    }
}
