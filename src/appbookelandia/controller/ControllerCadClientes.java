/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appbookelandia.controller;

import appbookelandia.dal.ClienteDAO;
import appbookelandia.model.Cliente;
import appbookelandia.model.Login;
import appbookelandia.model.NivelDeAcesso;
import appbookelandia.view.FrmCadClientes;
import java.sql.SQLException;
import javax.swing.JOptionPane;



public class ControllerCadClientes {
    
    private FrmCadClientes view;

    public ControllerCadClientes(FrmCadClientes view) {
        this.view = view;
    }
    
    public void cadastrarClientes(){
        Cliente cliente = new Cliente();
        
        cliente.setCpf(view.getTxtCpf().getText());
        cliente.setNome(view.getTxtNome().getText());
        cliente.setEndereco(view.getTxtEnd().getText());
        cliente.setTelefone(view.getTxtTelefone().getText());
        
        
        Login login = new Login();
        login.setEmail(view.getTxtEmail().getText());
        login.setSenha(view.getTxtSenha().getPassword().toString());
        login.setNivelAcesso(NivelDeAcesso.Cliente);
        login.setStatus(true);
    }
 
    public void limparTela(){
        view.getTxtCpf().setText("");
        view.getTxtNome().setText("");
        view.getTxtEnd().setText("");
        view.getTxtTelefone().setText("");
        view.getTxtSenha().setText("");
        view.getTxtEmail().setText("");
    }
    
    public void consultaCliente() throws SQLException{
        
        String cpf = view.getTxtCpf().getText();
        ClienteDAO clienteDao = new ClienteDAO();
        Cliente cliente = clienteDao.recupera(cpf);
        
        if (cliente != null){
            view.getTxtNome().setText(cliente.getNome());
            view.getTxtEnd().setText(cliente.getEndereco());
            view.getTxtTelefone().setText(cliente.getTelefone());
            view.getTxtEmail().setText(cliente.getEmail());
        }
    }
}
