package dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.EnderecoModel;
import model.EnderecoModel;

public class EnderecoDao {

    private Connection conexao = null;

    public EnderecoDao() throws SQLException {
        this.conexao = Conexao.getConexao();
    }

    public void adicionarEnd(EnderecoModel endereco) throws SQLException {
        String sql = "INSERT INTO ENDERECO (END_RUA, END_NUMERO, END_CIDADE, END_ESTADO, END_CEP)" 
                + " VALUES ( ?, ?, ?, ?, ?)";
                
                        
        PreparedStatement stm = conexao.prepareStatement(sql);
 
        stm.setString(1, endereco.getEND_RUA());
        stm.setString(2, endereco.getEND_NUMERO());
        stm.setString(3, endereco.getEND_CIDADE());
        stm.setString(4, endereco.getEND_ESTADO());
        stm.setString(5, endereco.getEND_CEP());
        

        stm.execute();
        stm.close();
    }

    public void alterarEnd(EnderecoModel endereco) throws SQLException {
        String sql = "UPDATE ENDERECO SET END_RUA = ?, END_NUMERO = ?, "
                + "END_CIDADE = ?, END_ESTADO = ?, END_CEP = ?, WHERE END_ID = ?";
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setString(1, endereco.getEND_RUA());
        stm.setString(2, endereco.getEND_NUMERO());
        stm.setString(3, endereco.getEND_CIDADE());
        stm.setString(4, endereco.getEND_ESTADO());
        stm.setString(5, endereco.getEND_CEP());
        stm.execute();
        stm.close();
    }

    public void excluirEnd(EnderecoModel endereco) throws SQLException {
        String sql = "DELETE FROM ENDERECO WHERE END_ID = ?";
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setInt(1, endereco.getEND_ID());
        stm.execute();
        stm.close();
    }

    public ArrayList<EnderecoModel> consultarEnd(String condicao) throws SQLException {
        ArrayList<EnderecoModel> lista = null;
        PreparedStatement stm;
        ResultSet rs;
        String sql = "SELECT * FROM ENDERECO";
        if (!condicao.equals("")) {
            sql += " where " + condicao;
        }
        stm = conexao.prepareStatement(sql);
        rs = stm.executeQuery();
        lista = new ArrayList<>();

        while (rs.next()) {
            EnderecoModel objusu = new EnderecoModel();
            objusu.setEND_ID(rs.getInt("END_ID"));
            objusu.setEND_RUA(rs.getString("END_RUA"));
            objusu.setEND_NUMERO(rs.getString("END_NUMERO"));
            objusu.setEND_CIDADE(rs.getString("END_CIDADE"));
            objusu.setEND_ESTADO(rs.getString("END_ESTADO"));
            objusu.setEND_CEP(rs.getString("END_CEP"));
            lista.add(objusu);
        }
        rs.close();
        stm.close();
        return lista;
    }
}
