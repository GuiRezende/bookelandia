package appbookelandia.model;


//Classe PAI : Funcionario
//Classe FILHA: Atendente
public class Atendente extends Funcionario{

    private Login login;
    
    public Atendente() {
        super("Atendente");
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
