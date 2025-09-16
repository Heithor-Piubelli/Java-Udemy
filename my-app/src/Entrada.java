import java.util.Scanner; 

public class Entrada {
    public static void main(String[] args) { // enterPoint
        Scanner input = new Scanner(System.in); //aqui eu criei uma variavel input que vai servir para entrada de dados, por isso o System.in
        
        String name;

        System.out.println("Digite seu nome");
        name = input.nextLine();
        System.out.println("Bem vindo: " + name);

        input.close();
    }
}