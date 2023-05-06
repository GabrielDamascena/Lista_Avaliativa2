
public class Diretor extends Funcionario{
    private double gratificaçao;
    
    public Diretor (String nome, int cpf, int codigoFuncionario, double gratificaçao){
        super(nome, cpf, codigoFuncionario);
        this.gratificaçao = gratificaçao;
    }
    
    //sets e gets

    public double getGratificaçao() {
        return gratificaçao;
    }

    public void setGratificaçao(double gratificaçao) {
        this.gratificaçao = gratificaçao;
    }
    
    //Metodos
    public String toString(){
        return super.toString()
                +"\nGratificação: R$ "+gratificaçao;
    }
}
