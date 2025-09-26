package HERANCA.empresa;

public class Funcionario {
    private String nome;
    private int hora;
    private double valorHora;

    public Funcionario(String nome, int hora, double valorHora) {
        this.nome = nome;
        this.hora = hora;
        this.valorHora = valorHora;
    }

    public String getNome() {
        return nome;
    }

    public int getHora() {
        return hora;
    }

    public double getValorHora() {
        return valorHora;
    }

  public double pagamento() {
      return hora * valorHora;
  }


}
