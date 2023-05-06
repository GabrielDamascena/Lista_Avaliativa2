
public class Peixe extends Animal{
    private String tipoHabitat;
    
    //Construtores
    public Peixe (String nome, double peso, String tipoHabitat){
        super(nome, peso);
        this.tipoHabitat = tipoHabitat;
    }
    
    //Sets e Gets
    public String getTipoHabitat() {
        return tipoHabitat;
    }

    public void setTipoHabitat(String tipoHabitat) {
        this.tipoHabitat = tipoHabitat;
    }
    
    //Metodos
    public String toString(){
        return super.toString()
                + "\nTipo Habitat: " +tipoHabitat;
    }
}
