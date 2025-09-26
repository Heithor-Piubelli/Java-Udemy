package HERANCA.abstrato;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Index {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Dados> lista = new ArrayList<>();
        System.out.println("Digite a quantidade de contribuintes: ");
        int quantidade = input.nextInt();

        for (int i = 1; i <= quantidade; i++) {
            System.out.println("Digite os dados do contribuinte " + i + ": ");

            System.out.println("Pessoa Física ou Jurídica (f/j)? ");
            char tipo = input.next().charAt(0);
            input.nextLine(); // Consumir a quebra de linha após o nextInt()

            if (tipo == 'f') {
                System.out.println("Nome: ");
                String nome = input.nextLine();

                System.out.println("Renda Anual: ");
                double rendaAnual = input.nextDouble();

                System.out.println("Gastos com Saúde: ");
                double gastosSaude = input.nextDouble();
                Dados pf = new Clt(nome, rendaAnual, gastosSaude);
                lista.add(pf);
            } else if (tipo == 'j') {
                System.out.println("Nome: ");
                String nome = input.nextLine();

                System.out.println("Renda Anual: ");
                double rendaAnual = input.nextDouble();

                System.out.println("Número de Funcionários: ");
                int numeroFuncionarios = input.nextInt();
                Dados pj = new Pj(nome, rendaAnual, 0.0, numeroFuncionarios);
                lista.add(pj);
            }
        }
        for (Dados dados : lista) {
            System.out.println(dados.dadosFuncionario());
        }
    }

}
