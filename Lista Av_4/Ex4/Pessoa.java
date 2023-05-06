
public class Pessoa {
    private String nome;
    private int cpf;
    
    public Pessoa (String nome, int cpf){
        this.nome = nome;
        this.cpf = cpf;
    }
    
    //Sets e Gets
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    
    //Metodos
    public String toString(){
        return "\nNome: "+nome
                +"\nCPF: "+cpf;
    }
}
