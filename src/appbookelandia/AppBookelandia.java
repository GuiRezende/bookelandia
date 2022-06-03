package appbookelandia;

import appbookelandia.view.FrmLogin;
import appbookelandia.view.FrmPrincipal;
/*
Model = Classes
View = Front ~ (INTERFACE GRÁFICA QUE AGE COM O CONTROLLER)
Controller = (RESGISTRA OS EVENTOS DO USUÁRIO - COMUNICA COM O BANCO DE DADOS)
*/

public class AppBookelandia {

    public static void main(String[] args) {
        FrmLogin frm = new FrmLogin();
        frm.setVisible(true);
        
        
    }
}
