
public class Empregado extends Pessoa{
    private double salario;
    private String matricula;
    
    public Empregado (String nome, int idade, String sexo, double salario, String matricula){
        super(nome, idade, sexo);
        this.salario = salario;
        this.matricula = matricula;
    }
    
    //Sets e Gets
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    //Metodos
    public double valorInss(double valorInss){
        double vInss = salario * valorInss;
        return vInss;
    }
    
    public String toString(){
        return super.toString() 
                + "\nSalário: " +salario
                + "\nMatrícula: " +matricula;
    }
}
