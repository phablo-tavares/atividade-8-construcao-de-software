public class Login {
    private String usuario = "phablo";
    private String senha = "12345678";

    public boolean fazer_login(String usuario, String senha){
        if (!this.usuario.equals(usuario)|| !this.senha.equals(senha)){
            throw new LoginInvalidoException("usuário ou senha inválidos");
        }
        return true;
    }
}
