package dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.ClienteModel;

public class ClienteDao {

    private Connection conexao = null;

    public ClienteDao() throws SQLException {
        this.conexao = Conexao.getConexao();
    }

    public void adicionar(ClienteModel cliente) throws SQLException {
        String sql = "INSERT INTO CLIENTE (CLI_NOME, CLI_CPF, CLI_EMAIL, CLI_DDD, CLI_TELEFONE)"
                + " VALUES ( ?, ?, ?, ?, ?)";
        PreparedStatement stm = conexao.prepareStatement(sql);
 
        stm.setString(1, cliente.getCLI_NOME());
        stm.setString(2, cliente.getCLI_CPF());
        stm.setString(3, cliente.getCLI_EMAIL());
        stm.setString(4, cliente.getCLI_DDD());
        stm.setString(5, cliente.getCLI_TELEFONE());
        stm.execute();
        stm.close();
    }

    public void alterar(ClienteModel cliente) throws SQLException {
        String sql = "UPDATE CLIENTE SET CLI_NOME = ?, USU_LOGIN = ?, "
                + "USU_SENHA = ?, USU_ATIVO = ? WHERE USU_ID = ?";
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setString(1, cliente.getCLI_NOME());
        stm.setString(2, cliente.getCLI_CPF());
        stm.setString(3, cliente.getCLI_EMAIL());
        stm.setString(4, cliente.getCLI_DDD());
        stm.setString(5, cliente.getCLI_TELEFONE());
        stm.execute();
        stm.close();
    }

    public void excluir(ClienteModel cliente) throws SQLException {
        String sql = "DELETE FROM CLIENTE WHERE CLI_ID = ?";
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setInt(1, cliente.getCLI_ID());
        stm.execute();
        stm.close();
    }

    public ArrayList<ClienteModel> consultar(String condicao) throws SQLException {
        ArrayList<ClienteModel> lista = null;
        PreparedStatement stm;
        ResultSet rs;
        String sql = "SELECT * FROM CLIENTE";
        if (!condicao.equals("")) {
            sql += " where " + condicao;
        }
        stm = conexao.prepareStatement(sql);
        rs = stm.executeQuery();
        lista = new ArrayList<>();

        while (rs.next()) {
            ClienteModel objusu = new ClienteModel();
            objusu.setCLI_ID(rs.getInt("CLI_ID"));
            objusu.setCLI_NOME(rs.getString("CLI_NOME"));
            objusu.setCLI_CPF(rs.getString("CLI_CPF"));
            objusu.setCLI_EMAIL(rs.getString("CLI_EMAIL"));
            objusu.setCLI_DDD(rs.getString("CLI_DDD"));
            objusu.setCLI_TELEFONE(rs.getString("CLI_TELEFONE"));
            lista.add(objusu);
        }
        rs.close();
        stm.close();
        return lista;
    }
}
