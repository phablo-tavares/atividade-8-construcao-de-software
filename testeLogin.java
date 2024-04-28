import java.util.Scanner;

public class testeLogin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String usuario;
        String senha;
        Login login = new Login();

        System.err.print("Usuario: ");
        usuario = sc.nextLine();
        System.err.print("Senha: ");
        senha = sc.nextLine();

        try{
            login.fazer_login(usuario, senha);
        }
        catch(LoginInvalidoException e){
            e.printStackTrace();
        }

        sc.close();
    }
    
}
