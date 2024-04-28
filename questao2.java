import java.util.InputMismatchException;
import java.util.Scanner;

public class questao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vetor[] = new int[10];
        int entradaUsuario = -1;
        int i = 0;
        try{

            for( ; entradaUsuario != 0; i++){
                System.err.print("Informe um valor para guardar no vetor: ");
                entradaUsuario = sc.nextInt();
                vetor[i] = entradaUsuario;
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.err.println("Não é possível informar mais do que 10 valores! ");
        }
        catch(InputMismatchException e){
            System.err.println("Valor não numérico não é permitido!");
        }
        finally{
            System.err.print("Vetor: ");
            for(int k = 0; k<10 ; k++){
                System.err.print(vetor[k]+" ");
                if (vetor[k] == 0)
                    break;
            }
            System.err.println();
        }
            

        sc.close();
    }
}
