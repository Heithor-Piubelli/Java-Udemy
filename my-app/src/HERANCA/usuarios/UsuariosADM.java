package HERANCA.usuarios;

public class UsuariosADM extends Usuarios {
    private String tipo;

    public UsuariosADM(String nome, String email, String senha, String tipo) {
        super(nome, email, senha);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void exibirInfo() {
        System.out.println("Nome: " + getNome());
        System.out.println("Email: " + getEmail());
        if(tipo.equals("ADM")){
            System.out.println("Tipo: " + getTipo() + " - Acesso total ao sistema.");
        } else {
            System.out.println("Tipo: " + getTipo() + " - Acesso restrito.");
        }
    }
}
