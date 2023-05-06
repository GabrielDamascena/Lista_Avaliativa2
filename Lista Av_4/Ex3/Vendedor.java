
public class Vendedor extends Empregado{
    private double valorVendas;
    private double comissao;
    
    public Vendedor(String nome, String endereço, String telefone, int codigoSetor, double salarioBase, double imposto, double valorVendas, double comissao){
        super(nome,endereço,telefone, codigoSetor, salarioBase, imposto);
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }
    
    //Sets e Gets
    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
    
    //Metodos
    public double calcularSalario(double calcularSalario){
        double salarioFinal = salarioBase - (imposto * salarioBase) + (comissao * valorVendas);
        return salarioFinal;
    }
    
    public String toString(){
        return super.toString()
                +"\nValor das Vendas: "+valorVendas
                +"\nValor Comissão: "+comissao;
    }
}
