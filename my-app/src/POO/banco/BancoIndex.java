
package POO.banco;

import java.util.Scanner;

public class BancoIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Bem vindo ao banco");

        System.out.print("Digite seu nome: ");
        String nome = input.nextLine();

        System.out.print("Digite o número da conta: ");
        int numeroConta = input.nextInt();
        input.nextLine(); // limpar quebra de linha

        System.out.print("Deseja fazer um depósito inicial? (s/n): ");
        String resposta = input.nextLine();

        Banco conta; // declara o objeto aqui para usar depois

        if (!resposta.equalsIgnoreCase("s")) {
            conta = new Banco(numeroConta, nome);
        } else {
            System.out.print("Quanto deseja depositar: ");
            double depositoInicial = input.nextDouble();
            conta = new Banco(numeroConta, nome, depositoInicial);
        }

        System.out.println();
        System.out.println("Dados da conta:");
        System.out.println(conta);

        System.out.println();
        System.out.print("Digite um valor para depósito: ");
        double depositValue = input.nextDouble();
        conta.depositarSaldo(depositValue);
        System.out.println("Dados atualizados:");
        System.out.println(conta);

        System.out.println();
        System.out.print("Digite um valor para saque: ");
        double withdrawValue = input.nextDouble();
        conta.sacarSaldo(withdrawValue);
        System.out.println("Dados atualizados:");
        System.out.println(conta);

        input.close();
    }
}