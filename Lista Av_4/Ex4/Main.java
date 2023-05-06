
public class Main {

    public static void main(String[] args) {
        
        Estudante e = new Estudante("Miguel", 102030, 123);
        Professor p = new Professor("Luíz", 123000, 564, "Português");
        Diretor d = new Diretor("Francisca", 909090, 784, 5000.00);
        
        System.out.println("\nEstudante: "+e.toString());
        System.out.println("\nProfessor: "+p.toString());
        System.out.println("\nDiretor: "+d.toString());
    }
    
}
