package POO.contaSimples;
import java.util.Scanner; 

public class Conta {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
     
    Funcao num01, num02;
    num01 = new Funcao();// cria um objeto num01 da classe Funcao
    num02 = new Funcao();

    System.out.println("Digite o primeiro numero:");
    num01.valor01 = input.nextDouble();  // armazena o valor digitado no atributo valor01 do objeto num01
    System.out.println("Digite o segundo numero:");
    num01.valor02 = input.nextDouble();
     
      System.out.println("A soma dos dois numeros é: " + num01.soma());
   }

}
