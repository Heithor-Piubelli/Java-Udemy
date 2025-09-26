package HERANCA.abstrato;

public class Pj extends Clt {
    private int numeroFuncionarios;

    public Pj(String nome, double rendaAnual, double gastosSaude, int numeroFuncionarios) {
        super(nome, rendaAnual, gastosSaude);
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public int getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    @Override
    public double imposto() {
        if (this.numeroFuncionarios > 10) {
            return this.rendaAnual * 0.14;
        } else {
            return this.rendaAnual * 0.16;
        }
    }

    public String dadosFuncionario() {
        return "Pessoa Jurídica: "
        + "Nome: " + nome 
        + ", Renda Anual: " + rendaAnual
        + ", Número de Funcionários: " + numeroFuncionarios
        + ", Imposto: " + String.format("%.2f", imposto());
    }
}
