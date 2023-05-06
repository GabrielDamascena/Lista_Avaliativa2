
public class Administrador extends Empregado{
    private double ajudaDeCusto;
    
    public Administrador(String nome, String endere�o, String telefone, int codigoSetor, double salarioBase, double imposto, double ajudaDeCusto){
        super(nome,endere�o,telefone, codigoSetor, salarioBase, imposto);
        this.ajudaDeCusto = ajudaDeCusto; 
    }
    
    //Sets e Gets
    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }
    
    //Metodos
    public double calcularSalario(double calcularSalario){
        double salarioFinal = salarioBase - (imposto * salarioBase) + ajudaDeCusto;
        return salarioFinal;
    }
    
    public String toString(){
        return super.toString()
                +"\nAjuda de custo: "+ajudaDeCusto;
    }
    
}
