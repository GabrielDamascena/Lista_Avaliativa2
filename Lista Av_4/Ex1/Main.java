
public class Main {

    public static void main(String[] args) {
        
        Peixe p = new Peixe("Miguel", 26.66, "Água doce");
        Cachorro c = new Cachorro("Spike", 50.86, "Pitbull");
        
        System.out.println("Dados Peixe: "+p.toString());
        System.out.println("\nDados Cachorro: "+c.toString());
    }
    
}
