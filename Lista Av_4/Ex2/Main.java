
public class Main {

    public static void main(String[] args) {
        Cliente c = new Cliente("Miguel", 21, "Masculino", 300.00, 2002);
        Gerente g = new Gerente("Beni Lucca", 21, "Masculino", 27000.00, "12345", "Gerente Chefe");
        Vendedor v = new Vendedor("João", 21, "Masculino", 27000.00, "54321", 9000.00, 9);
        
        double vInssG = g.valorInss(0.11);
        double vInssV = v.valorInss(0.11);
        
        System.out.println("\nCliente: "+c.toString());
        System.out.println("\nGerente: "+g.toString()+"\nInss do Gerente: " +vInssG);
        System.out.println("\nVendedor"+v.toString()+ "\nInss do Vendedor: " +vInssV);
    }
}
