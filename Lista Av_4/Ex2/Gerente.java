
public class Gerente extends Empregado{
    private String nomeGerencia;
    
    public Gerente (String nome, int idade, String sexo, double salario, String matricula, String nomeGerencia){
        super(nome, idade, sexo, salario, matricula);
        this.nomeGerencia = nomeGerencia;
    }
    
    //Sets e Gets
    public String getNomeGerencia() {
        return nomeGerencia;
    }

    public void setNomeGerencia(String nomeGerencia) {
        this.nomeGerencia = nomeGerencia;
    }
    
    //Metodos
    public String toString(){
        return super.toString()
                +"\nNome Gerencia: "+nomeGerencia;
    }
    
}
