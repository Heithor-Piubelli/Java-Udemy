package HERANCA.conta;

public class Conta {
    private String nome;
    private int numeroConta;
    protected double saldo; // saldo é protegido para permitir acesso em subclasses, pq se fosse só private, UsuarioConta não conseguiria acessar

    public Conta(String nome, int numeroConta, double saldo) {
        this.nome = nome;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }
    public int getNumeroConta() {
        return numeroConta;
    }
    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor){
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saque inválido");
        }
    }

    public void depositar(double valor){
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Depósito inválido");
        }
    }


}
