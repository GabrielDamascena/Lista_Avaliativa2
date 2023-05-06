
public class Funcionario extends Pessoa{
    private int codigoFuncionario;
    
    public Funcionario (String nome, int cpf, int codigoFuncionario){
        super(nome, cpf);
        this.codigoFuncionario = codigoFuncionario;
    }
    
    //sets e gets

    public int getCodigoFuncionario() {
        return codigoFuncionario;
    }

    public void setCodigoFuncionario(int codigoFuncionario) {
        this.codigoFuncionario = codigoFuncionario;
    }
    
    //Metodos
    public String toString(){
        return super.toString()
                +"\nCódigo do Funcionario: "+codigoFuncionario;
    }
}
