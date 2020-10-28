package controller;

import dao.EnderecoDao;
import dao.EnderecoDao;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.EnderecoModel;

public class EnderecoController {

    private List<EnderecoModel> listaenderecos;

    public ArrayList<EnderecoModel> consultar(String filtro) throws SQLException {
        listaenderecos = new EnderecoDao().consultarEnd(filtro);
        return (ArrayList<EnderecoModel>) listaenderecos;
    }

    public void excluirEnd(EnderecoModel endereco) throws SQLException {
        EnderecoDao dao = new EnderecoDao();
        dao.excluirEnd(endereco);
    }

    public void adicionarEnd(EnderecoModel endereco) throws SQLException {
        EnderecoDao dao = new EnderecoDao();
        dao.adicionarEnd(endereco);
    }

    public void alterarEnd(EnderecoModel endereco) throws SQLException {
        EnderecoDao dao = new EnderecoDao();
        dao.alterarEnd(endereco);
    }

    public void gravarEnd(String operacao, EnderecoModel endereco) throws SQLException {
        boolean retorno = true;
        if (operacao.equals("incluir")) {
            adicionarEnd(endereco);
        } else if (operacao.equals("alterar")) {
            alterarEnd(endereco);
        }
    }
    
}
