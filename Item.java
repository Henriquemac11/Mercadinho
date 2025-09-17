
public class Item { //estamos criando a classe Item e seus atributos
	private String nome;
	private double preco;
	private int codigo;
	
	// Construtor
	public Item(String nome, double preco, int codigo) { 
		this.nome = nome;
		this.preco = preco;
		this.codigo = codigo;
	}

	//getters e setters : usados para acessar e modificar atributos privados de uma classe de forma controlada e segura.
	public String getNome() {
		return nome;
	} // pega o valor do atributo e retorna o valor atual

	public void setNome(String nome) {
		this.nome = nome;
	} // define ou altera o valor do atributo

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public void apresentar() {
		System.out.println("Nome do Item:" + nome + "R$: " + preco + "Código Item: " + codigo);
	}
	
}
