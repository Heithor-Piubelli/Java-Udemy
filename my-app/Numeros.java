import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Quantos números vai digitar?");
        int numeros = input.nextInt();

        int[] vetor = null;

        // Verifica se o número digitado está dentro do limite permitido
        if (numeros > 10) {
            System.out.println("ERRO: só pode até 10 números.");
        } else {
            // Cria o vetor com o tamanho informado
            vetor = new int[numeros];

            // Lê os números e armazena no vetor
            for (int i = 0; i < numeros; i++) {
                System.out.print("Digite um número: ");
                vetor[i] = input.nextInt();
            }
        }

        // Mostra os números negativos, se o vetor foi criado
        if (vetor != null) {
            System.out.println("Números negativos:");
            for (int i = 0; i < numeros; i++) {
                if (vetor[i] < 0) {
                    System.out.println(vetor[i]);
                }
            }
        }

        input.close();
    }
}