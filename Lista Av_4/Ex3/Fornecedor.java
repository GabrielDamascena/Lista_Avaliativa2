
public class Fornecedor extends Pessoa{
    private double valorCredito;
    private double valorDivida;
    
    public Fornecedor (String nome, String endereço, String telefone, double valorCredito, double valorDivida){
        super(nome, endereço,telefone);
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }
    
    //Sets e Gets
    public double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }
    
    //Metodos
    public double obterSaldo(double obterSaldo){
        double os = valorCredito - valorDivida;
        return os;
    }
    
    public String toString(){
        return super.toString()
                +"\nValor Credito: "+valorCredito
                +"\nValor Divida: "+valorDivida;
    }
}
