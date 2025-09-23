package POO.banco;

public class Banco{
    private int numeroConta;
    private String nome;
    private double saldo = 0;

    //PEGANDO E ATUALIZANDO O NOME
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    //APENAS PEGANDO O NUMERO DA CONTA
    public int getNumeroConta(){
        return numeroConta;
    }

    //PEGANDO SALDO DA CONTA
    public double getSaldo(){
        return saldo;
    }
    //SEM DEPOSITO
        public Banco(int numeroConta, String nome){
        this.numeroConta = numeroConta;
        this.nome = nome;
    }

    //COM DEPOSITO INICIAL -> CONSTRUCTOR
    public Banco(int numeroConta, String nome, double depositoInicial ){
        this.numeroConta = numeroConta;
        this.nome = nome;
        depositarSaldo(depositoInicial);
    }

    //METODOS
    public void depositarSaldo(double deposito){
        this.saldo += deposito;
    }

    public void sacarSaldo(double saque){
        this.saldo -= saque + 5.0;
    }
     public String toString() {
        return "Conta "
            + numeroConta
            + ", Titular: "
            + nome
            + ", Saldo: R$ "
            + String.format("%.2f", saldo);
    }
}