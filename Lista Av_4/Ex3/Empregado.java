
public class Empregado extends Pessoa{
    protected int codigoSetor;
    protected double salarioBase;
    protected double imposto;
    
    public Empregado(String nome, String endereço, String telefone, int codigoSetor, double salarioBase, double imposto){
        super(nome,endereço,telefone);
        this.codigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
        this.imposto = imposto;    
    }
    
    //Sets e Gets
    public int getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }
    
    //Metodos    
    public double calcularSalario(double calcularSalario){
        double salarioFinal = salarioBase - (imposto * salarioBase);
        return salarioFinal;
    }
    
    public String toString(){
        return super.toString()
                +"\nCódigo Setor: "+codigoSetor
                +"\nSalário Base: "+salarioBase
                +"\nImposto cobrado: "+imposto;
    }
}
