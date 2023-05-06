
public class Cachorro extends Animal{
    private String ra�a;
    
    //Construtores
    public Cachorro (String nome, double peso, String ra�a){
        super(nome, peso);
        this.ra�a = ra�a;
    }
    
    //Sets e Gets
    public String getRa�a() {
        return ra�a;
    }

    public void setRa�a(String ra�a) {
        this.ra�a = ra�a;
    }
    
    //Metodos
    public String toString(){
        return super.toString()
                + "\nRa�a: " +ra�a;
    }
}
