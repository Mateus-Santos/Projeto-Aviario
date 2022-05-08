package uniftc.projeto;

//Classe onde os dados da pessoa fisica ficarão cadastrados

public abstract class Pessoa {
    protected int id_pessoa;
    protected String nome;
    protected String email;
    
    protected Pessoa(String nome, String email){
        this.nome = nome;
        this.email = email;
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
