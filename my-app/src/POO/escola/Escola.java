package POO.escola;

public class Escola {

    public String nome;
    public int nota01;
    public int nota02;
    public int nota03;
    public int nota04;

    public String verificarSituacao(){
        int media = (nota01 + nota02 + nota03 + nota04) / 4;
        if(nota01 < 0 || nota01 > 10 || nota02 < 0 || nota02 > 10 || nota03 < 0 || nota03 > 10 || nota04 < 0 || nota04 > 10){
            return "Nota invalida";
        } else
        if (media >= 7){
            return "Aprovado";
        } else {
            return "Reprovado";
            
        }
    }

    public String toString(){
        return "Aluno: " + nome
        + ", " 
        + "primeiro Bi: " + nota01
        + ", " 
        + "segundo Bi: " + nota02
        + ", " 
        + "terceiro Bi: " + nota03
        + ", " 
        + "quarto Bi: " + nota04
        + ", "
        + "Situacao: " + verificarSituacao();
    }
}
