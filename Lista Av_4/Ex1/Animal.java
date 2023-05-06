
public class Animal {
    private String nome;
    private double peso;

    //Construtores
    public Animal (String nome, double peso){
        this.nome = nome;
        this.peso = peso;
    }
    //Sets e Gets
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    //Metodos
    public String toString(){
        return "\nNome: " +nome
                + "\nPeso: " +peso;
    }
    
}
