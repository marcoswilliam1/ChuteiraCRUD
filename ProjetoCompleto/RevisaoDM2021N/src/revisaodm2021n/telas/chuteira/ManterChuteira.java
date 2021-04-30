package revisaodm2021n.telas.chuteira;

import java.sql.SQLException;
import java.util.List;

import javax.swing.JOptionPane;

import revisaodm2021n.dados.Chuteira;
import revisaodm2021n.controles.ControleChuteira;


public class ManterChuteira {

	static int id;
	static String nome;
	static String quant;
	static String valor;
	static String cor;
	static String marca;
	static String estilo;
	static String tamanho;
	
	static ControleChuteira contChu;
	
	public static void Inserir() throws SQLException, ClassNotFoundException {
		nome = JOptionPane.showInputDialog("NOME");
		quant = JOptionPane.showInputDialog("QUANTIDADE");
		valor = JOptionPane.showInputDialog("VALOR");
		cor = JOptionPane.showInputDialog("COR");
		marca = JOptionPane.showInputDialog("MARCA");
		estilo = JOptionPane.showInputDialog("ESTILO");
		tamanho = JOptionPane.showInputDialog("TAMANHO");
		
		Chuteira cEntrada = new Chuteira(nome,quant,valor,cor,marca,estilo,tamanho);
		contChu = new ControleChuteira();
		Chuteira cSaida = contChu.inserir(cEntrada);
                JOptionPane.showMessageDialog(null,cSaida.toString());
		
				
	}
	
	public static void Alterar() throws SQLException, ClassNotFoundException {
		nome = JOptionPane.showInputDialog("NOME");
		quant = JOptionPane.showInputDialog("QUANTIDADE");
		valor = JOptionPane.showInputDialog("VALOR");
		cor = JOptionPane.showInputDialog("COR");
		marca = JOptionPane.showInputDialog("MARCA");
		estilo = JOptionPane.showInputDialog("ESTILO");
		tamanho = JOptionPane.showInputDialog("TAMANHO");
		
		Chuteira cEntrada = new Chuteira(nome,quant,valor,cor,marca,estilo,tamanho);
		contChu = new ControleChuteira();
		Chuteira cSaida = contChu.inserir(cEntrada);
        JOptionPane.showMessageDialog(null,cSaida.toString());
		

	}
	
	public static void Listar() throws SQLException, ClassNotFoundException {
		nome = JOptionPane.showInputDialog("NOME");
        Chuteira cEntrada = new Chuteira(nome);
        contChu = new ControleChuteira();
        List<Chuteira> clSaida = contChu.listar(cEntrada);
        JOptionPane.showMessageDialog(null,clSaida.get(0).toString());
        }
	
	public static void Buscar() throws SQLException, ClassNotFoundException {
        id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        Chuteira cEntrada = new Chuteira(id);
        contChu = new ControleChuteira();
        Chuteira cSaida = contChu.buscar(cEntrada);
        JOptionPane.showMessageDialog(null,cSaida.toString());
    }

    public static void Excluir() throws SQLException, ClassNotFoundException {
        id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        Chuteira cEntrada = new Chuteira(id);
        contChu = new ControleChuteira();
        Chuteira cSaida = contChu.excluir(cEntrada);
        JOptionPane.showMessageDialog(null,cSaida.toString());
    }
}
