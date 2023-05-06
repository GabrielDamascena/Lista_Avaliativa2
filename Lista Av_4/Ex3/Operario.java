
public class Operario extends Empregado{
    private double valorProducao;
    private double comissao;
    
    public Operario(String nome, String endere�o, String telefone, int codigoSetor, double salarioBase, double imposto, double valorProducao, double comissao){
        super(nome,endere�o,telefone, codigoSetor, salarioBase, imposto);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    }
    
    //Sets e Gets
    public double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
    
    //Metodos
    public double calcularSalario(double calcularSalario){
        double salarioFinal = salarioBase - (imposto * salarioBase) + (comissao * valorProducao);
        return salarioFinal;
    }
    
    public String toString(){
        return super.toString()
                +"\nValor Produ��o: "+valorProducao
                +"\nValor Comiss�o: "+comissao;
    }
}
