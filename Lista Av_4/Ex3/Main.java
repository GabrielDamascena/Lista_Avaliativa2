
public class Main {

    public static void main(String[] args) {
        Fornecedor f = new Fornecedor("Miguel", "Rua 8 Vicente Pires", "61 9 8888-8888", 20000.00, 15000.00);
        Empregado e = new Empregado("João", "Taguatinga QNB", "61 9 7777-7777", 123, 35000.00, 0.1);
        Administrador a = new Administrador("Beni Lucca", "Taguatinga QNC", "61 9 6666-6666", 321, 35000.00, 0.1, 300.00);
        Operario o = new Operario("Nicolas", "Rua 4 Vicente Pires", "61 9 5555-5555", 456, 25000.00, 0.1, 500.00, 0.1);
        Vendedor v = new Vendedor("Arthur", "Riacho Fundo 2", "61 9 4444-4444", 654, 35000.00, 0.1, 8000.00, 0.1);
        
        //Obter Salário Fornecedor
        double obterSaldo = f.obterSaldo(0);
        System.out.println("\nFornecedor: "+f.toString()+"\nSaldo: "+f.obterSaldo(obterSaldo));
    
        //Salário com impostos Empregado
        double SalarioFinal = e.calcularSalario(obterSaldo);
        System.out.println("\nEmpregado: "+e.toString()+"\nSalario Final: "+e.calcularSalario(obterSaldo));
    
        //Salário com impostos e a ajuda de custo
        double SFA = a.calcularSalario(obterSaldo);
        System.out.println("\nAdministrador: "+a.toString()+"\nSalario Final: "+a.calcularSalario(obterSaldo));
    
        //Salário de um Operário
        double SFO = o.calcularSalario(obterSaldo);
        System.out.println("\nOperario: "+o.toString()+"\nSalario Final: "+o.calcularSalario(obterSaldo));
    
        //Salario de um Vendedor
        double SFV = v.calcularSalario(obterSaldo);
        System.out.println("\nVendedor: "+v.toString()+"\nSalario Final: "+v.calcularSalario(obterSaldo));
    }
    
}
