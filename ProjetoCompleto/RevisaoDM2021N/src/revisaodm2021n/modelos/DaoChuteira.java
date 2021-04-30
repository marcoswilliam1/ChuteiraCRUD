package revisaodm2021n.modelos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import revisaodm2021n.dados.Chuteira;
import revisaodm2021n.util.ConexaoDb;

	public class DaoChuteira {
	// variavel que armazena a conexão
    private final Connection c;
    
    public DaoChuteira() throws SQLException, ClassNotFoundException{
        this.c = new ConexaoDb().getConnection();
    }
    
    
    public Chuteira buscar (Chuteira chu) throws SQLException {
        String sql = "select * from chu_chuteira WHERE chu_id = ?";
        Chuteira retorno;
        // seta os valores
        try (PreparedStatement stmt = this.c.prepareStatement(sql)) {
            // seta os valores
            stmt.setInt(1,chu.getId());
            // executa
            ResultSet rs = stmt.executeQuery();
            retorno = null;
            while (rs.next()) {
                // criando o objeto Usuario
                retorno = new Chuteira(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8));                        ;
               
            }
        }
        c.close();
        return retorno;
    }

    public Chuteira inserir (Chuteira chu) throws SQLException {
        String sql = "insert into chu_chuteira" + " (chu_nome,chu_quant,chu_valor,chu_cor,chu_marca,chu_estilo,chu_tamanho)" + " values (?,?,?,?,?,?,?)";
   
        // seta os valores
        try ( // prepared statement para inserção
            PreparedStatement stmt = c.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS)) {
            // seta os valores
            stmt.setString(1,chu.getNome());
            stmt.setString(2,chu.getQuant());
            stmt.setString(3,chu.getValor());
            stmt.setString(4,chu.getCor());
            stmt.setString(5,chu.getMarca());
            stmt.setString(6,chu.getEstilo());
            stmt.setString(7,chu.getTamanho());
            // executa
            stmt.executeUpdate();
            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                int id = rs.getInt(1);
                chu.setId(id);
            }
        }
        c.close();
        return chu;
    }
    
    public Chuteira alterar (Chuteira chu) throws SQLException {
    	String sql = "UPDATE chu_chuteira SET chu_nome = ?,chu_quant = ?,chu_valor = ?,chu_cor = ?,chu_marca = ?,chu_estilo = ?,chu_tamanho = ? WHERE pes_id = ?";
    	
    	// seta os valores
    	try ( // prepared statement para inserção
    			PreparedStatement stmt = c.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS)) {
    		// seta os valores
    		stmt.setString(1,chu.getNome());
    		stmt.setString(2,chu.getQuant());
    		stmt.setString(3,chu.getValor());
    		stmt.setString(4,chu.getCor());
    		stmt.setString(5,chu.getMarca());
    		stmt.setString(6,chu.getEstilo());
    		stmt.setString(7,chu.getTamanho());
    		stmt.setInt(8,chu.getId());
    		// executa
    		stmt.execute();
    	}
    	
    	return chu;
    }

    public Chuteira deleta (Chuteira chu) throws SQLException {
        String sql = "delete chu_chuteira WHERE pes_id = ?";
       // seta os valores
       // prepared statement para inserção
       try (PreparedStatement stmt = c.prepareStatement(sql)) {
           // seta os valores
           stmt.setInt(1,chu.getId());
           // executa
           stmt.execute();
       }
       c.close();
       return chu;
   }


    public List<Chuteira> listar (Chuteira chu) throws SQLException {
         // usus: array armazena a lista de registros
        List<Chuteira> chut = new ArrayList<>();
       
        String sql = "select * from chu_chuteira where chu_nome like ?";
        // seta os valores
        try (PreparedStatement stmt = this.c.prepareStatement(sql)) {
            // seta os valores
            stmt.setString(1,"%" + chu.getNome()+ "%");
            
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                // criando o objeto Usuario
                Chuteira pSaida = new Chuteira(
                		rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8)); 
                // adiciona o usu à lista de usus
                chut.add(pSaida);
            }
            
            rs.close();
        }
        return chut;
    }
}
