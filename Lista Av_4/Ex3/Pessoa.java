
public class Pessoa {
    //Atributos
    private String nome;
    private String endere�o; 
    private String telefone;
    
    public Pessoa (String nome, String endere�o, String telefone){
        this.nome = nome;
        this.endere�o = endere�o;
        this.telefone = telefone;
    }
    
    //Sets e Gets
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndere�o() {
        return endere�o;
    }

    public void setEndere�o(String endere�o) {
        this.endere�o = endere�o;
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
                +"\nEndere�o: "+endere�o
                +"\nTelefone: "+telefone;
    }
}
