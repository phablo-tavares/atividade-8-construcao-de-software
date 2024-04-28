import java.util.Scanner;

public class testeContaBancaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContaBancaria contaBancaria = new ContaBancaria(1000);
        double valor;
        
        System.err.println("Informe um valor a sacar da conta: ");
        valor = sc.nextDouble();

        try{
            contaBancaria.sacar(valor);
        }
        catch(SaldoInsuficienteException e){
            e.printStackTrace();
        }
        sc.close();
    }
    
}
