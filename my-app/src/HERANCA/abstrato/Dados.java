package HERANCA.abstrato;

public abstract class Dados {
    protected String nome;
    protected double rendaAnual;

    public Dados(String nome, double rendaAnual) {
        this.nome = nome;
        this.rendaAnual = rendaAnual;
    }

    public String getNome() {
        return nome;
    }

    public double getRendaAnual() {
        return rendaAnual;
    }

    public abstract double imposto();

    public abstract String dadosFuncionario();

}
