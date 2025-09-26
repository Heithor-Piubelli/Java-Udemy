package HERANCA.empresa;

public class Pj extends Funcionario {

    private Double pagamentoAdicional;

    public Pj(String nome, int hora, double valorHora, Double pagamentoAdicional) {
        super(nome, hora, valorHora); 
        this.pagamentoAdicional = pagamentoAdicional;
    }

    public Double getPagamentoAdicional() {
        return pagamentoAdicional;
    }

    public void setPagamentoAdicional(Double pagamentoAdicional) {
        this.pagamentoAdicional = pagamentoAdicional;
    }

    @Override
    public double pagamento() {
        return super.pagamento() + pagamentoAdicional * 1.2; // Chama o método pagamento da superclasse e adiciona o pagamento adicional
    }

}
