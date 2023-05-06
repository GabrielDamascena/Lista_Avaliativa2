
public class Professor extends Funcionario{
    private String disciplina;
    
    public Professor (String nome, int cpf, int codigoFuncionario, String disciplina){
        super(nome, cpf, codigoFuncionario);
        this.disciplina = disciplina;
    }
    
    //sets e gets

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    
    //Metodos
    public String toString(){
        return super.toString()
                +"\nDisciplina: "+disciplina;
    }
}
