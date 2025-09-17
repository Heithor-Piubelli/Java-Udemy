package POO.salario;
import java.util.Scanner;

public class FuncionarioIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();

        System.out.println("Bem vindo ao sistema de salário!");

        System.out.println("Digite o nome do funcionário:");
        funcionario.nome = input.nextLine();

        System.out.println("Digite o salário bruto do funcionário:");
        funcionario.salarioBruto = input.nextDouble();

        System.out.println("Digite o imposto do funcionário:");
        funcionario.imposto = input.nextDouble();

        System.out.println("Salário atualizado R$ " + funcionario.salarioLiquido());

        System.out.println("Digite a porcentagem para aumentar o salário:");
        double porcentagem = input.nextDouble();
        funcionario.novoSalario(porcentagem);//passando o argumento para o parametro do metodo, como ele não é um atributo da classe, precisa ser passado como argumento do metodo

        System.out.println(funcionario.toString());

    }
}
