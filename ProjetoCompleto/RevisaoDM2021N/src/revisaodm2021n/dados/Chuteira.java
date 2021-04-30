package revisaodm2021n.dados;

public class Chuteira {
	
int id;
	String nome;
	String quant;
	String valor;
	String cor;
	String marca;
	String estilo;
	String tamanho;
	
	
	
	public Chuteira(String nome) {

		this.nome = nome;
	}



	public Chuteira(int id) {
	
		this.id = id;
	}



	public Chuteira(String nome, String quant, String valor, String cor, String marca, String estilo,
			String tamanho) {
		
		this.nome = nome;
		this.quant = quant;
		this.valor = valor;
		this.cor = cor;
		this.marca = marca;
		this.estilo = estilo;
		this.tamanho = tamanho;
	}



	public Chuteira(int id, String nome, String quant, String valor, String cor, String marca, String estilo,
			String tamanho) {
		
		this.id = id;
		this.nome = nome;
		this.quant = quant;
		this.valor = valor;
		this.cor = cor;
		this.marca = marca;
		this.estilo = estilo;
		this.tamanho = tamanho;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getQuant() {
		return quant;
	}



	public void setQuant(String quant) {
		this.quant = quant;
	}



	public String getValor() {
		return valor;
	}



	public void setValor(String valor) {
		this.valor = valor;
	}



	public String getCor() {
		return cor;
	}



	public void setCor(String cor) {
		this.cor = cor;
	}



	public String getMarca() {
		return marca;
	}



	public void setMarca(String marca) {
		this.marca = marca;
	}



	public String getEstilo() {
		return estilo;
	}



	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}



	public String getTamanho() {
		return tamanho;
	}



	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}



	@Override
	public String toString() {
		return "Departamento [id=" + id + ", nome=" + nome + ", quant=" + quant + ", valor=" + valor + ", cor=" + cor
				+ ", marca=" + marca + ", estilo=" + estilo + ", tamanho=" + tamanho + "]";
	}
	
	
	
}
