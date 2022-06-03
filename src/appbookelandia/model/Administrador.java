package appbookelandia.model;


public class Administrador extends Funcionario {
    
    private Login login;
    
    public Administrador (){
        super("Administrador");
    }

    /**
     * @return the login
     */
    public Login getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(Login login) {
        this.login = login;
    }
    
    
}
