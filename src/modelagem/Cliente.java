package modelagem;

//Bibliotecas para formatar e inserir dados do tipo data.

public class Cliente extends Pessoa {
	
	private static final long serialVersionUID = 1L;
	
	private int id_cliente;
	private String data_cadastro;

	public Cliente(String data_cadastro, String nome, String email, String endereco, String cpf) {
		super(nome, email, endereco, cpf);
		this.data_cadastro = data_cadastro;
	}
	

	public int getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}

	public String getData_cadastro() {
		return data_cadastro;
	}

	public void setData_cadastro(String data_cadastro) {
		this.data_cadastro = data_cadastro;
	}

	public int getId_pessoa() {
		return id_pessoa;
	}

	public void setId_pessoa(int id_pessoa) {
		this.id_pessoa = id_pessoa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
