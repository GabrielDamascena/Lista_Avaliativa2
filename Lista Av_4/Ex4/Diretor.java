
public class Diretor extends Funcionario{
    private double gratifica�ao;
    
    public Diretor (String nome, int cpf, int codigoFuncionario, double gratifica�ao){
        super(nome, cpf, codigoFuncionario);
        this.gratifica�ao = gratifica�ao;
    }
    
    //sets e gets

    public double getGratifica�ao() {
        return gratifica�ao;
    }

    public void setGratifica�ao(double gratifica�ao) {
        this.gratifica�ao = gratifica�ao;
    }
    
    //Metodos
    public String toString(){
        return super.toString()
                +"\nGratifica��o: R$ "+gratifica�ao;
    }
}
