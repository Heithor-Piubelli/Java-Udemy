package POO.salario;

public class Funcionario {
    public String nome;
    public double salarioBruto;
    public double imposto;

    public double salarioLiquido(){
        return salarioBruto - imposto;
    }

    public void novoSalario(double porcentagem){ //porcentagem é o parametro do metodo 
        this.salarioBruto += (salarioBruto * porcentagem) / 100.0;
    }

    public String toString() {
        return nome
                + ", salário bruto: R$ "
                + String.format("%.2f", salarioBruto)
                + ", salário líquido: R$ "
                + String.format("%.2f", salarioLiquido());
    }

}
