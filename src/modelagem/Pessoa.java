package modelagem;

import java.io.Serializable;

//Classe onde os dados da pessoa fisica ficarão cadastrados

public abstract class Pessoa implements Serializable {

	private static final long serialVersionUID = 1L;
	
	protected int id_pessoa;
    protected String nome;
    protected String email;
    protected String endereco;
    protected String cpf;
    
    protected Pessoa(String nome, String email, String endereco, String cpf){
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.endereco = endereco;
    }
    
    
    
    public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	protected int getId_pessoa(){
        return this.id_pessoa;
    }
    
    protected void setId_pessoa(int id){
        this.id_pessoa = id;
    }
    
    protected String getNome(){
        return this.nome;
    }

    protected void setNome(String name){
        this.nome = name;
    }
    
    protected String getEmail(){
        return this.email;
    }
    
    public void setEmail(String em){
        this.email = em;
    }
}
