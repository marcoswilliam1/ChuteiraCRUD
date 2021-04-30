package revisaodm2021n.controles;

import revisaodm2021n.dados.Chuteira;
import java.sql.SQLException;
import java.util.List;

import revisaodm2021n.modelos.DaoChuteira;

public class ControleChuteira {
	
	static DaoChuteira daoC;
	
	 public ControleChuteira() throws SQLException, ClassNotFoundException {
		 daoC = new DaoChuteira();
	    }

	    public Chuteira inserir(Chuteira chEntrada) throws SQLException {
	        return daoC.inserir(chEntrada);
	    }

	    public List<Chuteira> listar(Chuteira chEntrada) throws SQLException {
	        return daoC.listar(chEntrada);
	    }

	    public Chuteira alterar(Chuteira chEntrada) throws SQLException {
	        return daoC.alterar(chEntrada);
	    }

	    public Chuteira buscar(Chuteira chEntrada) throws SQLException {
	        return daoC.buscar(chEntrada);
	    }

	    public Chuteira excluir(Chuteira chEntrada) throws SQLException {
	        return daoC.deleta(chEntrada);
	    }
}
