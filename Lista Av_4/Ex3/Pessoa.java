
public class Pessoa {
    //Atributos
    private String nome;
    private String enderešo; 
    private String telefone;
    
    public Pessoa (String nome, String enderešo, String telefone){
        this.nome = nome;
        this.enderešo = enderešo;
        this.telefone = telefone;
    }
    
    //Sets e Gets
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEnderešo() {
        return enderešo;
    }

    public void setEnderešo(String enderešo) {
        this.enderešo = enderešo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    //Metodos
    public String toString(){
        return "\nNome: "+nome
                +"\nEnderešo: "+enderešo
                +"\nTelefone: "+telefone;
    }
}
