package appbookelandia.controller;

import appbookelandia.model.Login;
import appbookelandia.view.FrmLogin;

public class ControllerLogin {
    private FrmLogin view;
    
    public ControllerLogin(FrmLogin view){
        this.view = view;
    }
    
    public void consultarLogin(){
        
        Login login = new Login();
        login.setEmail(view.getTxtEmail().getText());
        login.setSenha(view.getTxtSenha().getPassword().toString());
    }
}
