package appbookelandia.dal;

import appbookelandia.model.Cliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

public class ClienteDAO implements ICrud<Cliente> {
    
    private Conexao conexao;
    
    public ClienteDAO(){
        this.conexao = new Conexao();
    }

    @Override
    public Cliente recupera(String id) throws SQLException {
        //CRIA STRING DE CONSULTA
        String sql = "select cpf, nome, endereco, telefone, dataDeCadastro from clientes where cpf = ?";
        //CRIA A DECLARAÇÃO SQL
        PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
        //INCLUI O PARÂMETRO DA CONSULTA NA DECLARAÇÃO (PARA CADA ? AUMENTA EM 1)
        ps.setString(1,id);
       //EXECUTA AÇÃO NO BANCO DE DADOS
        ps.execute();
        
        //ARMAZENA OS DADOS CONSULTADOS NO BANCO DE DADOS
        ResultSet resultado = ps.getResultSet();
        //MOVE O CURSOR DO BANCO DE DADOS PARA A PRÓXIMA LINHA (Qª DA TABELA
        resultado.next();
        
        //CRIA O OBJETO CLIENTE PARA SE PREENCHIDO COM OS DADOS DO BANCO DE DADOS
        Cliente c = new Cliente();
        c.setCpf(resultado.getString("cpf"));
        c.setNome(resultado.getString("nome"));
        c.setEndereco(resultado.getString("endereco"));
        c.setTelefone(resultado.getString("telefone"));
        //c.setDataDeCadastro();
        conexao.fecha();
        return c;
    }

    @Override
    public void adiciona(Cliente t) {
    }

    @Override
    public void altera(Cliente t) {
    }

    @Override
    public void exclui(Cliente t) {
    }


}
