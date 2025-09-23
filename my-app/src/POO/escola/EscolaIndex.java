package POO.escola;
import java.util.Scanner;

public class EscolaIndex {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        Escola escola = new Escola();

    System.out.println("Bem vindo ao sistema");
    
    System.out.println("Digite o seu nome:");
    escola.nome = input.nextLine();

    System.out.println("Digite a sua primeira nota:"); 
    escola.nota01 = input.nextInt();

    System.out.println("Digite a sua segunda nota:");
    escola.nota02 = input.nextInt();

    System.out.println("Digite a sua terceira nota:");
    escola.nota03 = input.nextInt();

    System.out.println("Digite a sua quarta nota:");
    escola.nota04 = input.nextInt();

    System.out.println(escola.toString());
    }
}
