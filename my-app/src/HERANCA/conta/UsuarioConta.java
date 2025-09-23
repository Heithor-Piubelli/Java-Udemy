package HERANCA.conta;

public class UsuarioConta extends Conta {
    private double limiteCredito;

    public UsuarioConta(String nome, int numeroConta, double saldo, double limiteCredito) {
        super(nome, numeroConta, saldo);// Chama o construtor da classe base (Conta)
        this.limiteCredito = limiteCredito;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public double setLimiteCredito(double limiteCredito) {
        return this.limiteCredito = limiteCredito;
    }

    public void usarLimite(double valor) {
        if (valor > 0 && valor <= limiteCredito) {
            saldo -= valor + 10.00; // saldo é herdado da classe Conta
        } else {
            System.out.println("Uso de limite inválido");
        }
    }

}
