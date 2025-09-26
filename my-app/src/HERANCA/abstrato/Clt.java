package HERANCA.abstrato;

public class Clt extends Dados{
    private double gastosSaude;

    public Clt(String nome, double rendaAnual, double gastosSaude) {
        super(nome, rendaAnual);
        this.gastosSaude = gastosSaude;
    }

    public double getGastosSaude() {
        return gastosSaude;
    }

    @Override
    public double imposto() {
        if(this.rendaAnual < 20000.00){
            return (this.rendaAnual * 0.15) - (this.gastosSaude * 0.50);
        } else {
            return (this.rendaAnual * 0.25) - (this.gastosSaude * 0.50);
        }
    }

    public String dadosFuncionario() {
        return "Pessoa Física: "
        + "Nome: " + nome 
        + ", Renda Anual: " + rendaAnual
        + ", Gastos com Saúde: " + gastosSaude
        + ", Imposto: " + String.format("%.2f", imposto());
    }

}
