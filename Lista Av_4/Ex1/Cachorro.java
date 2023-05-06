
public class Cachorro extends Animal{
    private String raça;
    
    //Construtores
    public Cachorro (String nome, double peso, String raça){
        super(nome, peso);
        this.raça = raça;
    }
    
    //Sets e Gets
    public String getRaça() {
        return raça;
    }

    public void setRaça(String raça) {
        this.raça = raça;
    }
    
    //Metodos
    public String toString(){
        return super.toString()
                + "\nRaça: " +raça;
    }
}
