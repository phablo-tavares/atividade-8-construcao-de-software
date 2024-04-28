import java.util.InputMismatchException;
import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1;
        int n2;
        int result;
        try{
            n1 = sc.nextInt();
            n2 = sc.nextInt();
            result = (int)n1/n2;
            System.out.println("Resultado da divisão: "+ result);
        }
        catch( ArithmeticException e ){
            System.out.println("Não pode dividir por 0");
        }
        catch( InputMismatchException e){
            System.out.println("Valor não numérico informado");
        }
        sc.close();
    }
}