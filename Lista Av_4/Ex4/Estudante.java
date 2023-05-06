
public class Estudante extends Pessoa{
    private int matricula;
    
    public Estudante (String nome, int cpf, int matricula){
        super(nome, cpf);
        this.matricula = matricula;
    }
    
    //sets e gets
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    //Metodos
    public String toString(){
        return super.toString()
                +"\nMatricula: "+matricula;
    }
}
