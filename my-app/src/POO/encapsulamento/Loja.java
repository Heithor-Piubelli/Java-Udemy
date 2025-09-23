package POO.encapsulamento;

public class Loja {
    private String nome; // atributos privados
    private double preco;

    public String getNome() { //método público para acessar o atributo privado
        return this.nome;
    }

    public void setNome(String nome){ //método público para modificar o atributo privado
        this.nome = nome;
    }

    public double getPreco(){
        return this.preco;
    }

    public void setPreco(double preco){
        if(preco < 0){
            System.out.println("Preço inválido");
        } else {
            this.preco = preco;
        }
    }
}
